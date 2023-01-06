package com.facaieve.backend.controller.post;



import com.facaieve.backend.mapper.post.FundingMapper;

import com.facaieve.backend.dto.post.FundingDto;
import com.facaieve.backend.entity.post.FundingEntity;
import com.facaieve.backend.service.post.FundingEntityService;
import com.facaieve.backend.stubDate.FundingStubData;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/funding")
@AllArgsConstructor
public class FundingEntityController {

    FundingEntityService fundingEntityService;
    FundingMapper fundingMapper;

    static final FundingStubData fundingStubData = new FundingStubData();

    // 서비스 레이어 구현이 안되어 Stub 데이터로 대체(추후 변경 예정)

    @PostMapping("/post")
    public ResponseEntity postFundingEntity(@RequestBody FundingDto.PostFundingDto postFundingDto) {
//        FundingEntity postingFundingEntity = fundingMapper.fundingPostDtoToFundingEntity(postFundingDto);
//        FundingEntity postedFundingEntity = fundingEntityService.createFundingEntity(postingFundingEntity);
//        return new ResponseEntity( fundingMapper.fundingEntityToResponseFundingEntity(postedFundingEntity), HttpStatus.OK);

        FundingEntity stubdata =  fundingMapper.fundingDtoToFundingEntityStubData(fundingStubData);
        log.info("새로운 펀딩 게시물을 등록합니다.");
        return new ResponseEntity( fundingMapper.fundingEntityToResponseFundingEntity(stubdata), HttpStatus.OK);
    }

    @PatchMapping("/patch")
    public ResponseEntity patchFundingEntity(@RequestBody FundingDto.PatchFundingDto patchFundingDto){
//        FundingEntity patchingFundingEntity = fundingMapper.fundingPatchDtoToFundingEntity(patchFundingDto);
//        FundingEntity patchedFundingEntity = fundingEntityService.createFundingEntity(patchingFundingEntity);
//        return new ResponseEntity( fundingMapper.fundingEntityToResponseFundingEntity(patchedFundingEntity), HttpStatus.OK);

        FundingEntity stubdata =  fundingMapper.fundingDtoToFundingEntityStubData(fundingStubData);
        stubdata.setTitle("펀딩 게시글 제목 수정완료");
        stubdata.setBody("펀딩 게시글 내용 수정완료");

        log.info("기존 펀딩 게시물을 수정합니다.");
        return new ResponseEntity( fundingMapper.fundingEntityToResponseFundingEntity(stubdata), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity getFundingEntity(@RequestBody FundingDto.GetFundingDto getFundingDto){
//        FundingEntity foundFundingEntity = fundingEntityService.findFundingEntity(getFundingDto.getFundingEntityId());
//        return new ResponseEntity( fundingMapper.fundingEntityToResponseFundingEntity(foundFundingEntity), HttpStatus.OK);
        log.info("기존 펀딩 게시글을 가져옵니다.");

        FundingEntity stubdata =  fundingMapper.fundingDtoToFundingEntityStubData(fundingStubData);
        return new ResponseEntity( fundingMapper.fundingEntityToResponseFundingEntity(stubdata), HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity deleteFundingEntity(@RequestBody FundingDto.DeleteFundingDto deleteFundingDto){

        fundingEntityService.removeFundingEntity(deleteFundingDto.getFundingEntityId());
        log.info("기존 패션픽업 게시글을 삭제합니다.");
        return new ResponseEntity(HttpStatus.OK);



    }


}
