package com.facaieve.backend.entity;

import com.facaieve.backend.entity.comment.FP_CommentEntity;
import com.facaieve.backend.entity.comment.Fund_CommentEntity;
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

    @OneToMany(mappedBy = "fundingEntity",fetch = FetchType.LAZY)
    private ArrayList<Fund_CommentEntity> commentList = new ArrayList<Fund_CommentEntity>();  // 펀딩 엔티티 - 펀딩 댓글 매핑

}
