package com.bankapp.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bankapp.dto.Account;
//Act as a callback that is used in jdbctemplate?
//so that spring know after teaching the row from db-> how to map to the ob

public class AccountRowMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		return Account.builder()
				.id(rs.getInt(1))
				.name(rs.getString(2))
				.balance(rs.getBigDecimal(3))
				.build();
	}

}
