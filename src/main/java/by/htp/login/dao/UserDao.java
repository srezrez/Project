package by.htp.login.dao;

import java.util.List;

import by.htp.login.bean.User;

public interface UserDao extends BaseDao<User>{
	
	List<User> readAll();
	User readUser(User user);

}
