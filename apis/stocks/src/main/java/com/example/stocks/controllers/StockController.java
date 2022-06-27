package com.example.stocks.controllers;

import com.example.stocks.dto.ReduceStockRequestDto;
import com.example.stocks.dto.ReduceStockResponseDto;
import com.example.stocks.entities.Stock;
import com.example.stocks.services.StockService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/stocks")
public class StockController {
  private StockService stockService;

  @GetMapping("/{id}")
  public Stock test(@PathVariable Long id) {
    return this.stockService.findOne(id);
  }

  @PutMapping("/{id}/reduce")
  public ResponseEntity<ReduceStockResponseDto> reduceStock(@PathVariable("id") Long productId, @RequestBody(required = true) ReduceStockRequestDto dto) {
    Long quantity = dto.getQuantity();
    Stock _updated = stockService.reduceStock(productId, quantity);
    ReduceStockResponseDto responseDto = new ReduceStockResponseDto();
    return new ResponseEntity<>(responseDto, HttpStatus.NO_CONTENT);
  }
}
