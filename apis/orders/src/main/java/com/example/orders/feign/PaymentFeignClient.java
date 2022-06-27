package com.example.orders.feign;

import com.example.orders.dtos.MemberDto;
import com.example.orders.dtos.PaymentOrderRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("PAYMENTS")
public interface PaymentFeignClient {
  @PostMapping(value = "/payments", consumes = "application/json")
  MemberDto getMember(@RequestBody PaymentOrderRequestDto dto);
}
