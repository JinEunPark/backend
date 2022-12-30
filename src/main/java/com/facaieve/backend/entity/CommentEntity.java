package com.facaieve.backend.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class CommentEntity {
    @Id
    Long commentId;
    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private PortfolioEntity portfolioEntity;
    Long userId;
    String commentBody;
    String postType;
    Long postId;
    int pick;
}
