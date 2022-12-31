package com.facaieve.backend.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class FollowingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String followId;

    @OneToOne
    User mainUserId;

    @OneToMany
    List<User> followUserId = new ArrayList<>();

    @OneToMany
    List<User> FollowerUserId = new ArrayList<>();
}
