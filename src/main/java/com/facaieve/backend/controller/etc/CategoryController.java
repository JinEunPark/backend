package com.facaieve.backend.controller.etc;

import com.facaieve.backend.dto.etc.CategoryDTO;
import com.facaieve.backend.entity.etc.CategoryEntity;
import com.facaieve.backend.mapper.etc.CategoryMapper;
import com.facaieve.backend.service.etc.CategoryService;
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
