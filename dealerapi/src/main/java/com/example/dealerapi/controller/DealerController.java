package com.example.dealerapi.controller;

import com.example.dealerapi.entity.Dealer;
import com.example.dealerapi.service.DealerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dealers")
public class DealerController {
    private final DealerService dealerService;

    public DealerController(DealerService dealerService) {
        this.dealerService = dealerService;
    }

    @PostMapping
    public Dealer createDealer(@RequestBody Dealer dealer) {
        return dealerService.saveDealer(dealer);
    }

    @GetMapping
    public List<Dealer> getAllDealers() {
        return dealerService.getAllDealers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dealer> getDealerById(@PathVariable Long id) {
        return dealerService.getDealerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDealer(@PathVariable Long id) {
        dealerService.deleteDealer(id);
        return ResponseEntity.noContent().build();
    }
}
