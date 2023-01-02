package com.facaieve.backend.entity.post;


import com.facaieve.backend.entity.basetime.BaseEntity;
import com.facaieve.backend.entity.CategoryEntity;
import com.facaieve.backend.entity.MyPickEntity;
import com.facaieve.backend.entity.TagEntity;
import com.facaieve.backend.entity.comment.FashionPickUpCommentEntity;
import com.facaieve.backend.entity.user.UserEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
@Entity
@NoArgsConstructor
@Getter
@Setter
public class FashionPickupEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long fashionPickupEntityId;
    @Column
    String title;
    @Column
    String body;
    @Column
    int views;

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();  // 패션픽업 - 마이픽 매핑

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<FashionPickUpCommentEntity> commentList = new ArrayList<FashionPickUpCommentEntity>();  // 패션픽업 - FP 댓글 매핑

    @OneToMany(mappedBy = "fashionPickupEntity", cascade = CascadeType.ALL)
    private ArrayList<TagEntity> tagEntities = new ArrayList<TagEntity>();  // 패션픽업 - 태그 매핑

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<CategoryEntity> categoryEntities = new ArrayList<CategoryEntity>();  // 패션픽업 - 카테코리 매핑

    @ManyToOne
    @JoinColumn(name = "userEntity_Id")
    private UserEntity userEntity;  // 유저 - 패션픽업  매핑



}
