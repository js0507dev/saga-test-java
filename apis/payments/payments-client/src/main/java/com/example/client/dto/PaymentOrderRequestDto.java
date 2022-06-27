package com.example.client.dto;

import com.example.client.PaymentMethod;
import com.example.client.config.ValueOfEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class PaymentOrderRequestDto {
  @NotNull
  private String transactionId;
  @NotNull
  private Long orderId;
  @NotNull
  private Long userId;
  @NotNull
  @Min(0)
  private Long amount;
  @NotNull
  @ValueOfEnum(enumClass = PaymentMethod.class)
  private String paymentMethod;
  @Pattern(regexp = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}")
  private String cardNumber;
}
