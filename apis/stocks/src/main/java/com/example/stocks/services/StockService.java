package com.example.stocks.services;

import com.example.stocks.entities.Stock;
import com.example.stocks.repositories.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
public class StockService {
  private StockRepository stockRepository;

  public Stock findOne(Long id) {
    Stock stock = this.stockRepository.findById(id).orElseThrow(NoSuchElementException::new);
    return stock;
  }

  @Transactional
  public Stock reduceStock(Long productId, Long quantity) {
    Stock stock = stockRepository.findByProductIdWithLock(productId).orElseThrow(NoSuchElementException::new);
    stock.setQuantity(stock.getQuantity() - quantity);
    return stockRepository.save(stock);
  }
}
