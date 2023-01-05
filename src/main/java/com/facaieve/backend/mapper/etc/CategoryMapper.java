package com.facaieve.backend.mapper.etc;

import com.facaieve.backend.dto.etc.CategoryDTO;
import com.facaieve.backend.entity.etc.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryEntity requestCategoryToCategoryEntity(CategoryDTO.RequestCategoryDTO requestCategoryDTO);
}
