package com.ademozalp.grpc.controller;

import com.ademozalp.grpc.dto.APIResponse;
import com.ademozalp.grpc.model.enm.Message;
import com.ademozalp.grpc.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/products")
public class ProductController {
    private final ProductService service;

    @GetMapping
    public ResponseEntity<APIResponse> getAll() {
        return ResponseEntity.ok(APIResponse.builder()
                .data(service.getAll())
                .message(Message.LISTED.getMessage())
                .build());
    }


}
