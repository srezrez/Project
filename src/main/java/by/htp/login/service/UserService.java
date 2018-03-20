package by.htp.login.service;

import by.htp.login.bean.User;

public interface UserService {
	
	User authorizeUser(String login, String pass);

	boolean checkRegistration(User user);

}
