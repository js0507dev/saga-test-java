package com.example.payments.controllers;

import com.example.payments.entities.Payment;
import com.example.payments.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/payments")
public class PaymentController {
  private PaymentService paymentService;

  @GetMapping("/{id}")
  public Payment test(@PathVariable Long id) {
    return this.paymentService.findOne(id);
  }
}
