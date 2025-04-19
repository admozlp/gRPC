package com.ademozalp.gRPC.model;

import com.ademozalp.gRPC.model.enums.PaymentStatus;
import com.ademozalp.grpc.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

import static com.ademozalp.grpc.util.DbConstant.PAYMENTS;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = PAYMENTS)
public class Payment extends BaseEntity {
    @Column(nullable = false)
    private BigDecimal amount;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus status = PaymentStatus.PENDING;
}
