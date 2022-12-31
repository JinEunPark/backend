package com.facaieve.backend.entity;


import com.facaieve.backend.Constant.UserActive;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@Data
public class WithdrawalEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long withdrawalId;

    @OneToOne
    @JoinColumn(name = "user_Id")
    UserEntity withdrawalUserIdEntity;

    @Enumerated(value = EnumType.STRING)
    UserActive userActive;

}
