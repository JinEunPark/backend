package com.facaieve.backend.entity.user;

import com.facaieve.backend.entity.user.UserEntity;
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

    @OneToMany
    List<UserEntity> followUserList = new ArrayList<>();

    @OneToMany
    List<UserEntity> FollowerUserList = new ArrayList<>();

    @OneToOne
    UserEntity mainUserIdEntity;


}
