package com.ndtiep.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudsterCustomer(Integer customerId){
        fraudCheckHistoryRepository.save(FraudCheckHistory.builder().isFraudster(false).customerId(customerId).createAt(LocalDateTime.now()).build());
        return false;
    }
}
