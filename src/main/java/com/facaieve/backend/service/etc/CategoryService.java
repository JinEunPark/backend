package com.facaieve.backend.service.etc;

import com.facaieve.backend.entity.etc.CategoryEntity;
import com.facaieve.backend.repository.etc.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public CategoryEntity createCategoryEntity(CategoryEntity categoryEntity){
        if(categoryRepository.existsByCategoryName(categoryEntity.getCategoryName())){
            throw new RuntimeException("there is already exists category");

        }else{
            CategoryEntity savedCategoryEntity  = categoryRepository.save(categoryEntity);
            return savedCategoryEntity;
        }
    }


    public CategoryEntity deleteCategoryEntity(CategoryEntity categoryEntity){
        if(categoryRepository.existsByCategoryName(categoryEntity.getCategoryName())){
            return categoryRepository.deleteCategoryEntityByCategoryName(categoryEntity.getCategoryName());
        }else{
            throw new RuntimeException("there is no kind of category");
        }
    }
}
