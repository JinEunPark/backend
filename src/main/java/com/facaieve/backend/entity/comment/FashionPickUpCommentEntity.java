package com.facaieve.backend.entity.comment;

import com.facaieve.backend.entity.post.FashionPickupEntity;
import com.facaieve.backend.entity.MyPickEntity;
import com.facaieve.backend.entity.user.UserEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class FashionPickUpCommentEntity extends CommentEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fp_commentId;

    String commentBody;
    String postType;
    Long postId;

    @OneToMany(mappedBy = "fashionPickUpCommentEntity", cascade = CascadeType.ALL)
    private List<MyPickEntity> myPickEntity = new ArrayList<>();;   // FP 댓글 - 마이픽 매핑

    @ManyToOne
    @JoinColumn(name = "fashionPickUpEntity_Id")
    private FashionPickupEntity fashionPickupEntity;  // FP 댓글 - 패션픽업 매핑

    @ManyToOne
    @JoinColumn(name = "user_Id")
    UserEntity UserEntity;

}
