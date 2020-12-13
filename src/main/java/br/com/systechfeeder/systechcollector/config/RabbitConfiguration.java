package br.com.systechfeeder.systechcollector.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitConfiguration {

//    @Value("${systech.rabbitmq.queue}")
//    String queueName;
//
//    @Value("${systech.rabbitmq.exchange}")
//    String exchange;
//
//    @Value("${systech.rabbitmq.routingkey.animal.weight}")
//    private String routingkey;
//
//    @Bean
//    Queue queue() {
//        return new Queue(queueName, false);
//    }
//
//    @Bean
//    DirectExchange exchange() {
//        return new DirectExchange(exchange);
//    }
//
//    @Bean
//    Binding binding(Queue queue, DirectExchange exchange) {
//        return BindingBuilder.bind(queue).to(exchange).with(routingkey);
//    }
//
//    @Bean
//    public MessageConverter jsonMessageConverter() {
//        return new Jackson2JsonMessageConverter();
//    }
//
//
//    @Bean
//    public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
//        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//        rabbitTemplate.setMessageConverter(jsonMessageConverter());
//        return rabbitTemplate;
//    }
//
//    @Bean
//    public Exchange declareExchange() {
//        return ExchangeBuilder.directExchange(exchange)
//                .durable(true)
//                .build();
//    }
//
//    @Bean
//    public Queue declareQueue() {
//        return QueueBuilder.durable(queueName)
//                .build();
//    }
//
//    @Bean
//    public Binding declareBinding(Exchange exchange, Queue queue) {
//        return BindingBuilder.bind(queue)
//                .to(exchange)
//                .with(routingkey)
//                .noargs();
//    }

}
