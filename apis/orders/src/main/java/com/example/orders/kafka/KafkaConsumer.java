package com.example.orders.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  @KafkaListener(topics = "order", groupId = "order")
  public void consume(String message) {
    System.out.println(String.format("Consumed message : %s", message));
  }
}
