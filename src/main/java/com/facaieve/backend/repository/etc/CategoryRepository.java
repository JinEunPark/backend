package com.facaieve.backend.repository.etc;

import com.facaieve.backend.entity.etc.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
}
