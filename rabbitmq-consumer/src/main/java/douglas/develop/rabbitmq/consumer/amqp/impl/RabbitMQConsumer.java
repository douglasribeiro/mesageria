package douglas.develop.rabbitmq.consumer.amqp.impl;

import douglas.develop.model.MessageDto;
import douglas.develop.rabbitmq.consumer.amqp.AmqpConsumer;
import douglas.develop.rabbitmq.consumer.service.ConsumerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer implements AmqpConsumer<MessageDto> {

    @Autowired
    private ConsumerService consumerService;

    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
    public void consumer(MessageDto messageDto) {
        consumerService.action(messageDto);
    }

}
