package com.facaieve.backend.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

public class FashionPickupEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fashionPickUpId;

    String title;

    String body;

    int views;

    Long userId;

    Long commentId;

    String tag;

    Long categoryId;

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();
}
