package com.facaieve.backend.service;

import com.facaieve.backend.entity.user.UserEntity;
import com.facaieve.backend.repository.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    //입력 값으로 들어온 userEntity 저장 그리고 반환 todo 보안 설정 아직 안함
    public UserEntity create(final UserEntity userEntity){

        if(userEntity ==null || userEntity.getUserEntityId()== null){
            throw new RuntimeException("Invalid arguments");
        }
        final String email = userEntity.getEmail();

        if(userRepository.existsByEmail()){//todo email 로 중복 검사 실행함.
            log.warn("Email already exists {}", email);
            throw new RuntimeException("Email already exists");
        }
        return userRepository.save(userEntity);
    }


    //credentials 반환함.
    public UserEntity getByCredentials(final String email, final String password){
        return userRepository.findUserEntityByEmailAndPassword(email, password);
    }

    public UserEntity deleteUserEntity(final UserEntity userEntity){
        return null;
    }

    public UserEntity updateUserEntity(UserEntity userEntity){
        return null;
    }

}
