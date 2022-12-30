package com.facaieve.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Portfolio extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long portfolioId;
    String title;
    String body;
    int views;
    Long userId;
    int pick;
    @OneToMany(mappedBy = "Comments")
    ArrayList<Comments> comments = new ArrayList<>();
    Long category;

}
