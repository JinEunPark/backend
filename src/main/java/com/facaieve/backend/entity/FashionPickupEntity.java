package com.facaieve.backend.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class FashionPickupEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String fashionPickupEntityId;

    @OneToOne
    PortfolioEntity portfolioId;

    String title;

    String body;

    int views;

    @OneToOne
    User userId;

    int myPick;

    @OneToMany
    List<PortfolioCommentEntity> commentId = new ArrayList<>();

    @OneToOne(mappedBy = "fashionPickup")
    @JoinColumn(name = "tagId")
    TagEntity tag;

    @OneToOne
    CategoryEntity categoryId;
}
