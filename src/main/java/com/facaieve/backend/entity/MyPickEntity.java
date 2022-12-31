package com.facaieve.backend.entity;

import com.facaieve.backend.Constant.State;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class MyPickEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String myPickId;

    State withdrawalState;

    @OneToOne
    User userId;
}
