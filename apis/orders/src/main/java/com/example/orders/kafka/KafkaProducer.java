package com.example.orders.kafka;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
@AllArgsConstructor
public class KafkaProducer {
  private static final String TOPIC = "order";
  private final KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage(String message) {
    System.out.println(String.format("produce message: %s", message));
    this.kafkaTemplate.send(TOPIC, message);
  }
}
