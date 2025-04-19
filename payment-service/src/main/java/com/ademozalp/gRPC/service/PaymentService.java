package com.ademozalp.gRPC.service;


import com.ademozalp.gRPC.dto.PaymentRequest;
import com.ademozalp.gRPC.dto.PaymentResponse;
import com.ademozalp.gRPC.model.enums.PaymentStatus;
import com.ademozalp.gRPC.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentService {
    private final PaymentRepository repository;

    public PaymentResponse createPayment(PaymentRequest request) {
        // gRPC kullanarak productIds listesini order service'e gönder, toplam tutarını al
        // order service'den gelen toplam tutarı kullanarak payment'ı oluştur, bankaya gönder
        // bankadan gelen duruma göre payment status'ünü güncelle
        // kafka topic'e paymentı yazarak order service'e gönder

        PaymentStatus.valueOf("dasd");
        return PaymentResponse.builder().build();
    }
}
