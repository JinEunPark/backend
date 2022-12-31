package com.facaieve.backend.entity;

import com.facaieve.backend.Constant.UserActive;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

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
    UserActive userActive;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "withdrawalUserIdEntity")
    WithdrawalEntity withdrawalEntity;

}
