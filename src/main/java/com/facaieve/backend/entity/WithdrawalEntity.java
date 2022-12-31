package com.facaieve.backend.entity;


import com.facaieve.backend.Constant.State;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    String withdrawalId;

    @ManyToOne
    @JoinColumn(name="user_Id")
    Long withdrawalUserId;

    String withdrawalState;

    @OneToOne
    private User userId;

}
