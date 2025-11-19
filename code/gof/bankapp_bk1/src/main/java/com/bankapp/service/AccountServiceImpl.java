package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bankapp.dao.AccountDao;
import com.bankapp.dto.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
	private final AccountDao accountDao;
	private final TransactionLoggerService loggerService;
	private final TransactionIdGenerationService generationService;

	//@Lookup annotation
	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

	@Override
	public Account getById(int id) {
		Account account = accountDao.getById(id);
		if (account == null) {
			throw new BankAccountNotFoundException("account with id :" + id + " is not found");
		}
		return account;
	}

	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {
		Account fromAcc = accountDao.getById(toAccId);
		fromAcc.setBalance(fromAcc.getBalance().subtract(amount));

		Account toAcc = accountDao.getById(fromAccId);
		toAcc.setBalance(toAcc.getBalance().add(amount));

		accountDao.updateAccount(toAcc);
		accountDao.updateAccount(toAcc);
		
		loggerService.log("tx happens successfully: "+ generationService.getTransactionId());

	}

}
