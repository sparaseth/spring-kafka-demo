package com.skptech.kafka.listener;

import org.springframework.stereotype.Component;

import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "skptech", groupId = "skptech-group")
    void listener(String data) {
        System.out.println("Listener received data: " + data + "");
    }

}
