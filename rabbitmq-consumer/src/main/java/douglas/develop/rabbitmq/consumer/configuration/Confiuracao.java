package douglas.develop.rabbitmq.consumer.configuration;

import douglas.develop.repository.MessageRepository;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confiuracao {

    @Bean
    public ModelMapper metodoQueCriaUmModelMapper(){
        return new ModelMapper();
    }

}
