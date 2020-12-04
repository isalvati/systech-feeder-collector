package br.com.systechfeeder.systechcollector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    @RabbitListener(queues = "systech.queue.sensor")
    public void consumer(Message message) {
        logger.debug(new String(message.getBody()));
    }
}
