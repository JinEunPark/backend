package com.facaieve.backend.entity;

import jakarta.persistence.*;

@Entity
public class TagEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String tagId;

    String tagName;

    String description;
    @OneToOne
    PortfolioEntity portfolio;

    @OneToOne
    FashionPickupEntity fashionPickup;

    @OneToOne
    FundingEntity funding;
}
