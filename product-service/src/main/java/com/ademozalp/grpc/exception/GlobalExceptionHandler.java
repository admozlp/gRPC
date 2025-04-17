package com.ademozalp.grpc.exception;

import com.ademozalp.grpc.dto.APIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductException.class)
    public ResponseEntity<APIResponse> handleProductException(ProductException exception) {
        return ResponseEntity.status(exception.getHttpStatus())
                .body(APIResponse.builder()
                        .message(exception.getMessage())
                        .build());
    }
}
