package com.example.orders.controllers;

import com.example.orders.entities.Order;
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

  @GetMapping("/{id}")
  public Order test(@PathVariable Long id) {
    return this.orderService.findOne(id);
  }
}
