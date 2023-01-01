package com.facaieve.backend.entity.post;


import com.facaieve.backend.entity.basetime.BaseEntity;
import com.facaieve.backend.entity.CategoryEntity;
import com.facaieve.backend.entity.MyPickEntity;
import com.facaieve.backend.entity.TagEntity;
import com.facaieve.backend.entity.comment.FashionPickUpCommentEntity;
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

    String title;

    String body;

    int views;

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();  // 패션픽업 - 마이픽 매핑

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<FashionPickUpCommentEntity> commentList = new ArrayList<FashionPickUpCommentEntity>();  // 패션픽업 - FP 댓글 매핑

    @OneToMany(mappedBy = "fashionPickupEntity", cascade = CascadeType.ALL)
    private ArrayList<TagEntity> tagEntities = new ArrayList<TagEntity>();  // 패션픽업 - 태그 매핑

    @OneToMany(mappedBy = "fashionPickupEntity",fetch = FetchType.LAZY)
    private ArrayList<CategoryEntity> categoryEntities = new ArrayList<CategoryEntity>();  // 패션픽업 - 카테코리 매핑

}
