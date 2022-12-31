package com.facaieve.backend.entity;

import com.facaieve.backend.entity.comment.FP_CommentEntity;
import com.facaieve.backend.entity.comment.Fund_CommentEntity;
import com.facaieve.backend.entity.comment.PF_CommentEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class MyPickEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long myPickId;

    Long userId;

    @ManyToOne
    @JoinColumn(name = "fp_comment_Id")
    private FP_CommentEntity fp_commentEntity;

    @ManyToOne
    @JoinColumn(name = "fund_comment_Id")
    private Fund_CommentEntity fund_commentEntity;

    @ManyToOne
    @JoinColumn(name = "pf_comment_Id")
    private PF_CommentEntity pf_commentEntity;


    @ManyToOne
    @JoinColumn(name = "portfolio_Id")
    private PortfolioEntity portfolioEntity;

    @ManyToOne
    @JoinColumn(name = "funding_Id")
    private FundingEntity fundingEntity;

    @ManyToOne
    @JoinColumn(name = "fashionPickUp_Id")
    private FashionPickupEntity fashionPickupEntity;

}
