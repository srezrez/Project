package by.htp.login.controller.action.impl;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.htp.login.bean.Book;
import by.htp.login.controller.action.BaseAction;
import by.htp.login.service.BookService;
import by.htp.login.service.impl.BookServiceImpl;

import static by.htp.login.controller.util.ControllerConstantPool.*;

public class ShowBookListImpl implements BaseAction{

	private BookService bookService = new BookServiceImpl();
	
	@Override
	public String chooseAction(HttpServletRequest request) throws SQLException {
		
		List<Book> bookList = bookService.getBookCatalog();
		request.setAttribute("list", bookList);
		return PAGE_USER_SHOW_BOOKS;
	}

}
