package com.facaieve.backend.repository.post;

import com.facaieve.backend.entity.comment.FundingCommentEntity;
import com.facaieve.backend.entity.post.FundingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundingRepository extends JpaRepository<FundingEntity,Long> {
}
