package br.com.systechfeeder.systechcollector.service;

import br.com.systechfeeder.systechcollector.dto.SensorDataDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class SensorDataReceiver {

    private static final Logger logger = LoggerFactory.getLogger(SensorDataReceiver.class);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @RabbitListener(queues = "systech.queue.sensor")
    public void consumer(Message message) {
        String json = new String(message.getBody(), StandardCharsets.UTF_8);
        SensorDataDTO sensorDataDTO;

        try {
            sensorDataDTO = OBJECT_MAPPER.readValue(json, SensorDataDTO.class);
            logger.debug("RoutingKey (MQTT TOPIC): [" + message.getMessageProperties().getReceivedRoutingKey() + "]");
            logger.debug("Queue: [" + message.getMessageProperties().getConsumerQueue() + "]");
            logger.debug("ReceivedExchange: [" + message.getMessageProperties().getReceivedExchange() + "]");
            logger.debug(new String(message.getBody()));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}
