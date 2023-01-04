package com.facaieve.backend.repository.comment;

import com.facaieve.backend.entity.comment.FundingCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundingCommentRepository extends JpaRepository<FundingCommentEntity,Long> {
}
