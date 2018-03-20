package by.htp.login.controller.action.impl;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.htp.login.bean.Book;
import by.htp.login.bean.User;
import by.htp.login.controller.action.BaseAction;
import by.htp.login.service.BookService;
import by.htp.login.service.UserService;
import by.htp.login.service.impl.BookServiceImpl;
import by.htp.login.service.impl.UserServiceImpl;
import by.htp.login.controller.util.RequestParamValidator;

import static by.htp.login.controller.util.ControllerConstantPool.*;


public class CheckLoginImpl implements BaseAction{
	
	private UserService userService = new UserServiceImpl();
	private BookService bookService = new BookServiceImpl();
	

	@Override
	public String chooseAction(HttpServletRequest request) throws SQLException {
		
		String login = request.getParameter(COMMAND_LOGIN);
		String pass = request.getParameter(COMMAND_PASS);
		RequestParamValidator.validateUserLoginPass(login, pass);
		
		User user = userService.authorizeUser(login, pass);
		if(user != null) {
			if(user.getRole().equals(USER_ROLE_ADMIN)) {
				List<Book> books = (List<Book>) bookService.getBookCatalog();
				request.setAttribute(REQUEST_PARAM_BOOK_LIST, books);
				return PAGE_ADMIN_MAIN;
			} else if(user.getRole().equals(USER_ROLE_USER)) {
				request.setAttribute("user", user.getLogin());
				return PAGE_USER_MAIN;
			}
		} else {
			return PAGE_ERROR;
		}
		return null;
	}
	
	

}
