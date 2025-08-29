package com.example.dealerapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "dealer_id", nullable = false)
    private Dealer dealer;

    private String model;
    private Double price;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        AVAILABLE,
        SOLD
    }

    // Constructors
    public Vehicle() {}

    public Vehicle(Dealer dealer, String model, Double price, Status status) {
        this.dealer = dealer;
        this.model = model;
        this.price = price;
        this.status = status;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Dealer getDealer() { return dealer; }
    public void setDealer(Dealer dealer) { this.dealer = dealer; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
}
