package com.bankapp.service.transferstrategy;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bankapp.dto.Account;

@Service("NEFT")
public class NEFTStrategy implements TransactionStrategy {
    @Override
    public void transfer(Account from, Account to, BigDecimal amount) {
        System.out.println("Processing NEFT transfer...");
        from.setBalance(from.getBalance().subtract(amount));
        to.setBalance(to.getBalance().add(amount));
    }
}