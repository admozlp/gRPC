package com.ademozalp.grpc.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryResponse {
    private Long id;
    private boolean active;
    private String name;
    private String description;
}
