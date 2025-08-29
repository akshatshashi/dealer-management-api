package com.example.dealerapi.repository;

import com.example.dealerapi.entity.Vehicle;
import com.example.dealerapi.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByDealer(Dealer dealer);
}
