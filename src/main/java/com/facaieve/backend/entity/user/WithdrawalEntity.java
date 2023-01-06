package com.facaieve.backend.entity.user;

import com.facaieve.backend.Constant.UserActive;
import com.facaieve.backend.entity.basetime.BaseEntity;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Entity
@Getter
@Setter
public class WithdrawalEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long withdrawalId;

    @OneToOne(mappedBy = "withdrawalEntity")
    UserEntity withdrawalUserEntity;

    @Enumerated(value = EnumType.STRING)
    UserActive userActive;


}
