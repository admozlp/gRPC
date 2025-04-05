package com.ademozalp.gRPC.model;

import com.ademozalp.grpc.model.BaseEntity;
import com.ademozalp.grpc.model.enm.OrderStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.List;

import static com.ademozalp.grpc.util.DbConstant.ORDERS;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = ORDERS, indexes = @Index(name = "idx_order_number", columnList = "orderNumber"))
@Entity
public class Order extends BaseEntity {
    @Column(nullable = false)
    private String orderNumber;
    @Column(nullable = false)
    private BigDecimal totalPrice;
    @Column(nullable = false)
    @Builder.Default
    private OrderStatus status = OrderStatus.PENDING;
    private String note;

    private List<Long> productIds;
}
