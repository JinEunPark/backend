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
    @GeneratedValue(strategy = GenerationType.UUID)
    String followId;

    @OneToMany
    List<UserEntity> followUserId = new ArrayList<>();

    @OneToMany
    List<UserEntity> FollowerUserId = new ArrayList<>();

}
