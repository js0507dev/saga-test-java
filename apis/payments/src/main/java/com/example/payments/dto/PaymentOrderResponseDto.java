package com.example.payments.dto;

import com.example.payments.entities.PaymentMethod;
import com.example.payments.entities.PaymentStatus;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class PaymentOrderResponseDto extends defaultResponseDto {
  private Long id;
  private Long orderId;
  private Long userId;
  private Long amount;
  private String paymentMethod;
  private String cardNumber;
  private String status;
}
