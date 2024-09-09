package com.pendekar.rabbitmqdemo.controller;

import com.pendekar.rabbitmqdemo.model.MyMessage;
import com.pendekar.rabbitmqdemo.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private RabbitMQSender rabbitMQSender;

    @PostMapping("/send")
    public String sendMessage(@RequestBody MyMessage message) {
        rabbitMQSender.send(message);
        return "Message sent to RabbitMQ";
    }
}
