package com.example.orders.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SagaPatternEnvironment {
  private Boolean useChoreography;
  private Boolean useOchestration;
}
