package com.example.stocks.controllers;

import com.example.stocks.entities.Stock;
import com.example.stocks.services.StockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/stocks")
public class StockController {
  private StockService stockService;

  @GetMapping("/{id}")
  public Stock test(@PathVariable Long id) {
    return this.stockService.findOne(id);
  }
}
