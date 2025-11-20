package com.bankapp.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class FraudService {
	public boolean validate(int from, int to, BigDecimal amount) {
		System.out.println("Validating fraud for " + amount + " transfer...");
		return amount.compareTo(new BigDecimal("100000")) < 0;
	}
}
