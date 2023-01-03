package com.facaieve.backend.entity.comment;
import com.facaieve.backend.entity.etc.MyPickEntity;

public abstract class CommentEntity {
    Long commentId;
    Long userId;
    String commentBody;
    String postType;
    Long postId;
    MyPickEntity myPickEntity;

}
