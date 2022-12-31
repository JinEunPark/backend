package com.facaieve.backend.entity;

import com.facaieve.backend.entity.comment.FP_CommentEntity;
import com.facaieve.backend.entity.comment.Fund_CommentEntity;
import com.facaieve.backend.entity.comment.PF_CommentEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class MyPickEntity extends BaseEntity{

    String myPickId;

    Long userId;

    @ManyToOne
    @JoinColumn(name = "fp_comment_Id")
    private FP_CommentEntity fp_commentEntity;

    @ManyToOne
    @JoinColumn(name = "fund_comment_Id")
    private Fund_CommentEntity fund_commentEntity;

    @ManyToOne
    @JoinColumn(name = "pf_comment_Id")
    private PF_CommentEntity pf_commentEntity;

}
