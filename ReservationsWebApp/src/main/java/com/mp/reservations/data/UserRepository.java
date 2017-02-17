package com.mp.reservations.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mp.reservations.interfaces.IUsersRepository;

@Repository
public class UserRepository implements IUsersRepository {

	private JdbcTemplate jdbcTemplate;
	private static final String SQL_GET_ALL_USERS = "SELECT * FROM USER";
	private static final String SQL_GET_SINGLE_USER = "SELECT * FROM USER WHERE id = ?";
	private static final String SQL_DELETE_USER = "DELETE FROM USER WHERE id = ?";
	private static final String SQL_UPDATE_USER = "UPDATE USER SET first_name = ?, last_name = ? WHERE id = ?";
	private static final String SQL_CREATE_USER = "INSERT INTO USER (first_name, last_name) VALUES (?, ?)";

	public UserRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		List<User> entryList = jdbcTemplate.query(SQL_GET_ALL_USERS, new UserRowMapper());
		return entryList;
	}

	@Override
	public List<User> findUsers(long max, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(SQL_CREATE_USER, new Object[]{user.getName(), user.getSurname()});
	}

	@Override
	public void updateUser(Long id, User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUser(Long id) {
		jdbcTemplate.update(SQL_DELETE_USER, new Object[] { id });

	}

	@Override
	public User findUser(Long id) {
		User user = jdbcTemplate.queryForObject(SQL_GET_SINGLE_USER, new Object[] { id }, new UserRowMapper());
		return user;
	}

	public static class UserRowMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			Long id = rs.getLong("id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			User user = new User(id, firstName, lastName);
			return user;
		}

	}

}
