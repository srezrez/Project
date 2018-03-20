package by.htp.login.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.login.bean.User;
import by.htp.login.dao.UserDao;

public class UserDaoMySqlImpl extends AbstractDaoMySqlImpl implements UserDao{
	
	private static final String SQL_INSERT_USER = "INSERT INTO userinf(login, pass, role) values ( ?, ?, ?)";
	private static final String SQL_SELECT_USER = "select id, role, login, pass from userinf where login = ? and pass = ?";
	private static final String SQL_SELECT_USER_ALL = "select id, role, login, pass from userinf";
	
	@Override
	public List<User> readAll() {
		List<User> users = new ArrayList<>();
		try {
			Connection con = wcn.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_USER_ALL);
			while(rs.next()) {
				users.add(createUser(rs));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public User createUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt(SQL_USER_ID));
		user.setLogin(rs.getString(SQL_USER_LOGIN));
		user.setPass(rs.getString(SQL_USER_PASS));
		user.setRole(rs.getString(SQL_USER_ROLE));
		return user;
	}
	
	@Override
	public User readUser(User userIn) {
		User user = null;
		try {
			Connection con =wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_USER);
			ps.setString(1, userIn.getLogin());
			ps.setString(2, userIn.getPass());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user = createUser(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public void create(User user) {
		try {
			Connection con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_INSERT_USER);
			ps.setString(1, user.getLogin());
			ps.setString(2, user.getPass());
			ps.setString(3, user.getRole());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public User read(int id) {
		return null;
	}
	@Override
	public void update(User t) {
		
	}
	@Override
	public void delete(int id) {
		
	}

}
