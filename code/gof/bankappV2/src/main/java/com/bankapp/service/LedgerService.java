package com.bankapp.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class LedgerService {
    public void record(int from, int to, BigDecimal amount) {
        System.out.println("Ledger updated: Transfer of " + amount + " from " + from + " to " + to);
    }
}