package com.facaieve.backend.repository.post;

import com.facaieve.backend.entity.comment.FundingCommentEntity;
import com.facaieve.backend.entity.post.FashionPickupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FashionPickupRepository extends JpaRepository<FashionPickupEntity,Long> {
}
