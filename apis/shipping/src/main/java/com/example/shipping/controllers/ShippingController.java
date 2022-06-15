package com.example.shipping.controllers;

import com.example.shipping.entities.Shipping;
import com.example.shipping.services.ShippingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/shipping")
public class ShippingController {
  private ShippingService shippingService;

  @GetMapping("/{id}")
  public Shipping test(@PathVariable Long id) {
    return this.shippingService.findOne(id);
  }
}
