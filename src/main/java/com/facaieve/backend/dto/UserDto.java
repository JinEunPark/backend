package com.facaieve.backend.dto;


import com.facaieve.backend.entity.user.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    Long userEntityId;
    String displayName;
    String email;
    String password;
    String state;
    String city;
    String userInfo;
    String career;
    String education;
    String Company;


}
