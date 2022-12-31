package com.facaieve.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Data


public class UserEntity extends BaseEntity {
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

    @Enumerated(value = EnumType.STRING)
    @Column(name = "is_Activated")
    private UserActive isUserActive =  UserActive.Active;


    public enum UserActive {

        Active("활동 회원"),
        UnActive("휴면 회원"),
        Withdrawal("탈퇴 회원");

        @Getter
        private final String isActive;


        UserActive(String isActive) {
            this.isActive =isActive;
        }
    }


}
