package com.facaieve.backend.entity;

import com.facaieve.backend.entity.comment.Fund_CommentEntity;
import jakarta.persistence.*;
import java.util.ArrayList;
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


    @OneToOne
    FashionPickupEntity fashionPickUpId;

    @OneToOne(mappedBy = "funding")
    @JoinColumn(name = "tagId")
    TagEntity tag;

    Date dueDate;

    Long targetPrice;//펀딩 목표금액

    Long fundedPrice;//펀딩된 현재 금액


    @OneToMany(mappedBy = "fundingEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();

    @OneToMany(mappedBy = "fundingEntity",fetch = FetchType.LAZY)
    private ArrayList<Fund_CommentEntity> commentList = new ArrayList<Fund_CommentEntity>();  // 펀딩 엔티티 - 펀딩 댓글 매핑

}
