package com.example.orders.feign;

import com.example.orders.dtos.ReduceStockRequestDto;
import com.example.orders.dtos.ReduceStockResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("STOCKS")
public interface StockFeignClient {
  @PutMapping(value = "/stocks/{productId}/reduce", consumes = "application/json")
  ReduceStockResponseDto reduceStock(@PathVariable("productId") Long productId, @RequestBody ReduceStockRequestDto dto);
}
