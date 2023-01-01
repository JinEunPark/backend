package com.facaieve.backend.entity.comment;

import com.facaieve.backend.entity.post.FundingEntity;
import com.facaieve.backend.entity.MyPickEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class FundingCommentEntity extends CommentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fund_commentId;

    Long userId;
    String commentBody;
    String postType;
    Long postId;


    @OneToMany(mappedBy = "fundingCommentEntity", cascade = CascadeType.ALL)
    private List<MyPickEntity> myPickEntity = new ArrayList<>();;

    @ManyToOne
    @JoinColumn(name = "fundingEntity_Id")
    private FundingEntity fundingEntity;


}
