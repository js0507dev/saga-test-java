package com.example.orders.saga.config;

import java.util.List;

public interface Workflow {
  List<WorkflowStep> getSteps();
}
