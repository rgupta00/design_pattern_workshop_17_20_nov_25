package com.bankapp.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.bankapp.dao.mapper.AccountRowMapper;
import com.bankapp.dto.Account;

import lombok.AllArgsConstructor;

@Repository
@Primary
@AllArgsConstructor
public class AccountDaoImpl implements AccountDao {

	private final JdbcTemplate jdbcTemplate;

	@Override
	public List<Account> getAll() {
		return jdbcTemplate
				.query("SELECT id, name, balance FROM acc_table", new AccountRowMapper());
	}

	@Override
	public Account getById(int id) {
		String sql = "SELECT id, name, balance FROM acc_table WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new AccountRowMapper(), id);
	}

	@Override
	public void updateAccount(Account account) {
		String sql = "UPDATE acc_table SET balance = ? WHERE id = ?";
		 jdbcTemplate.update(sql, new Object[] {account.getBalance(), account.getId()});

	}

	@Override
	public void addAccount(Account account) {
		String sql = "INSERT INTO acc_table (name, balance) VALUES (?, ?)";

	    KeyHolder keyHolder = new GeneratedKeyHolder();

	    jdbcTemplate.update(connection -> {
	        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	        ps.setString(1, account.getName());
	        ps.setBigDecimal(2, account.getBalance());
	        return ps;
	    }, keyHolder);

	    // set generated ID back to object
	    account.setId(keyHolder.getKey().intValue());
	}

}
