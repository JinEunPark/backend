package com.facaieve.backend.entity.post;

import com.facaieve.backend.entity.basetime.BaseEntity;
import com.facaieve.backend.entity.etc.MyPickEntity;
import com.facaieve.backend.entity.etc.TagEntity;
import com.facaieve.backend.entity.comment.PortfolioCommentEntity;
import com.facaieve.backend.entity.user.UserEntity;
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
    @Column
    String title;
    @Column
    String body;
    @Column
    int views;

    @OneToMany(mappedBy = "portfolioEntity",fetch = FetchType.LAZY)
    private ArrayList<MyPickEntity> myPick = new ArrayList<MyPickEntity>();

    @OneToMany(mappedBy = "portfolioEntity",fetch = FetchType.LAZY)
    private ArrayList<PortfolioCommentEntity> commentList = new ArrayList<PortfolioCommentEntity>();


    @OneToMany(mappedBy = "portfolioEntity", fetch = FetchType.LAZY) //cascade = CascadeType.ALL
    private ArrayList<TagEntity> tagEntities = new ArrayList<TagEntity>();  // 포트폴리오 - 태그 매핑

    @ManyToOne
    @JoinColumn(name = "userEntity_Id")
    private UserEntity userEntity;  // 유저 - 포트폴리오  매핑

}
