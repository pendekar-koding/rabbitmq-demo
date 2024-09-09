package com.pendekar.rabbitmqdemo.service;

import com.pendekar.rabbitmqdemo.config.RabbitMqConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQReceiver {
    public static final Logger logger = LogManager.getLogger(RabbitMQReceiver.class.getName());

    @RabbitListener(queues = RabbitMqConfig.QUEUE_NAME)
    public void receive(Object message) {
        logger.info(message);
        // You can cast 'message' to a specific object type if needed.
    }
}
