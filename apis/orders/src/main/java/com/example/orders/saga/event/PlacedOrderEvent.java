package com.example.orders.saga.event;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
public class PlacedOrderEvent {
  private String transactionId;
  private String orderId;
  private Long amount;
  private Long quantity;
}
