package com.receive.receive.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {
    @RabbitListener(queues = "java_queue") // Use your defined queue name
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
        // You can add additional processing logic here
    }
}
