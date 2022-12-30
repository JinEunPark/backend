package com.facaieve.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long portfolioId;
    String title;
    String body;
    int views;

    int pick;

    @OneToMany(mappedBy = "portfolio",fetch = FetchType.LAZY)
    private ArrayList<CommentEntity> comments = new ArrayList<CommentEntity>();
    Long category;

}
