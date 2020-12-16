package br.com.systechfeeder.systechcollector.service;

import br.com.systechfeeder.systechcollector.dto.SensorDataDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class SensorDataReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(SensorDataReceiver.class);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final SensorDataService sensorDataService;

    @Autowired
    public SensorDataReceiver(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    @RabbitListener(queues = "systech.queue.sensor")
    public void consumer(Message message) {
        String json = new String(message.getBody(), StandardCharsets.UTF_8);
        SensorDataDTO sensorDataDTO;

        try {
            sensorDataDTO = OBJECT_MAPPER.readValue(json, SensorDataDTO.class);
            sensorDataDTO.setMoment(message.getMessageProperties().getReceivedRoutingKey());
            LOGGER.debug("Cluster Id: [" + message.getMessageProperties().getClusterId() + "]");
            LOGGER.debug("RoutingKey (MQTT TOPIC): [" + message.getMessageProperties().getReceivedRoutingKey() + "]");
            LOGGER.debug("Queue: [" + message.getMessageProperties().getConsumerQueue() + "]");
            LOGGER.debug("ReceivedExchange: [" + message.getMessageProperties().getReceivedExchange() + "]");
            LOGGER.debug("MessageBody");
            LOGGER.debug(new String(message.getBody()));
            sensorDataService.saveSensorData(sensorDataDTO);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }
}
