package com.bankapp.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TransactionIdGenerationService {
	private String transactionId;

	public TransactionIdGenerationService() {
		this.transactionId = "TXN-" + System.currentTimeMillis();
		System.out.println("Creating new TransactionPrototype: " + transactionId);
	}

	public String getTransactionId() {
		return transactionId;
	}
}
