package com.ademozalp.grpc.service;

import com.ademozalp.grpc.model.Product;
import com.ademozalp.grpc.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public void save() {
        Product product = new Product();

    }
}
