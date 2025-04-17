package com.ademozalp.grpc.service;


import com.ademozalp.grpc.converter.ProductConverter;
import com.ademozalp.grpc.dto.ProductResponse;
import com.ademozalp.grpc.exception.ProductException;
import com.ademozalp.grpc.model.Product;
import com.ademozalp.grpc.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public List<ProductResponse> getAll() {
        return repository.findAll().stream()
                .map(ProductConverter::toResponse).toList();
    }

    public BigDecimal getTotalPriceByProductIdList(List<Long> productIdList) {
        List<Product> products = repository.findAllById(productIdList);
        if (productIdList.size() != products.size()) {
            throw new ProductException("Some Product not found", HttpStatus.NO_CONTENT);
        }

        return products.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
