<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Book List</title>
</head>
<body>
	<c:forEach items="${list}" var="item">
		<p><h1></h1><c:out value="${item}" />
	</c:forEach>
	<br/>
	<a  href="user.jsp">Back to user page</a>
</body>
</html>