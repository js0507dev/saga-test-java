package com.example.shipping.services;

import com.example.shipping.entities.Shipping;
import com.example.shipping.repositories.ShippingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
public class ShippingService {
  private ShippingRepository shippingRepository;

  public Shipping findOne(Long id) {
    Shipping shipping = this.shippingRepository.findById(id).orElseThrow(NoSuchElementException::new);
    return shipping;
  }
}
