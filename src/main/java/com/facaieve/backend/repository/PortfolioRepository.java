package com.facaieve.backend.repository;

import com.facaieve.backend.entity.post.PortfolioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<PortfolioEntity,Long> {
}
