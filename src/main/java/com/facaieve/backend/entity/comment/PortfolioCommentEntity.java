package com.facaieve.backend.entity.comment;

import com.facaieve.backend.entity.MyPickEntity;
import com.facaieve.backend.entity.post.PortfolioEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@NoArgsConstructor
public class PortfolioCommentEntity extends CommentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long pf_commentId;

    Long userId;
    String commentBody;
    String postType;
    Long postId;

    @OneToMany(mappedBy = "portfolioCommentEntity", cascade = CascadeType.ALL)
    private List<MyPickEntity> myPickEntity;

    @ManyToOne
    @JoinColumn(name = "portfolioEntity_Id")
    private PortfolioEntity portfolioEntity;


}
