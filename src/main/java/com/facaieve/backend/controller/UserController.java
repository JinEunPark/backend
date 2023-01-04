package com.facaieve.backend.controller;


import com.facaieve.backend.UserMapper;
import com.facaieve.backend.dto.UserDto;
import com.facaieve.backend.dto.UserDto.PostUserDto;
import com.facaieve.backend.entity.user.UserEntity;
import com.facaieve.backend.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class UserController {

    UserService userService;

    UserMapper userMapper;



    @PostMapping("/post")// 유저 등록
    public ResponseEntity postUserEntity(@RequestBody PostUserDto postUserDto){

       UserEntity postingUserEntity= userMapper.userPostDtoToUserEntity(postUserDto);
       UserEntity postedUserEntity = userService.create(postingUserEntity);

        log.info("신규 유저를 등록합니다.");

        return new ResponseEntity(userMapper.userEntityToResponseDto(postedUserEntity), HttpStatus.CREATED);
    }


    @PatchMapping("/patch")//유저 정보 수정
    public ResponseEntity patchUserEntity(@RequestBody UserDto.PatchUserDto patchUserDto){
        UserEntity editingUserEntity= userMapper.userPatchDtoToUserEntity(patchUserDto);
        UserEntity editedUserEntity = userService.updateUserEntity(editingUserEntity);

        log.info("기존 유저 정보를 수정합니다.");

        return new ResponseEntity( userMapper.userEntityToResponseDto(editedUserEntity), HttpStatus.OK);
    }

    @GetMapping("/get")//유저 정보(1인) 요청
    public ResponseEntity getUserEntity(@RequestBody UserDto.GetUserDto getUserDto){

        UserEntity foundUserEntity = userService.findUserEntity(getUserDto.getUserEntityId());

        log.info("유저 정보를 가져옵니다.");

        return new ResponseEntity( userMapper.userEntityToResponseDto(foundUserEntity), HttpStatus.OK);
    }


    @DeleteMapping("/delete")//유저 정보(1인) 요청
    public ResponseEntity deleteUserEntity(@RequestBody UserDto.DeleteUserDto deleteUserDto){
        UserEntity deletingUserEntity= userMapper.userDeleteDtoToUserEntity(deleteUserDto);
        UserEntity deletedUserEntity = userService.deleteUserEntity(deletingUserEntity);

        log.info("기존 유저를 삭제합니다.");

        return new ResponseEntity(HttpStatus.OK);
    }



}
