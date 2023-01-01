package com.facaieve.backend.entity;

import com.facaieve.backend.entity.post.FashionPickupEntity;
import com.facaieve.backend.entity.post.FundingEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long categoryId;

    String categoryName;

    @ManyToOne
    @JoinColumn(name = "fashion_Pickup_Entity_Id")
    FashionPickupEntity fashionPickupEntity;

    @ManyToOne
    @JoinColumn(name = "funding_Entity_Id")
    FundingEntity fundingEntity;
}
