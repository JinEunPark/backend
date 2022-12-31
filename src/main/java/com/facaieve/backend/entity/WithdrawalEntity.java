package com.facaieve.backend.entity;

import com.facaieve.backend.Constant.State;
import jakarta.persistence.*;
@Entity
public class WithdrawalEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String withdrawalId;

    State withdrawal;

    @OneToOne
    User withdrawalUserId;//이게 의미 하는 바가 부정확합니다

    State withdrawalState;//enum class 생성함 확인 바람

    @OneToOne
    private User userId;

}
