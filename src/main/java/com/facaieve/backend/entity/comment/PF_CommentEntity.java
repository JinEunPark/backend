package com.facaieve.backend.entity.comment;

import com.facaieve.backend.entity.FashionPickupEntity;
import com.facaieve.backend.entity.MyPickEntity;
import com.facaieve.backend.entity.PortfolioEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@NoArgsConstructor
public class PF_CommentEntity extends CommentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long pf_commentId;

    Long userId;
    String commentBody;
    String postType;
    Long postId;

    @OneToMany(mappedBy = "pf_commentEntity", cascade = CascadeType.ALL)
    private List<MyPickEntity> myPickEntity;

    @ManyToOne
    @JoinColumn(name = "portfolio_Id")
    private FashionPickupEntity fashionPickupEntity;


}
