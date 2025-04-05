package com.ademozalp.grpc.dto.order;


import com.ademozalp.grpc.model.enm.OrderStatus;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {
    private Long id;
    private String orderNumber;
    private BigDecimal totalPrice;
    private OrderStatus status;
    private String note;

    private List<Long> productIds;
}
