package com.djaytech.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "djaytech", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
        // Process the received message
    }
}
