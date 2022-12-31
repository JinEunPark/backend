package com.facaieve.backend.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class FundingEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long fundingId;

    String title;

    String Body;

    @OneToOne
    User userId;

    String commentId;
    int myPick;

    @OneToOne
    FashionPickupEntity fashionPickUpId;


    @OneToOne(mappedBy = "funding")
    @JoinColumn(name = "tagId")
    TagEntity tag;

    Date dueDate;

    Long targetPrice;//펀딩 목표금액

    Long fundedPrice;//펀딩된 현재 금액

}
