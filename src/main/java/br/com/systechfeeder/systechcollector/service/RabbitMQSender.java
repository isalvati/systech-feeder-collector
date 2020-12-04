package br.com.systechfeeder.systechcollector.service;

import br.com.systechfeeder.systechcollector.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

    private final AmqpTemplate rabbitTemplate;

    @Value("${systech.rabbitmq.exchange}")
    private String exchange;

//    @Value("${systech.rabbitmq.routingkey}")
//    private String routingkey;

    @Value("${systech.rabbitmq.routingkey.animal.weight}")
    private String ANIMAL_WEIGHT_routingkey;

    @Autowired
    public RabbitMQSender(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(Employee company) {
        rabbitTemplate.convertAndSend(exchange, ANIMAL_WEIGHT_routingkey, company);
        System.out.println("Send msg = " + company);

    }
}
