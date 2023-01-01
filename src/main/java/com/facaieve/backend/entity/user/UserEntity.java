package com.facaieve.backend.entity.user;


import com.facaieve.backend.entity.basetime.BaseEntity;
import com.facaieve.backend.Constant.UserActive;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
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
