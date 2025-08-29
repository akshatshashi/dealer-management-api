package com.example.dealerapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dealers")
public class Dealer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private SubscriptionType subscriptionType;

    public enum SubscriptionType {
        BASIC,
        PREMIUM
    }

    // Constructors
    public Dealer() {}

    public Dealer(String name, String email, SubscriptionType subscriptionType) {
        this.name = name;
        this.email = email;
        this.subscriptionType = subscriptionType;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public SubscriptionType getSubscriptionType() { return subscriptionType; }
    public void setSubscriptionType(SubscriptionType subscriptionType) { this.subscriptionType = subscriptionType; }
}
