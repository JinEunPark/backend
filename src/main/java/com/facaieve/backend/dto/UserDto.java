package com.facaieve.backend.dto;


import com.facaieve.backend.entity.user.UserEntity;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.modelmapper.ModelMapper;


@Getter
@Setter
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

    public static ModelMapper modelMapper = new ModelMapper();

    public UserEntity toUserEntity(UserDto userDto){
        UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
        return userEntity;
    }

    public static class PostUserDto{

    String displayName;

    @Email
    String email;
    String password;
    String state;
    String city;
    String userInfo;
    String career;
    String education;
    String Company;

    }


    public static class PatchUserDto{

        String displayName;

        @Email
        String email;
        String password;
        String state;
        String city;
        String userInfo;
        String career;
        String education;
        String Company;

    }

    @Getter
    public static class GetUserDto{

        long userEntityId;

    }


    public static class DeleteUserDto{

        long UserEntityId;

        @Email
        String email;
        String password;

    }

    public static class ResponseUserDto{

        String displayName;
        @Email
        String email;

    }

}
