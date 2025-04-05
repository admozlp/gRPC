package com.ademozalp.gRPC.service;

import com.ademozalp.gRPC.converter.OrderConverter;
import com.ademozalp.gRPC.model.Order;
import com.ademozalp.gRPC.repository.OrderRepository;
import com.ademozalp.grpc.dto.order.OrderRequest;
import com.ademozalp.grpc.dto.order.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;

    public OrderResponse createOrder(OrderRequest request) {
        Order order = OrderConverter.toEntity(request, createOrderNumber());
        repository.save(order);
        return OrderConverter.toResponse(order);
    }

    private String createOrderNumber() {
        do {
            long orderNumber = ThreadLocalRandom.current().nextLong(1L, 999999999999999999L);
            if (!repository.existsByOrderNumber(String.valueOf(orderNumber))) {
                return String.valueOf(orderNumber);
            }
        } while (true);
    }
}
