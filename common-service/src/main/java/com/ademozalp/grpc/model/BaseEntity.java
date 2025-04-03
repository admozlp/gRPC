package com.ademozalp.grpc.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_active")
    @Builder.Default
    private boolean active = true;

    @Column(name = "is_deleted")
    @Builder.Default
    private boolean deleted = false;
}
