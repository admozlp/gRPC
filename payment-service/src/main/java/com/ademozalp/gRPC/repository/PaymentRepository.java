package com.ademozalp.gRPC.repository;

import com.ademozalp.gRPC.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}