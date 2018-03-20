<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign in</title>
</head>
<body>

<form name="LoginForm" method="GET" action="MainServlet">
<input type="hidden" name="command" value="loginForm"/>
<br/>Login:<br/>
<input type="text" name="login" />
<br/>Password:<br/>
<input type="password" name="pass"/>
<br/>
<hr/>
<input type="submit" value="Log in" />
<br/>If you don't have account:<br/>
<a  href="registration.jsp">Registration</a>
</form><hr/>

	<!--  Hello user!!!
	<form action="MainServlet" method="post">
		<input type="hidden" name="action" value="test" /> 
		<input type="submit" value="test jsp" />
	</form>
	
	<form action="MainServlet" method="post">
		<input type="hidden" name="action" value="test2" /> 
		<input type="submit" value="test jsp 2" />
	</form> -->

</body>
</html>