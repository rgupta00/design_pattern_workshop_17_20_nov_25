package com.bankapp.exceptions;
//Core java--> dp
public class BankAccountDataAccessException extends RuntimeException{
	private static final long serialVersionUID = 6115120847499794478L;

	public BankAccountDataAccessException(String message) {
		super(message);
	}
}
