package douglas.develop.rabbitmq.consumer.service.impl;

import douglas.develop.model.Message;
import douglas.develop.model.MessageDto;
import douglas.develop.rabbitmq.consumer.service.ConsumerService;
import douglas.develop.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ConsumerServiceImpl implements ConsumerService {

    private final ModelMapper modelMapper;

    private final MessageRepository messageRepository;

    @Override
    public void action(MessageDto messageDto) {
        Message message = modelMapper.map(messageDto, Message.class) ;
        messageRepository.save(message);
        log.info("----------------------------------------------");
        log.info(message.getId().toString());
        log.info(message.getNome());
        log.info(message.getData().toString());
        log.info(message.getProc());
        log.info("----------------------------------------------");
        log.info("Registro Salva.");
    }
}
