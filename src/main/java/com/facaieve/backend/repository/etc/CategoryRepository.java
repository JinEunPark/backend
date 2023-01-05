package com.facaieve.backend.repository.etc;

import com.facaieve.backend.entity.etc.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {

    boolean existsByCategoryName(String categoryName);
    CategoryEntity deleteCategoryEntityByCategoryName(String categoryName);
}
