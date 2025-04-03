package com.ademozalp.grpc.converter;

import com.ademozalp.grpc.dto.CategoryResponse;
import com.ademozalp.grpc.model.Category;

public class CategoryConverter {
    private CategoryConverter() {

    }

    public static CategoryResponse toResponse(Category category) {
        return CategoryResponse.builder()
                .id(category.getId())
                .active(category.isActive())
                .name(category.getName())
                .description(category.getDescription())
                .build();
    }
}
