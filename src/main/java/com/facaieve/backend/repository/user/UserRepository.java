package com.facaieve.backend.repository.user;

import com.facaieve.backend.entity.comment.FundingCommentEntity;
import com.facaieve.backend.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findUserEntityById();
    boolean existsByEmail();
    UserEntity findUserEntityByEmailAndPassword(String email, String password);
}
