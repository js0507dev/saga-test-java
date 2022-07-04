package com.example.orders.feign;

import com.example.orders.dtos.MemberDto;
import com.example.orders.dtos.PaymentOrderRequestDto;
import com.example.orders.dtos.PaymentOrderResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("PAYMENTS")
public interface PaymentFeignClient {
  @PostMapping(value = "/payments", consumes = "application/json")
  PaymentOrderResponseDto paymentOrder(@RequestBody PaymentOrderRequestDto dto);
}
