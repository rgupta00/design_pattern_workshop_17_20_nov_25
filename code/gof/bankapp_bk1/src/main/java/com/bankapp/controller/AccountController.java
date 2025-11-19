package com.bankapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.Account;
import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.AccountService;

@RestController
@RequestMapping(path = "api")
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	//get all account
	@GetMapping(path = "accounts")
	public List<Account> getAll(){
		return accountService.getAll();
	}
	
	//get by id 
	@GetMapping(path = "accounts/{id}")
	public Account getById(@PathVariable("id") int id) {
		return accountService.getById(id);
	}
	
	//transfer 
	@PostMapping(path = "transfer")
	public String transfer(@RequestBody TransferDto transferDto) {
		accountService.transfer(transferDto.getFromAccId(),
				transferDto.getToAccId(), transferDto.getAmount());
		
		return "transfer successfully";
	}
	//deposit
	@PostMapping(path = "deposit")
	public String deposit(@RequestBody DepositDto depositDto) {
		
		
		return "deposit successfully";
	}
	
	//withdraw
	@PostMapping(path = "withdraw")
	public String withdraw(@RequestBody WithdrawDto withdrawDto) {
		
		
		return "withdraw successfully";
	}
	
	
}
