package com.example.stocks.repositories;

import com.example.stocks.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
  @Lock(LockModeType.PESSIMISTIC_WRITE)
  Optional<Stock> findByProductIdWithLock(Long productId);
}
