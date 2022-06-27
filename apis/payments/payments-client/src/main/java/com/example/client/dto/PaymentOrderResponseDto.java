package com.example.client.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
