package com.facaieve.backend.repository.etc;

import com.facaieve.backend.entity.etc.MyPickEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyPickRepository extends JpaRepository<MyPickEntity,Long> {
}
