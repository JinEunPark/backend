package com.facaieve.backend.entity;


import com.facaieve.backend.entity.comment.FashionPickupCommentEntity;
import jakarta.persistence.*;

import java.util.*;
@Entity
public class FashionPickupEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fashionPickupEntityId;

    @OneToOne
    PortfolioEntity portfolioId;

    String title;

    String body;

    int views;

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();  // 패션픽업 - 마이픽 매핑

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<FashionPickupCommentEntity> commentList = new ArrayList<FashionPickupCommentEntity>();  // 패션픽업 - FP 댓글 매핑

    @OneToOne
    UserEntity userEntityId;


    @OneToOne(mappedBy = "fashionPickup")
    @JoinColumn(name = "tagId")
    TagEntity tag;

    @OneToOne
    CategoryEntity categoryId;

}
