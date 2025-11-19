package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bankapp.dao.AccountDao;
import com.bankapp.dto.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.service.aspect.MyLoggable;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
	private final AccountDao accountDao;

	// @Lookup annotation
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

	@MyLoggable
	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {
		
		Account fromAcc = accountDao.getById(toAccId);
		fromAcc.setBalance(fromAcc.getBalance().subtract(amount));

		Account toAcc = accountDao.getById(fromAccId);
		toAcc.setBalance(toAcc.getBalance().add(amount));

		accountDao.updateAccount(toAcc);
		accountDao.updateAccount(toAcc);
	}

}
