package com.example.dealerapi.service;

import com.example.dealerapi.entity.Vehicle;
import com.example.dealerapi.entity.Dealer;
import com.example.dealerapi.entity.Dealer.SubscriptionType;
import com.example.dealerapi.repository.VehicleRepository;
import com.example.dealerapi.repository.DealerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;
    private final DealerRepository dealerRepository;

    public VehicleService(VehicleRepository vehicleRepository, DealerRepository dealerRepository) {
        this.vehicleRepository = vehicleRepository;
        this.dealerRepository = dealerRepository;
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    // Fetch all vehicles belonging to PREMIUM dealers only
    public List<Vehicle> getVehiclesOfPremiumDealers() {
        List<Dealer> premiumDealers = dealerRepository.findAll().stream()
                .filter(d -> d.getSubscriptionType() == SubscriptionType.PREMIUM)
                .collect(Collectors.toList());
        return vehicleRepository.findAll().stream()
                .filter(v -> premiumDealers.contains(v.getDealer()))
                .collect(Collectors.toList());
    }
}
