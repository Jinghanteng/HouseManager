<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String path=request.getContextPath()+"/"; %>
<!DOCTYPE html>
<html>
<head>
<base href="<%= path%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<jsp:forward page="/WEB-INF/user/login.jsp"></jsp:forward>
</body>
</html>