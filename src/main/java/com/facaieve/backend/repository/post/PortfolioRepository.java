package com.facaieve.backend.repository.post;

import com.facaieve.backend.entity.comment.FundingCommentEntity;
import com.facaieve.backend.entity.post.PortfolioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<PortfolioEntity,Long> {
}
