package com.facaieve.backend.entity.comment;

import com.facaieve.backend.entity.FashionPickupEntity;
import com.facaieve.backend.entity.MyPickEntity;
import com.facaieve.backend.entity.UserEntity;
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
public class FashionPickupCommentEntity extends CommentEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fp_commentId;

    String commentBody;
    String postType;
    Long postId;

    @OneToMany(mappedBy = "fashionPickupCommentEntity", cascade = CascadeType.ALL)
    private List<MyPickEntity> myPickEntity = new ArrayList<>();;   // FP 댓글 - 마이픽 매핑

    @ManyToOne
    @JoinColumn(name = "fashionPickUpEntity")
    private FashionPickupEntity fashionPickupEntity;  // FP 댓글 - 패션픽업 매핑

    @ManyToOne
    @JoinColumn(name = "userEntity")
    UserEntity userEntity;

}
