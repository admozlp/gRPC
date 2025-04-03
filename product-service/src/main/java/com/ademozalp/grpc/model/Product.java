package com.ademozalp.grpc.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Set;

import static com.ademozalp.grpc.util.DbConstant.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = PRODUCTS)
public class Product extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Long stockQuantity;

    @ManyToMany
    @JoinTable(name = CATEGORY_PRODUCT,
            joinColumns = @JoinColumn(name = PRODUCT_ID),
            inverseJoinColumns = @JoinColumn(name = CATEGORY_ID))
    private Set<Category> categories;
}
