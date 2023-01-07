package com.facaieve.backend.controller.etc;

import com.facaieve.backend.dto.UserDto;
import com.facaieve.backend.dto.etc.CategoryDTO;
import com.facaieve.backend.entity.etc.CategoryEntity;
import com.facaieve.backend.mapper.etc.CategoryMapper;
import com.facaieve.backend.service.etc.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;// todo import this thing
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@Slf4j
@RestController
@RequestMapping("category")
@AllArgsConstructor

public class CategoryController {


    CategoryService categoryService;
    CategoryMapper categoryMapper;

//
//    @Operation(summary="category를 db에서 가져옴", description = "categoryEntity 를 데이터 베이스에서 tagName 변수를 사용해서 가져올 수 있음")
//    @ApiResponses({
//            @ApiResponse(responseCode = "201" ,description = "태그가 정상으로 등록됨",
//                    content = @Content(schema = @Schema(implementation = UserDto.ResponseUserDto.class))),
//
//            @ApiResponse(responseCode = "400", description = "BAD REQUEST !!"),
//            @ApiResponse(responseCode = "404", description = "NOT FOUND !!"),
//            @ApiResponse(responseCode = "500", description = "서버에서 에러가 발생하였습니다.")
//    })
    @GetMapping("/get")//test pass
    public ResponseEntity readCategory(@RequestBody CategoryDTO.RequestCategoryDTO requestCategoryDTO){

        requestCategoryDTO.setCategoryName("카테고리");

        CategoryEntity categoryEntity = categoryService.getCategory(requestCategoryDTO.getCategoryName());

        return new ResponseEntity (categoryEntity, HttpStatus.OK);
    }

    @PostMapping("/post")//test pass
    public ResponseEntity postCategory(@RequestBody CategoryDTO.RequestCategoryDTO requestCategoryDTO){

        requestCategoryDTO.setCategoryName("카테고리");

        CategoryEntity categoryEntity = categoryMapper.requestCategoryToCategoryEntity(requestCategoryDTO);
        return new ResponseEntity(categoryService.createCategoryEntity(categoryEntity), HttpStatus.CREATED);

    }

    @PatchMapping("/patch")//test pass
    public ResponseEntity patchCategory(@RequestBody CategoryDTO.RequestCategoryDTO requestCategoryDTO){

        requestCategoryDTO.setCategoryId(Long.valueOf(6));
        requestCategoryDTO.setCategoryName("수정된 카텍고리 이름입니다");
        CategoryEntity categoryEntity = categoryMapper.requestCategoryToCategoryEntity(requestCategoryDTO);
        log.info("수정이 완료되었습니다");
        return new ResponseEntity(categoryService.modifyCategoryEntity(categoryEntity), HttpStatus.OK);


    }

    @DeleteMapping("/delete")//test pass
    public void deleteCategory(@RequestBody CategoryDTO.RequestCategoryDTO requestCategoryDTO){
        requestCategoryDTO.setCategoryName("카테고리");
        CategoryEntity categoryEntity = categoryMapper.requestCategoryToCategoryEntity(requestCategoryDTO);
        categoryService.deleteCategoryEntity(categoryEntity);
        log.info("category 를 삭제합니다.");

    }

    //todo 추후에 필요하면 구현함.
//    public ResponseEntity modifyCategory(@RequestBody CategoryDTO.RequestCategoryDTO requestCategoryDTO) {
//
//    }


}
