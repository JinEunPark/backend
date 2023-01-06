package com.facaieve.backend.controller.post;


import com.facaieve.backend.mapper.post.PortfolioMapper;
import com.facaieve.backend.dto.PortfolioDto;
import com.facaieve.backend.entity.post.PortfolioEntity;
import com.facaieve.backend.service.PortfolioEntityService;
import com.facaieve.backend.stubDate.PortfolioStubData;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/portfolio")
@AllArgsConstructor
public class PortfolioEntityController {

    PortfolioEntityService portfolioEntityService;
    PortfolioMapper portfolioMapper;

    static final PortfolioStubData portfolioStubData = new PortfolioStubData();

    // 서비스 레이어 구현이 안되어 Stub 데이터로 대체(추후 변경 예정)

    @PostMapping("/post")
    public ResponseEntity postPortfolioEntity(@RequestBody PortfolioDto.PostPortfolioDtoDto postPortfolioDtoDto) {
//        PortfolioEntity postingPortfolioEntity = portfolioMapper.portfolioPostDtoToPortfolioEntity(postPortfolioDtoDto);
//        PortfolioEntity postedPortfolioEntity = portfolioEntityService.createPortfolioEntity(postingPortfolioEntity);
//        return new ResponseEntity( portfolioMapper.portfolioEntityToResponsePortfolioEntity(postedPortfolioEntity), HttpStatus.OK);

        PortfolioEntity stubdata =  portfolioMapper.portfolioDtoToFashionPickupStubData(portfolioStubData);
        log.info("새로운 포트폴리오 게시물을 등록합니다.");
        return new ResponseEntity( portfolioMapper.portfolioEntityToResponsePortfolioEntity(stubdata), HttpStatus.OK);
    }

    @PatchMapping("/patch")
    public ResponseEntity patchPortfolioEntity(@RequestBody PortfolioDto.PatchPortfolioDtoDto patchPortfolioDtoDto){
//        PortfolioEntity patchingPortfolioEntity = portfolioMapper.portfolioPatchDtoToPortfolioEntity(patchPortfolioDtoDto);
//        PortfolioEntity patchedPortfolioEntity = portfolioEntityService.editPortfolioEntity(patchingPortfolioEntity);
//        return new ResponseEntity( portfolioMapper.portfolioEntityToResponsePortfolioEntity(patchedPortfolioEntity), HttpStatus.OK);

        PortfolioEntity stubdata =  portfolioMapper.portfolioDtoToFashionPickupStubData(portfolioStubData);
        stubdata.setBody("포트폴리오 게시글 내용 수정완료");
        stubdata.setTitle("포트폴리오 게시글 제목 수정완료");

        log.info("기존 포트폴리오 게시물을 수정합니다.");
        return new ResponseEntity( portfolioMapper.portfolioEntityToResponsePortfolioEntity(stubdata), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity getPortfolioEntity(@RequestBody PortfolioDto.GetPortfolioDtoDto getPortfolioDtoDto){
//        PortfolioEntity foundPortfolioEntity = portfolioEntityService.findPortfolioEntity(getPortfolioDtoDto.getPortfolioEntityId());
//        return new ResponseEntity( portfolioMapper.portfolioEntityToResponsePortfolioEntity(foundPortfolioEntity), HttpStatus.OK);
//        log.info("기존 패션픽업 게시글을 가져옵니다.");

        PortfolioEntity stubdata =  portfolioMapper.portfolioDtoToFashionPickupStubData(portfolioStubData);
        return new ResponseEntity( portfolioMapper.portfolioEntityToResponsePortfolioEntity(stubdata), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deletePortfolioEntity(@RequestBody PortfolioDto.DeletePortfolioDtoDto deletePortfolioDtoDto){

        portfolioEntityService.removePortfolioEntity(deletePortfolioDtoDto.getPortfolioEntityId());
        log.info("기존 패션픽업 게시글을 삭제합니다.");
        return new ResponseEntity(HttpStatus.OK);



    }


}
