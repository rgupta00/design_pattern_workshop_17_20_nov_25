package com.bankapp.service.transferstrategy;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bankapp.dto.Account;

@Service("RTGS")
public class RTGSStrategy implements TransactionStrategy {
    @Override
    public void transfer(Account from, Account to, BigDecimal amount) {
        System.out.println("Processing RTGS transfer with high-value check...");
        if (amount.compareTo(new BigDecimal("200000")) < 0) {
            throw new IllegalArgumentException("RTGS minimum amount should be ₹2,00,000");
        }
        from.setBalance(from.getBalance().subtract(amount));
        to.setBalance(to.getBalance().add(amount));
    }
}
