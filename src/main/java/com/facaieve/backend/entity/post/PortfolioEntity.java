package com.facaieve.backend.entity.post;

import com.facaieve.backend.entity.basetime.BaseEntity;
import com.facaieve.backend.entity.MyPickEntity;
import com.facaieve.backend.entity.TagEntity;
import com.facaieve.backend.entity.comment.PortfolioCommentEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long portfolioEntityId;

    String title;

    String body;

    int views;

    @OneToMany(mappedBy = "portfolioEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();

    @OneToMany(mappedBy = "portfolioEntity",fetch = FetchType.LAZY)
    private ArrayList<PortfolioCommentEntity> commentList = new ArrayList<PortfolioCommentEntity>();

    @OneToMany(mappedBy = "portfolioEntity", cascade = CascadeType.ALL)
    private ArrayList<TagEntity> tagEntities = new ArrayList<TagEntity>();  // 포트폴리오 - 태그 매핑

}
