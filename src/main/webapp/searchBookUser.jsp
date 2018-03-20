<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Book</title>
</head>
<body>

	Your book(s) is here:
	<br/>
	<c:forEach items="${showBook}" var="item">
		<p><h1></h1><c:out value="${item}" /></h1></p>
	</c:forEach>
	<br/>
	<a  href="user.jsp">Back to user page</a>
</body>
</html>