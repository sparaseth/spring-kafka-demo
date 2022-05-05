package com.skptech.kafka.sender;

import com.skptech.kafka.model.MessageRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender {

    @Value("${kafka.skptech.topic}")
    private String kafkaTopic;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaSender(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessages(MessageRequest messageRequest) {
        kafkaTemplate.send(kafkaTopic, messageRequest.getMessage());
    }

}
