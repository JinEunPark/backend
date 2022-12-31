package com.facaieve.backend.entity;

import com.facaieve.backend.entity.comment.FP_CommentEntity;
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

    String tag;

    Long categoryId;

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();  // 패션픽업 - 마이픽 매핑

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<FP_CommentEntity> commentList = new ArrayList<FP_CommentEntity>();  // 패션픽업 - FP 댓글 매핑
}
