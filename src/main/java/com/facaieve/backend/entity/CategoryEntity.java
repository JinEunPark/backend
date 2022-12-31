package com.facaieve.backend.entity;

import jakarta.persistence.*;

@Entity
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long categoryId;

    String categoryName;

    @OneToOne
    PortfolioEntity portfolio;
}
