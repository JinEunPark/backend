package com.facaieve.backend.entity;

import com.facaieve.backend.entity.basetime.BaseEntity;
import com.facaieve.backend.entity.comment.FashionPickUpCommentEntity;
import com.facaieve.backend.entity.comment.FundingCommentEntity;
import com.facaieve.backend.entity.comment.PortfolioCommentEntity;
import com.facaieve.backend.entity.post.FashionPickupEntity;
import com.facaieve.backend.entity.post.FundingEntity;
import com.facaieve.backend.entity.post.PortfolioEntity;
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
    private FashionPickUpCommentEntity fashionPickUpCommentEntity;

    @ManyToOne
    @JoinColumn(name = "fund_comment_Id")
    private FundingCommentEntity fundingCommentEntity;

    @ManyToOne
    @JoinColumn(name = "pf_comment_Id")
    private PortfolioCommentEntity portfolioCommentEntity;


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
