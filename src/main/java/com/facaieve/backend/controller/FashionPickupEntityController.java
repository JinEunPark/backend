package com.facaieve.backend.controller;


import com.facaieve.backend.FashionPickupMapper;
import com.facaieve.backend.dto.FashionPickupDto;
import com.facaieve.backend.dto.UserDto;
import com.facaieve.backend.entity.post.FashionPickupEntity;
import com.facaieve.backend.service.FashionPickupEntityService;
import com.facaieve.backend.stubDate.FashionPuckupStubData;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController("/FashionPickup")
@AllArgsConstructor
public class FashionPickupEntityController {

    FashionPickupEntityService fashionPickupEntityService;
    FashionPickupMapper fashionPickupMapper;

    static final FashionPuckupStubData fashionPuckupStubData = new FashionPuckupStubData();

    // 서비스 레이어 구현이 안되어 Stub 데이터로 대체(추후 변경 예정)

    @PostMapping("/post")
    public ResponseEntity postUserEntity(@RequestBody FashionPickupDto.PostFashionPickupDto postFashionPickupDto) {
//        FashionPickupEntity postingFashionPickupEntity = fashionPickupMapper.fashionPickupPostDtoToFashionPickupEntity(postFashionPickupDto);
//        FashionPickupEntity postedFashionPickupEntity = fashionPickupEntityService.createFashionPickupEntity(postingFashionPickupEntity);
//        return new ResponseEntity( fashionPickupMapper.fashionPickupEntityToResponseFashionPickupEntity(postedFashionPickupEntity), HttpStatus.OK);

        FashionPickupEntity stubdata =  fashionPickupMapper.fashionPickupDtoToFashionPickupStubData(fashionPuckupStubData);
        log.info("새로운 패션픽업 게시물을 등록합니다.");
        return new ResponseEntity( fashionPickupMapper.fashionPickupEntityToResponseFashionPickupEntity(stubdata), HttpStatus.OK);
    }

    @PatchMapping("/patch")
    public ResponseEntity patchUserEntity(@RequestBody FashionPickupDto.PatchFashionPickupDto patchFashionPickupDto){
//        FashionPickupEntity patchingFashionPickupEntity = fashionPickupMapper.fashionPickupPatchDtoToFashionPickupEntity(patchFashionPickupDto);
//        FashionPickupEntity patchedFashionPickupEntity = fashionPickupEntityService.editFashionPickupEntity(patchingFashionPickupEntity);
//        return new ResponseEntity( fashionPickupMapper.fashionPickupEntityToResponseFashionPickupEntity(patchedFashionPickupEntity), HttpStatus.OK);
//
        FashionPickupEntity stubdata =  fashionPickupMapper.fashionPickupDtoToFashionPickupStubData(fashionPuckupStubData);
        stubdata.setBody("패션픽업 게시글 내용 수정완료");
        stubdata.setTitle("패션픽업 게시글 제목 수정완료");

        log.info("기존 패션픽업 게시물을 수정합니다.");
        return new ResponseEntity( fashionPickupMapper.fashionPickupEntityToResponseFashionPickupEntity(stubdata), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity patchUserEntity(@RequestBody FashionPickupDto.GetFashionPickupDto getFashionPickupDto){
//        FashionPickupEntity foundFashionPickupEntity = fashionPickupEntityService.findFashionPickupEntity(getFashionPickupDto.getFashionPickupEntityId());
//        return new ResponseEntity( fashionPickupMapper.fashionPickupEntityToResponseFashionPickupEntity(foundFashionPickupEntity), HttpStatus.OK);
        log.info("기존 패션픽업 게시글을 가져옵니다.");

        FashionPickupEntity stubdata =  fashionPickupMapper.fashionPickupDtoToFashionPickupStubData(fashionPuckupStubData);
        return new ResponseEntity( fashionPickupMapper.fashionPickupEntityToResponseFashionPickupEntity(stubdata), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity patchUserEntity(@RequestBody FashionPickupDto.DeleteFashionPickupDto deleteFashionPickupDto){

//        fashionPickupEntityService.removeFashionPickupEntity(deleteFashionPickupDto.getFashionPickupEntityId());
        log.info("기존 패션픽업 게시글을 삭제합니다.");
        return new ResponseEntity(HttpStatus.OK);



    }



}
