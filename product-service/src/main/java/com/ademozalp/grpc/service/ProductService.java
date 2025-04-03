package com.ademozalp.grpc.service;


import com.ademozalp.grpc.converter.ProductConverter;
import com.ademozalp.grpc.dto.ProductResponse;
import com.ademozalp.grpc.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public List<ProductResponse> getAll() {
        return repository.findAll().stream()
                .map(ProductConverter::toResponse).toList();
    }
}
