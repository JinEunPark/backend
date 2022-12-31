package com.facaieve.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

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
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "userId")
    WithdrawalEntity withdrawalEntity;

}
