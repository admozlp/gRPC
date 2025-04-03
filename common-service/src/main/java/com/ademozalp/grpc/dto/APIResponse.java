package com.ademozalp.grpc.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class APIResponse {
    private Object data;
    private String message;
}
