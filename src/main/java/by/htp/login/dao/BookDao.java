package by.htp.login.dao;

import java.util.List;

import by.htp.login.bean.Book;

public interface BookDao extends BaseDao<Book>{
	
	List <Book> readAll();
	List<Book> readByTitle(String title);

}
