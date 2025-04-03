package com.ademozalp.grpc.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

import static com.ademozalp.grpc.util.DbConstant.CATEGORIES;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = CATEGORIES)
public class Category extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToMany(mappedBy = CATEGORIES)
    private Set<Product> products;
}
