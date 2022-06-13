package com.example.orders.feign;

import com.example.orders.dtos.MemberDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MEMBERS")
public interface MemberFeignClient {
  @GetMapping(value = "/members/{memberId}", consumes = "application/json")
  MemberDto getMember(@PathVariable("memberId") Long memberId);
}
