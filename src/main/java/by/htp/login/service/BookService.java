package by.htp.login.service;

import java.util.List;

import by.htp.login.bean.Book;

public interface BookService {
	
	List<Book> getBookCatalog();

	List<Book> getFoundBook(String title);

}
