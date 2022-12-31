package com.facaieve.backend.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

public class FundingEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fundingId;

    String title;

    String Body;

    Long userId;

    String commentId;



    Long fashionPickUpId;

    Date dueDate;

    Long targetPrice;

    Long fundedPrice;


    @OneToMany(mappedBy = "fundingEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();

}
