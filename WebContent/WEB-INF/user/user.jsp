<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="b" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>这里是租户管理系统</h1>
	<a href="/HouseManager/to/view">返回首界面</a>

	<table>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>手机号码</th>
			<th>性别</th>
			<th>籍贯</th>
			<th>身份证号码</th>
			<th>添加时间</th>
		</tr>
		<c:forEach items="${pageUser.list}" var="user" varStatus="as">
			<tr>
				<td>${as.count }</td>
				<td>${user.name }</td>
				<td>${user.tel }</td>
				<td>${user.sex }</td>
				<td>${user.place }</td>
				<td>${user.idcard }</td>
				<td><b:formatDate value="${user.time }"
						pattern="YYYY年MM月dd日 HH:MM:ss" /></td>
			</tr>
		</c:forEach>
	</table>
	<c:choose>
		<c:when test="${pageUser.page>1 }">
			<a href="/HouseManager/to/user?page=${pageUser.page-1 }">上一页</a>
		</c:when>
		<c:otherwise>上一页</c:otherwise>
	</c:choose>
	当前是第 ${pageUser.page }页，总共是 ${pageUser.pagecount }页。。
	<c:choose>
		<c:when test="${pageUser.page<pageUser.pagecount }">
			<a href="/HouseManager/to/user?page=${pageUser.page+1 }">下一页</a>
		</c:when>
		<c:otherwise>下一页</c:otherwise>
	</c:choose>
</body>
</html>