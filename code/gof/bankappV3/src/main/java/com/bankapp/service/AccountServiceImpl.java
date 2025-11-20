package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.dao.AccountDao;
import com.bankapp.dto.Account;
import com.bankapp.dto.TransactionType;
import com.bankapp.exceptions.AEx;
import com.bankapp.exceptions.BankAccountDataAccessException;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.service.aspect.MyLoggable;
import com.bankapp.service.transferstrategy.TransactionStrategy;
import com.bankapp.service.transferstrategy.TransactionStrategyFactory;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class AccountServiceImpl implements AccountService {
	
	private final AccountDao accountDao;
	private final TransactionStrategyFactory transactionStrategyFactory;
	
	// @Lookup annotation
	@Transactional(readOnly = true)
	@Override
	public List<Account> getAll() {
		return accountDao.getAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Account getById(int id) {
		Account account= accountDao.getById(id);
		if(account==null) {
			throw new BankAccountNotFoundException("account with id "+ id +"is not found");
		}
		return account;
	}
	//tx mgt if u have unchecked ex ...tx will rollback if u have checeked ex tx will not rollback
	@Transactional//(noRollbackFor = {AEx.class})
	@MyLoggable
	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount, 
			TransactionType transactionType) {

		Account fromAcc = accountDao.getById(fromAccId);
		
		Account toAcc = accountDao.getById(toAccId);
		
		TransactionStrategy transactionStrategy=transactionStrategyFactory.getStrategy(transactionType);
		
		transactionStrategy.transfer(fromAcc, toAcc, amount);
		
		accountDao.updateAccount(fromAcc);

		accountDao.updateAccount(toAcc);
	}

}
