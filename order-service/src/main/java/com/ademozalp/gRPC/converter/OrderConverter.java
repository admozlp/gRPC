package com.ademozalp.gRPC.converter;

import com.ademozalp.gRPC.model.Order;
import com.ademozalp.grpc.dto.order.OrderRequest;
import com.ademozalp.grpc.dto.order.OrderResponse;

public class OrderConverter {
    private OrderConverter() {

    }

    public static OrderResponse toResponse(Order order) {
        return OrderResponse.builder()
                .id(order.getId())
                .orderNumber(order.getOrderNumber())
                .totalPrice(order.getTotalPrice())
                .status(order.getStatus())
                .note(order.getNote())
                .productIds(order.getProductIds())
                .build();
    }

    public static Order toEntity(OrderRequest request, String orderNumber) {
        return Order.builder()
                .orderNumber(orderNumber)
                .totalPrice(request.getTotalPrice())
                .note(request.getNote())
                .productIds(request.getProductIds())
                .build();
    }
}
