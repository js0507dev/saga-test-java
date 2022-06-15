package com.example.orders.controllers;

import com.example.orders.dtos.MemberDto;
import com.example.orders.dtos.OrderDto;
import com.example.orders.entities.Order;
import com.example.orders.feign.MemberFeignClient;
import com.example.orders.mappers.OrderDtoMapper;
import com.example.orders.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {
  private OrderService orderService;
  private MemberFeignClient memberFeignClient;

  @GetMapping("/{id}")
  public OrderDto test(@PathVariable Long id) {
    Order order = orderService.findOne(id);
    MemberDto memberDto = memberFeignClient.getMember(order.getOrdererUserId());

    return OrderDtoMapper.INSTANCE.fromEntity(order, memberDto);
  }
}
