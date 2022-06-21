package com.example.stocks.services;

import com.example.stocks.entities.Stock;
import com.example.stocks.repositories.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
public class StockService {
  private StockRepository stockRepository;

  public Stock findOne(Long id) {
    Stock stock = this.stockRepository.findById(id).orElseThrow(NoSuchElementException::new);
    return stock;
  }
}
