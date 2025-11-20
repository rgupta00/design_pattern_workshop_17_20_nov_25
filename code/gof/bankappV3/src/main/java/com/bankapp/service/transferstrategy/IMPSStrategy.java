package com.bankapp.service.transferstrategy;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bankapp.dto.Account;

@Service("IMPS")
public class IMPSStrategy implements TransactionStrategy {
    @Override
    public void transfer(Account from, Account to, BigDecimal amount) {
        System.out.println("Processing IMPS instant transfer...");
        from.setBalance(from.getBalance().subtract(amount));
        to.setBalance(to.getBalance().add(amount));
    }
}