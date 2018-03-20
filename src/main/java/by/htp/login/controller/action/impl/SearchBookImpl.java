package by.htp.login.controller.action.impl;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import by.htp.login.bean.Book;
import by.htp.login.controller.action.BaseAction;
import by.htp.login.controller.util.RequestParamValidator;
import by.htp.login.service.BookService;
import by.htp.login.service.impl.BookServiceImpl;

import static by.htp.login.controller.util.ControllerConstantPool.*;

public class SearchBookImpl implements BaseAction{

	private BookService bookService = new BookServiceImpl();
	@Override
	public String chooseAction(HttpServletRequest request) throws SQLException {
		
		String title = request.getParameter(REQUESR_PARAM_SEARCH_BOOK);
		RequestParamValidator.validateSearchBook(title);
		List<Book> foundBooks = bookService.getFoundBook(title);
		if(foundBooks!= null) {
			request.setAttribute("showBook", foundBooks);
			return PAGE_USER_FIND_BOOK;
		}
		return PAGE_BOOK_NOT_FOUND;
		
	}

}
