package com.example.orders.services;

import com.example.orders.entities.Order;
import com.example.orders.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
public class OrderService {
  private OrderRepository orderRepository;

  public Order findOne(Long id) {
    Order order = orderRepository.findById(id).orElseThrow(NoSuchElementException::new);
    return order;
  }
}
