package com.example.payments.controllers;

import com.example.client.dto.PaymentOrderRequestDto;
import com.example.client.dto.PaymentOrderResponseDto;
import com.example.payments.entities.Payment;
import com.example.payments.mapper.PaymentOrderDtoMapper;
import com.example.payments.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/payments")
public class PaymentController {
  private PaymentService paymentService;

  @GetMapping("/{id}")
  public Payment test(@PathVariable Long id) {
    return this.paymentService.findOne(id);
  }

  @PostMapping()
  public ResponseEntity<PaymentOrderResponseDto> paymentOrder(@RequestBody @Valid PaymentOrderRequestDto requestDto) {
    Payment createPayment = PaymentOrderDtoMapper.INSTANCE.entityFromRequestDto(requestDto);
    Payment saved = paymentService.createPayment(createPayment);
    PaymentOrderResponseDto responseDto = PaymentOrderDtoMapper.INSTANCE.entityToResponseDto(saved);
    return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
  }
}
