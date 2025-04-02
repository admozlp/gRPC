package com.ademozalp.grpc.service;

import com.ademozalp.grpc.model.Product;
import com.ademozalp.grpc.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryService {
    private final CategoryRepository repository;

    public void save() {
        Product product = new Product();

    }
}
