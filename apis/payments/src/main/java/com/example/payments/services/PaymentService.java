package com.example.payments.services;

import com.example.payments.entities.Payment;
import com.example.payments.repositories.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
public class PaymentService {
  private PaymentRepository paymentRepository;

  public Payment findOne(Long id) {
    Payment payment = this.paymentRepository.findById(id).orElseThrow(NoSuchElementException::new);
    return payment;
  }
}
