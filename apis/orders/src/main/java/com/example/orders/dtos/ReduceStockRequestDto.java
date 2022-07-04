package com.example.orders.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReduceStockRequestDto {
  @NotNull
  private String transactionId;
  @NotNull
  private Long orderId;
  @NotNull
  @Min(1)
  private Long quantity;
}
