package com.facaieve.backend.entity.comment;
import com.facaieve.backend.entity.MyPickEntity;
import com.facaieve.backend.entity.PortfolioEntity;
import jakarta.persistence.*;

import lombok.NoArgsConstructor;

public abstract class CommentEntity {
    Long commentId;
    Long userId;
    String commentBody;
    String postType;
    Long postId;
    MyPickEntity myPickEntity;

}
