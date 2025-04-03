package com.ademozalp.grpc.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
    private Long id;
    private boolean active;
    private String name;
    private String description;
    private BigDecimal price;
    private Long stockQuantity;
    private Set<CategoryResponse> categories;
}
