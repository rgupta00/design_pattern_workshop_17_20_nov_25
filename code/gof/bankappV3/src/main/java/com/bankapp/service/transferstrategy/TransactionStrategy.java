package com.bankapp.service.transferstrategy;

import java.math.BigDecimal;

import com.bankapp.dto.Account;

public interface TransactionStrategy {
    void transfer(Account from, Account to, BigDecimal amount);
}
