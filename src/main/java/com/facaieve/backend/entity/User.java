package com.facaieve.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data


public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//개별 엔티티 적용
    Long userId;
    String displayName;
    String email;
    String password;
    String state;
    String city;
    String userInfo;
    String career;
    String education;
    String Company;
    String withdrawal;


}
