package com.bankapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bankapp.dto.Account;
@EnableAspectJAutoProxy
@SpringBootApplication
public class BankappApplication implements CommandLineRunner{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		if(dataSource!=null) {
			System.out.println("dataSource configured--------------");
		}
		
		if(jdbcTemplate!=null) {
			System.out.println("jdbcTemplate configured--------------");
		}
	}

}
