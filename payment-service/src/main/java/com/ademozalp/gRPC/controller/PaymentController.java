package com.ademozalp.gRPC.controller;


import com.ademozalp.gRPC.dto.PaymentRequest;
import com.ademozalp.gRPC.service.PaymentService;
import com.ademozalp.grpc.dto.APIResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService service;


    @PostMapping
    public ResponseEntity<APIResponse> createPayment(@RequestBody @Valid PaymentRequest request) {
        return ResponseEntity.ok(
                APIResponse.builder()
                        .message("Payment processed successfully")
                        .data(service.createPayment(request))
                        .build());
    }
}
