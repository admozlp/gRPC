package com.ademozalp.gRPC.model.enums;

public enum PaymentStatus {
    PENDING,
    COMPLETED,
    FAILED;

    public static PaymentStatus fromValue(String value) {
        for (PaymentStatus status : PaymentStatus.values()) {
            if (status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown payment status: " + value);
    }
}
