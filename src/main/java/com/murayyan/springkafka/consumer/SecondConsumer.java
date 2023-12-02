package com.murayyan.springkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SecondConsumer {
    @KafkaListener(topics = "MURAYYAN.TOPIC", groupId = "group2")
    void listener(String data) {
        System.out.println("I'm listening from group 2: " + data);
    }
}
