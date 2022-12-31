package com.facaieve.backend.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class FashionPickupEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fashionPickUpId;

    String title;

    String body;

    int views;

    Long userId;

    int myPick;

    Long commentId;

    String tag;

    Long categoryId;
}
