package com.example.orders.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "my")
public class CustomEnvironment {
  private SagaPatternEnvironment sagaPattern;
}
