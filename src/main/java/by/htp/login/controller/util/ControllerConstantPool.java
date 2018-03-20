package by.htp.login.controller.util;

public class ControllerConstantPool {

	private ControllerConstantPool() {
	}

	public static final String REQUEST_PARAM_COMMAND = "command";
	
	public static final String REQUEST_PARAM_LOGIN_COMMAND = "loginForm";
	public static final String REQUEST_PARAM_REGISTER_COMMAND = "registerForm";
	public static final String REQUEST_PARAM_BOOK_LIST = "showBookList";
	public static final String REQUESR_PARAM_SEARCH_BOOK = "searchBook";
	public static final String REQUEST_PARAM_DELETE_BOOK = "delete_book";
	public static final String REQUEST_PARAM_UPDATE_BOOK = "update_book";
	public static final String REQUEST_PARAM_CREATE_BOOK = "create_book";
	public static final String REQUEST_PARAM_CREATE_BOOK_SECOND = "createBook";
	public static final String REQUEST_PARAM_UPDATE_BOOK_SECOND = "updateBook";

	public static final String PAGE_INDEX = "/index.jsp";
	public static final String PAGE_REGISTRATION  = "/registration.jsp";	
	public static final String PAGE_ERROR = "/errorLogin.jsp";
	public static final String PAGE_ERROR_REGISTRATION = "/errorRegistration.jsp";
	public static final String PAGE_ADMIN_MAIN = "/admin.jsp";
	public static final String PAGE_USER_MAIN = "/user.jsp";
	public static final String PAGE_USER_SHOW_BOOKS = "/showBookListUser.jsp";
	public static final String PAGE_USER_FIND_BOOK = "/searchBookUser.jsp";
	public static final String PAGE_BOOK_NOT_FOUND = "/bookNotFound.jsp";
	
	public static final String COMMAND_LOGIN = "login";
	public static final String COMMAND_PASS = "pass";
	public static final String COMMAND_BOOK_SEARCH = "book";
	public static final String USER_ROLE_ADMIN = "admin";
	public static final String USER_ROLE_USER = "user";
	
	
}
