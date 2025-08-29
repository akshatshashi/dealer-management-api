package com.example.dealerapi.service;

import com.example.dealerapi.entity.Dealer;
import com.example.dealerapi.repository.DealerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DealerService {
    private final DealerRepository dealerRepository;

    public DealerService(DealerRepository dealerRepository) {
        this.dealerRepository = dealerRepository;
    }

    public Dealer saveDealer(Dealer dealer) {
        return dealerRepository.save(dealer);
    }

    public List<Dealer> getAllDealers() {
        return dealerRepository.findAll();
    }

    public Optional<Dealer> getDealerById(Long id) {
        return dealerRepository.findById(id);
    }

    public void deleteDealer(Long id) {
        dealerRepository.deleteById(id);
    }
}
