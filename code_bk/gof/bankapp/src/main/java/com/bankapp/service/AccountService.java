package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import com.bankapp.dto.Account;

public interface AccountService {
    public List<Account> getAll();
    public Account getById(int id);
    public void transfer(int fromAccId, int toAccId, BigDecimal amount);
 
}
