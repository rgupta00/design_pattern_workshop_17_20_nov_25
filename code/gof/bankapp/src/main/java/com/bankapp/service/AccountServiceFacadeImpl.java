package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bankapp.dto.Account;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceFacadeImpl implements AccountServiceFacade {
	private final AccountService accountService;
	private final FraudService fraudService;
	private final NotificationService notificationService;
	private final LedgerService ledgerService;

	@Override
	public List<Account> getAll() {
		return accountService.getAll();
	}

	@Override
	public Account getById(int id) {
		return accountService.getById(id);
	}

	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {
		fraudService.validate(fromAccId, toAccId, amount);
		accountService.transfer(fromAccId, toAccId, amount);
		ledgerService.record(fromAccId, toAccId, amount);
		notificationService.send("rgupta.mtech@gmail.com");
	}
}
