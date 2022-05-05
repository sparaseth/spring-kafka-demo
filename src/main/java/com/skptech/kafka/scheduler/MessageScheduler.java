package com.skptech.kafka.scheduler;

import com.skptech.kafka.model.MessageRequest;
import com.skptech.kafka.sender.KafkaSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class MessageScheduler {

    private final KafkaSender kafkaSender;

    public MessageScheduler(KafkaSender kafkaSender) {
        this.kafkaSender = kafkaSender;
    }

    @Scheduled(fixedRate = 2000)
    public void sendMessages() {
        System.out.println("&&&&&&&& MessageScheduler->sendMessages Started &&&&&&&&");
        MessageRequest messageRequest = MessageRequest.builder().message("Hello, SkpTech").build();
        kafkaSender.sendMessages(messageRequest);
    }
}
