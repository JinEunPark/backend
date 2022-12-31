package com.facaieve.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@NoArgsConstructor
@Entity
@Getter
@Setter
public class WithdrawalEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long withdrawalId;

    @ManyToOne
    @JoinColumn(name="user_Id")
    Long withdrawalUserId;

    String withdrawalState;

    Long userId;
}
