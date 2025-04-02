package com.ademozalp.grpc.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

import static com.ademozalp.grpc.util.DbConstant.CATEGORIES;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = CATEGORIES)
public class Category extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Lob
    private String description;

    @ManyToMany(mappedBy = CATEGORIES)
    private Set<Product> products;
}
