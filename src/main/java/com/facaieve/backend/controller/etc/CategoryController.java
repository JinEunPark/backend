package com.facaieve.backend.controller.etc;

import com.facaieve.backend.dto.etc.CategoryDTO;
import com.facaieve.backend.entity.etc.CategoryEntity;
import com.facaieve.backend.mapper.etc.CategoryMapper;
import com.facaieve.backend.service.etc.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
@AllArgsConstructor

public class CategoryController {

    @Autowired
    CategoryService categoryService;
    CategoryMapper categoryMapper;


    @PostMapping("/post")
    public ResponseEntity postCategory(@RequestBody CategoryDTO.RequestCategoryDTO requestCategoryDTO){

        CategoryEntity categoryEntity = categoryMapper.requestCategoryToCategoryEntity(requestCategoryDTO);
        return new ResponseEntity(categoryService.createCategoryEntity(categoryEntity), HttpStatus.CREATED);

    }

    public ResponseEntity deleteCategory(@RequestBody CategoryDTO.RequestCategoryDTO requestCategoryDTO){

        CategoryEntity categoryEntity = categoryMapper.requestCategoryToCategoryEntity(requestCategoryDTO);
        return new ResponseEntity(categoryService.deleteCategoryEntity(categoryEntity), HttpStatus.OK);//todo 여기서 ok 사인을 보내는게 맞나요
    }


}
