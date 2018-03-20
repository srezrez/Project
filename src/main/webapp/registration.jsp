<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign in</title>
</head>
<body>

<form name="RegisterForm" method="GET" action="MainServlet">
<input type="hidden" name="command" value="registerForm"/>
<br/>Login:<br/>
<input type="text" name="login" />
<br/>Password:<br/>
<input type="password" name="pass"/>
<br/>
<hr/>
<input type="submit" value="Register" />
</body>
</html>