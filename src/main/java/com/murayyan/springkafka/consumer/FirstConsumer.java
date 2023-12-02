package com.murayyan.springkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class FirstConsumer {
    @KafkaListener(topics = "MURAYYAN.TOPIC", groupId = "group1")
    void listener(String data) {
        System.out.println("I'm listening from group 1: " + data);
    }
}
