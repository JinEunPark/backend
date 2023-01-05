package com.facaieve.backend.controller.etc;

import com.facaieve.backend.dto.etc.MyPickDTO;
import com.facaieve.backend.mapper.etc.MyPickMapper;
import com.facaieve.backend.service.etc.MyPickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Mypick")
public class MyPickController {


    MyPickService myPickService;
    MyPickMapper myPickMapper;


    @PostMapping("/post")
    public ResponseEntity postMyPick(@RequestBody MyPickDTO.PostMyPickDTO postMyPickDTO){
        postMyPickDTO.setUserId(Long.valueOf(1));
        return new ResponseEntity(myPickService.createMyPick(myPickMapper.postMyPickDtoToMyPickEntity(postMyPickDTO)), HttpStatus.CREATED);
    }

    //유저 아디로 삭제하는게 필요함
    @DeleteMapping("/delete")
    public void deleteMyPick(@RequestBody MyPickDTO.ResponseMyPickDTO responseMyPickDTO){
        responseMyPickDTO.setMyPickId(Long.valueOf(1));
        responseMyPickDTO.setUserId(Long.valueOf(1));
        myPickService.deleteMyPick(myPickMapper.responseMyPickDtoToMyPickEntity(responseMyPickDTO));
    }
}
