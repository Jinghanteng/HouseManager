<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String path=request.getContextPath()+"/"; %>
<!DOCTYPE html>
<html>
<head>
<base href="<%=path %>>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>这里是登陆界面</h1>
	<form action="user/login">
		<input name="username" value="${param.username }"> <br> <input
			name="password" type="password"> <br> <input
			type="submit" value="login">
	</form>
	${msg }
</body>
</html>