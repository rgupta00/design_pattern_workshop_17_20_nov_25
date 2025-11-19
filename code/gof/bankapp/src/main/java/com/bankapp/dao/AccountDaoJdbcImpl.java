package com.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.bankapp.dto.Account;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class AccountDaoJdbcImpl implements AccountDao {

	private final DataSource dataSource;

	@Override
	public List<Account> getAll() {
		String sql = "SELECT id, name, balance FROM acc_table";
		List<Account> accounts = new ArrayList<>();

		try (Connection conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				Account account = new Account(rs.getInt("id"), rs.getString("name"), rs.getBigDecimal("balance"));
				accounts.add(account);
			}

		} catch (SQLException e) {
			throw new RuntimeException("Error fetching all accounts", e);
		}

		return accounts;
	}

	@Override
	public Account getById(int id) {
		String sql = "SELECT id, name, balance FROM acc_table WHERE id = ?";
		try (Connection conn = dataSource.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					return new Account(rs.getInt("id"), rs.getString("name"), rs.getBigDecimal("balance"));
				}
			}

		} catch (SQLException e) {
			throw new RuntimeException("Error fetching account by ID: " + id, e);
		}

		return null;
	}

	@Override
	public void updateAccount(Account account) {
		String sql = "UPDATE acc_table SET name = ?, balance = ? WHERE id = ?";

		try (Connection conn = dataSource.getConnection(); 
				PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setString(1, account.getName());
			ps.setBigDecimal(2, account.getBalance());
			ps.setInt(3, account.getId());

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException("Error updating account ID: " + account.getId(), e);
		}

	}

	@Override
	public void addAccount(Account account) {

	}

}
