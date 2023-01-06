package com.facaieve.backend.controller;



import com.facaieve.backend.dto.UserDto;
import com.facaieve.backend.dto.UserDto.PostUserDto;
import com.facaieve.backend.entity.user.UserEntity;
import com.facaieve.backend.mapper.user.UserMapper;
import com.facaieve.backend.service.user.UserService;
import com.facaieve.backend.stubDate.UserStubData;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/user")
@AllArgsConstructor
public class UserEntityController {

    UserService userService;

    UserMapper userMapper;
    static final UserStubData userStubData = new UserStubData();


    @PostMapping("/post")// 유저 등록
    public ResponseEntity postUserEntity(@RequestBody PostUserDto postUserDto){

//       UserEntity postingUserEntity= userMapper.userPostDtoToUserEntity(postUserDto);
//       UserEntity postedUserEntity = userService.create(postingUserEntity);
//        return new ResponseEntity(userMapper.userEntityToResponseDto(postedUserEntity), HttpStatus.CREATED);
        log.info("신규 유저를 등록합니다.");

        // 컨트롤러단만 작성하기 위해 Stub 데이터로 대체
        return new ResponseEntity(userMapper.userStubEntityToToUserStubEntity(userStubData), HttpStatus.CREATED);
    }


    @PatchMapping("/patch")//유저 정보 수정
    public ResponseEntity patchUserEntity(@RequestBody UserDto.PatchUserDto patchUserDto){
        UserEntity editingUserEntity= userMapper.userPatchDtoToUserEntity(patchUserDto);
//        UserEntity editedUserEntity = userService.updateUserEntity(editingUserEntity);

        log.info("기존 유저 정보를 수정합니다.");

        editingUserEntity.setDisplayName(editingUserEntity.getDisplayName()+"TEST");
//        return new ResponseEntity( userMapper.userEntityToResponseDto(editedUserEntity), HttpStatus.OK);

        return new ResponseEntity( userMapper.userEntityToResponseDto(editingUserEntity), HttpStatus.OK);
    }

    @GetMapping("/get")//유저 정보(1인) 요청
    public ResponseEntity getUserEntity(@RequestBody UserDto.GetUserDto getUserDto){

//        UserEntity foundUserEntity = userService.findUserEntity(getUserDto.getUserEntityId());
        log.info("유저 정보를 가져옵니다.");
//        return new ResponseEntity( userMapper.userEntityToResponseDto(foundUserEntity), HttpStatus.OK);

        // 컨트롤러단만 작성하기 위해 Stub 데이터로 대체
        return new ResponseEntity(userMapper.userStubEntityToToUserStubEntity(userStubData), HttpStatus.OK);

    }


    @DeleteMapping("/delete")//유저 정보(1인) 요청
    public ResponseEntity deleteUserEntity(@RequestBody UserDto.DeleteUserDto deleteUserDto){
//        UserEntity deletingUserEntity= userMapper.userDeleteDtoToUserEntity(deleteUserDto);
//        UserEntity deletedUserEntity = userService.deleteUserEntity(deletingUserEntity);

        log.info("기존 유저를 삭제합니다.");

        // 컨트롤러단만 작성하기 위해 Stub 데이터로 대체
        return new ResponseEntity(HttpStatus.OK);
    }



}
