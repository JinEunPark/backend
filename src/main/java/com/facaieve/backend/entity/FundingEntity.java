package com.facaieve.backend.entity;

import com.facaieve.backend.entity.comment.FundingCommentEntity;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class FundingEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fundingEntityId;

    String title;

    String Body;

    @OneToOne
    UserEntity userEntityId;


    @OneToOne
    FashionPickupEntity fashionPickUpId;

    @OneToMany(mappedBy = "funding")
    @JoinColumn(name = "tagId")
    List<TagEntity> tagEntityList = new ArrayList<>();

    Date dueDate;

    Long targetPrice;//펀딩 목표금액

    Long fundedPrice;//펀딩된 현재 금액


    @OneToMany(mappedBy = "fundingEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();

    @OneToMany(mappedBy = "fundingEntity",fetch = FetchType.LAZY)
    private ArrayList<FundingCommentEntity> commentList = new ArrayList<FundingCommentEntity>();  // 펀딩 엔티티 - 펀딩 댓글 매핑

}
