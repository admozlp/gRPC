package com.ademozalp.grpc.dto.order;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {
    private BigDecimal totalPrice;
    private String note;
    private List<Long> productIds;
}
