package com.facaieve.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long portfolioId;

    String title;

    String body;

    int views;

    int pick;

    @OneToMany(mappedBy = "portfolioEntity",fetch = FetchType.LAZY)
    private ArrayList<PortfolioCommentEntity> comments = new ArrayList<PortfolioCommentEntity>();

    @OneToOne(mappedBy = "portfolio")
    CategoryEntity category;

    @OneToOne(mappedBy = "portfolio")
    TagEntity tagEntity;
}
