package com.example.orders.saga.step;

import com.example.orders.saga.config.WorkflowStep;
import com.example.orders.saga.config.WorkflowStepStatus;
import reactor.core.publisher.Mono;

public class PaymentStep implements WorkflowStep {
  private //
  public PaymentStep() {
    //
  }

  @Override
  public WorkflowStepStatus getStatus() {
    return null;
  }

  @Override
  public Mono<Boolean> process() {
    return null;
  }

  @Override
  public Mono<Boolean> revert() {
    return null;
  }
}
