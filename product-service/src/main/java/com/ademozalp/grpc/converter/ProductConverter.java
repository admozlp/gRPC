package com.ademozalp.grpc.converter;

import com.ademozalp.grpc.dto.ProductResponse;
import com.ademozalp.grpc.model.Product;

import java.util.stream.Collectors;

public class ProductConverter {
    private ProductConverter() {
    }

    public static ProductResponse toResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .active(product.isActive())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .stockQuantity(product.getStockQuantity())
                .categories(product.getCategories().stream().map(CategoryConverter::toResponse).collect(Collectors.toSet()))
                .build();
    }
}
