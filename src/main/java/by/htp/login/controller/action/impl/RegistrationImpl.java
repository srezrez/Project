package by.htp.login.controller.action.impl;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import by.htp.login.bean.User;
import by.htp.login.controller.action.BaseAction;
import by.htp.login.controller.util.RequestParamValidator;
import by.htp.login.service.UserService;
import by.htp.login.service.impl.UserServiceImpl;

import static by.htp.login.controller.util.ControllerConstantPool.*;

public class RegistrationImpl implements BaseAction{
	
	private UserService userService = new UserServiceImpl();

	@Override
	public String chooseAction(HttpServletRequest request) throws SQLException {
		
		String login = request.getParameter(COMMAND_LOGIN);
		String pass = request.getParameter(COMMAND_PASS);
		RequestParamValidator.validateUserLoginPass(login, pass);
	
		String page = "";
		User regUser = new User(login, pass, USER_ROLE_USER);
		
		if(userService.checkRegistration(regUser) == true) {
			page= PAGE_INDEX;
		} else {
			page = PAGE_ERROR_REGISTRATION;
		}
		
		return page;
	}

}
