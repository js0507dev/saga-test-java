package com.example.orders.feign;

import com.example.orders.dtos.MemberDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("PAYMENTS")
public interface PaymentFeignClient {
  @PostMapping(value = "/payments", consumes = "application/json")
  MemberDto getMember(@PathVariable("memberId") Long memberId);
}
