package com.skptech.kafka.controller;

import com.skptech.kafka.model.MessageRequest;
import com.skptech.kafka.sender.KafkaSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    private final KafkaSender kafkaSender;

    public MessageController(KafkaSender kafkaSender) {
        this.kafkaSender = kafkaSender;
    }

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest) {
        kafkaSender.sendMessages(messageRequest);
    }

}
