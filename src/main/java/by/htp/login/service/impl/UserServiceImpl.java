package by.htp.login.service.impl;

import by.htp.login.bean.User;
import by.htp.login.dao.UserDao;
import by.htp.login.dao.impl.UserDaoMySqlImpl;
import by.htp.login.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao = new UserDaoMySqlImpl();

	@Override
	public User authorizeUser(String login, String pass) {
		
		User user = new User(login, pass);
		return userDao.readUser(user);
	}

	@Override
	public boolean checkRegistration(User user) {
		if(userDao.readUser(user) == null) {
			userDao.create(user);
			return true;
		}
		return false;
	}

}
