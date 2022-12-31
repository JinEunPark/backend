package com.facaieve.backend.entity;
import com.facaieve.backend.Constant.PostType;
import jakarta.persistence.*;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class PortfolioCommentEntity extends Comment{

    @Id
    Long commentId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private PortfolioEntity portfolioEntity;

}
