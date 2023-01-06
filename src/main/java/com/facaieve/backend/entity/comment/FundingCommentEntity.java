package com.facaieve.backend.entity.comment;


import com.facaieve.backend.entity.post.FundingEntity;
import com.facaieve.backend.entity.etc.MyPickEntity;
import com.facaieve.backend.entity.user.UserEntity;
import javax.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class FundingCommentEntity extends CommentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fundingCommentId;
    @Column
    String commentBody;
    @Column
    String postType;
    @Column
    Long postId;


    @OneToMany(mappedBy = "fundingCommentEntity", cascade = CascadeType.ALL)
    private List<MyPickEntity> myPickEntity = new ArrayList<>();;

    @ManyToOne
    @JoinColumn(name = "fundingEntity_Id")
    private FundingEntity fundingEntity;

    @ManyToOne
    @JoinColumn(name = "userEntity_Id")
    private UserEntity userEntity;  // 유저 - 펀딩 댓글 매핑
}
