package com.bankapp.service;

import org.springframework.stereotype.Service;

@Service
public class TransactionLoggerService {
	public void log(String message) {
		System.out.println("[LOG] " + message);
	}
}
