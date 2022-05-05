package com.skptech.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${kafka.skptech.topic}")
    private String kafkaTopic;

    @Bean
    public NewTopic skptechTopic() {
        return TopicBuilder.name(kafkaTopic).build();
    }

}
