package com.ademozalp.grpc.repository;

import com.ademozalp.grpc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
