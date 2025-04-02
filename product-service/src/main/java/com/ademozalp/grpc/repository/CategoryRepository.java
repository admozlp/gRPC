package com.ademozalp.grpc.repository;

import com.ademozalp.grpc.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
