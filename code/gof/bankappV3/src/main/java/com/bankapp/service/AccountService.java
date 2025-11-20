package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import com.bankapp.dto.Account;
import com.bankapp.dto.TransactionType;
//Brain of ur app
public interface AccountService {
    public List<Account> getAll();
    public Account getById(int id);
    public void transfer(int fromAccId, int toAccId, BigDecimal amount, TransactionType transactionType);
 
}
