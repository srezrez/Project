<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
</head>
<body>

	<font size= "16">Welcome</font>
	<!--  <hr/>
	<c:out value="${user}, hello!" />
	<hr/> -->
	
	<form action="MainServlet" method="GET">
	<input type="hidden" name="command" value="create_book" />
	<input type="submit" value="create book" class="ripple btn"/>
	</form>
	
	<h3>List Books:</h3>
	<c:forEach items="${bookList}" var="book" >
	<p>
	<c:out value="${book}" />
	<form action="MainServlet" method="GET">
	<input type="hidden" name="command" value="delete_book" />
	<input type="hidden" name="book_id" value="${book.getId()}" />
	<input type="submit" value="delete"/>
	</form>

	<p>
	<form action="MainServlet" method="GET">
	<input type="hidden" name="command" value="update_book" />
	<input type="hidden" name="book_id" value="${book.getId()}" />
	<input type="submit" value="update"/>
	</form>
	
	</c:forEach>
</body>
</html>