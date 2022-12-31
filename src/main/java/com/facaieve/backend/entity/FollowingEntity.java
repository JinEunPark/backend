package com.facaieve.backend.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class FollowingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long followId;

    @OneToOne
    UserEntity mainUserIdEntity;

    @OneToMany
    List<UserEntity> followUserIdEntity = new ArrayList<>();

    @OneToMany
    List<UserEntity> followerUserIdEntity = new ArrayList<>();

}
