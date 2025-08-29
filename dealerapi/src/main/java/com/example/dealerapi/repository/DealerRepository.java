package com.example.dealerapi.repository;

import com.example.dealerapi.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealerRepository extends JpaRepository<Dealer, Long> {
}
