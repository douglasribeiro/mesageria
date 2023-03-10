package douglas.develop.rabbitmq.consumer.service;


import douglas.develop.model.MessageDto;

public interface ConsumerService {
    void  action(MessageDto messageDto);
}
