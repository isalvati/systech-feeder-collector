package br.com.systechfeeder.systechcollector.service;

import br.com.systechfeeder.systechcollector.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class Receiver {

    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @RabbitListener(queues = "systech.queue.sensor")
    public void consumer(Message message) {
        String json = new String(message.getBody(), StandardCharsets.UTF_8);
        Employee employee;
        try {
            employee = OBJECT_MAPPER.readValue(json, Employee.class);
            logger.debug(employee.toString());
            logger.debug(new String(message.getBody()));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}
