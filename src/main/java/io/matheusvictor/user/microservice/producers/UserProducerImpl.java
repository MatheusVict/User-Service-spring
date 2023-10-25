package io.matheusvictor.user.microservice.producers;

import io.matheusvictor.user.microservice.domain.user.User;
import io.matheusvictor.user.microservice.domain.user.dto.EmailDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducerImpl implements UserProducer {
    final RabbitTemplate rabbitTemplate;

    public UserProducerImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value("${broker.queue.email.name}")
    private String routingKey;

    public void publishMessageEmail(User user) {
        String subject = "Cadastro realizado com sucesso!";
        EmailDTO emailDTO = new EmailDTO(
                user.getUserId(),
                user.getEmail(),
                subject,
                "Olá, " + user.getName() + "! Seu cadastro foi realizado com sucesso!"
        );

        rabbitTemplate.convertAndSend("", routingKey, emailDTO);
    }
}
