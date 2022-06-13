package com.example.orders.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
  private Long id;
  private Long ordererUserId;
  private String ordererName;
  private String ordererPhoneNumber;
  private String ordererEmail;
  private String status;
}
