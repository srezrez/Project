package by.htp.login.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WrapMySqlConnect implements AutoCloseable{
	
	private Connection con;
	
	public Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://localhost/user?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, user, pass);
		} catch(ClassNotFoundException e) {
			throw new SQLException("Driver not loaded", e);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void close() throws Exception {
		con.close();
		
	}

}
