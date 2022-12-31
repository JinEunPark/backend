package com.facaieve.backend.entity;

import jakarta.persistence.*;

@Entity
public class TagEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long tagId;

    String tagName;

    String description;
    @OneToOne
    PortfolioEntity portfolio;

    @OneToOne
    FashionPickupEntity fashionPickup;

    @ManyToOne
    FundingEntity funding;
}
