package com.facaieve.backend.entity;

import com.facaieve.backend.entity.comment.FashionPickupCommentEntity;
import com.facaieve.backend.entity.comment.FundingCommentEntity;
import com.facaieve.backend.entity.comment.PortfolioCommentEntity;
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
    @JoinColumn(name = "fashionPickupCommentEntity")
    private FashionPickupCommentEntity fashionPickupCommentEntity;

    @ManyToOne
    @JoinColumn(name = "fundingCommentEntity")
    private FundingCommentEntity fundingCommentEntity;

    @ManyToOne
    @JoinColumn(name = "portfolioCommentEntity")
    private PortfolioCommentEntity portfolioCommentEntity;


    @ManyToOne
    @JoinColumn(name = "portfolioEntity")
    private PortfolioEntity portfolioEntity;

    @ManyToOne
    @JoinColumn(name = "fundingEntity")
    private FundingEntity fundingEntity;

    @ManyToOne
    @JoinColumn(name = "fashionPickUpEntity")
    private FashionPickupEntity fashionPickupEntity;

}
