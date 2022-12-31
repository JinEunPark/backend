package com.facaieve.backend.entity;

import com.facaieve.backend.Constant.PostType;
import jakarta.persistence.*;

public abstract class Comment extends BaseEntity{
    @OneToOne
    User userId;

    String commentBody;

    int pick;

}
