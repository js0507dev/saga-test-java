package com.example.stocks.repositories;

import com.example.stocks.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
  Optional<Stock> findByProductId(Long productId);
  @Lock(LockModeType.PESSIMISTIC_WRITE)
  @Query("SELECT s FROM stocks s WHERE s.productId = :productId")
  Optional<Stock> findByProductIdWithLock(@Param("productId") Long productId);
}
