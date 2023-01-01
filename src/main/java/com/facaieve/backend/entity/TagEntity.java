package com.facaieve.backend.entity;

import com.facaieve.backend.entity.basetime.BaseEntity;
import com.facaieve.backend.entity.post.FashionPickupEntity;
import com.facaieve.backend.entity.post.FundingEntity;
import com.facaieve.backend.entity.post.PortfolioEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TagEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long tagId;

    String tagName;

    String description;

    @ManyToOne
    @JoinColumn(name = "fashion_Pickup_Entity_Id")
    FashionPickupEntity fashionPickupEntity;

    @ManyToOne
    @JoinColumn(name = "funding_Entity_Id")
    FundingEntity fundingEntity;

    @ManyToOne
    @JoinColumn(name = "portfolio_Entity_Id")
    PortfolioEntity portfolioEntity;

}
