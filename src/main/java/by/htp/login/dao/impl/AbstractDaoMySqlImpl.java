package by.htp.login.dao.impl;

import by.htp.login.dao.util.WrapMySqlConnect;

abstract class AbstractDaoMySqlImpl {
	
	protected static final String SQL_USER = "user";
	protected static final String SQL_USER_ID = "id";
	protected static final String SQL_USER_PASS = "pass";
	protected static final String SQL_USER_LOGIN = "login";
	protected static final String SQL_USER_ROLE = "role";
	protected static final String SQL_BOOK_ID= "id";
	protected static final String SQL_BOOK_AUTHOR= "author";
	protected static final String SQL_BOOK_TITLE= "title";
	protected static final String SQL_BOOK_YEAR= "year";

	WrapMySqlConnect wcn;
	{
		wcn = new WrapMySqlConnect();
	}
}
