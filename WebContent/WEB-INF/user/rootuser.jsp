<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
	<h1>这里是系统用户管理</h1>
	<a href="/HouseManager/to/view">返回首界面</a>
	
	<table border="1">
	<tr>
	<th>编号</th>
	<th>登录账户</th>
	<th>登录密码</th>
	<th>真实姓名</th>
	<th>性别</th>
	<th>角色</th>
	<th>添加时间</th>
	<th>用户状态</th>
	<th>操作</th>
	</tr>
	<c:forEach items="${rootuser.list}" var="rootuser" varStatus="as">
	<tr>
	<td> ${as.count }</td>
	<td> ${rootuser.passname }</td>
	<td> ${rootuser.password }</td>
	<td> ${rootuser.name }</td>
	<td> ${rootuser.sex }</td>
	<td> ${rootuser.role_id }</td>
	<td> ${rootuser.time }</td>
	<td> ${rootuser.state }</td>
	<td> <a href="${rootuser.id }">修改</a> <a>查看</a> <a href="${rootuser.id }">删除</a> </td>
	</tr>
	</c:forEach>
	
	
	
	
	</table>
</body>
</html>