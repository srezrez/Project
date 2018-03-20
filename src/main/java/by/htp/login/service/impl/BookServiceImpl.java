package by.htp.login.service.impl;

import java.util.List;

import by.htp.login.bean.Book;
import by.htp.login.dao.BookDao;
import by.htp.login.dao.impl.BookDaoMySqlImpl;
import by.htp.login.service.BookService;

public class BookServiceImpl implements BookService{
	
	private BookDao bookDao = new BookDaoMySqlImpl();

	@Override
	public List<Book> getBookCatalog() {
		return bookDao.readAll();
	}
	
	@Override
	public List<Book> getFoundBook(String title){
		return bookDao.readByTitle(title);
	}

}
