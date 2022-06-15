package com.example.orders.controllers;

import com.example.orders.dtos.MemberDto;
import com.example.orders.dtos.OrderDto;
import com.example.orders.entities.Order;
import com.example.orders.feign.MemberFeignClient;
import com.example.orders.kafka.KafkaProducer;
import com.example.orders.mappers.OrderDtoMapper;
import com.example.orders.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {
  private OrderService orderService;
  private MemberFeignClient memberFeignClient;
  private KafkaProducer kafkaProducer;

  @GetMapping("/{id}")
  public OrderDto test(@PathVariable Long id) {
    Order order = orderService.findOne(id);
    MemberDto memberDto = memberFeignClient.getMember(order.getOrdererUserId());

    return OrderDtoMapper.INSTANCE.fromEntity(order, memberDto);
  }

  @PostMapping("/pub")
  public String kafkaPubTest(@RequestBody String message) {
    kafkaProducer.sendMessage(message);
    return message;
  }
}
