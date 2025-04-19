package com.ademozalp.gRPC.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class PaymentRequest {
    @Size(min = 1, message = "Minimum 1 product id is required")
    private final List<Long> productIds = new ArrayList<>();
}