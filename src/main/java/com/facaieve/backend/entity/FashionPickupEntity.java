package com.facaieve.backend.entity;


import com.facaieve.backend.entity.comment.FP_CommentEntity;
import jakarta.persistence.*;

import java.util.*;
@Entity
public class FashionPickupEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fashionPickUpId;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String fashionPickupEntityId;

    @OneToOne
    PortfolioEntity portfolioId;

    String title;

    String body;

    int views;

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();  // 패션픽업 - 마이픽 매핑

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<FP_CommentEntity> commentList = new ArrayList<FP_CommentEntity>();  // 패션픽업 - FP 댓글 매핑

    @OneToOne
    User userId;

    @OneToMany
    List<PortfolioCommentEntity> commentId = new ArrayList<>();

    @OneToOne(mappedBy = "fashionPickup")
    @JoinColumn(name = "tagId")
    TagEntity tag;

    @OneToOne
    CategoryEntity categoryId;

}
