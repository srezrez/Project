package by.htp.login.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.login.bean.Book;
import by.htp.login.dao.BookDao;

public class BookDaoMySqlImpl extends AbstractDaoMySqlImpl implements BookDao{
	
	private static final String SQL_BOOK_INSERT = "insert into library(title, author, year) values (?, ?, ?)";
	private static final String SQL_BOOK_SELECT_ID = "select title from library where id= ?";
	private static final String SQL_BOOK_UPDATE = "UPDATE library SET title = ?, year = ?, author = ? where id = ?";
	private static final String SQL_BOOK_DELETE = "DELETE FROM library WHERE id = ?";
	private static final String SQL_BOOK_SELECT_ALL = "select * from library";
	private static final String SQL_BOOK_SELECT_BY_TITLE = "select * where title = ?";
	protected Connection con;

	@Override
	public void create(Book book) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_BOOK_INSERT);
			ps.setString(1, book.getTitle());
			ps.setString(2,  book.getAuthor());
			ps.setInt(3,  book.getYear());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con!= null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

	@Override
	public Book read(int id) {
		Book book = new Book();
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_BOOK_SELECT_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				book.setTitle(rs.getString(SQL_BOOK_TITLE));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return book;
	}
	
	@Override
	public List<Book> readByTitle(String title) {
		List<Book> foundBooks = new ArrayList<>();
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_BOOK_SELECT_BY_TITLE);
			ps.setString(1, title);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				foundBooks.add(createBook(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foundBooks;
	}

	@Override
	public void update(Book book) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_BOOK_UPDATE);
			ps.setString(1, book.getTitle());
			ps.setInt(2,  book.getYear());
			ps.setString(3,  book.getAuthor());
			ps.setInt(4,  book.getId());;
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void delete(int id) {
		try {
			con = wcn.getConnection();
			PreparedStatement ps = con.prepareStatement(SQL_BOOK_DELETE);
			ps.setInt(1,  id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public Book createBook(ResultSet rs) throws SQLException {
		Book book = new Book();
		book.setId(rs.getInt(SQL_BOOK_ID));
		book.setTitle(rs.getString(SQL_BOOK_TITLE));
		book.setAuthor(rs.getString(SQL_BOOK_AUTHOR));
		book.setYear(rs.getInt(SQL_BOOK_YEAR));
		return book;
	}

	@Override
	public List<Book> readAll() {
		List<Book> books = new ArrayList<>();
		try {
			con = wcn.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_BOOK_SELECT_ALL);
			while(rs.next()) {
				books.add(createBook(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return books;
	}

}
