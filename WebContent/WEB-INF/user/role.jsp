<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>系统角色管理</h1>
<a href="/HouseManager/to/view">返回首界面</a>
	
	<table border="1">
	<tr>
	<th>编号</th>
	<th>职位</th>
	<th>最后修改时间</th>
	<th>操作</th>
	
	
	
	
	</tr>
	
	
	<c:forEach items="${pagerole.list}" var="role" varStatus="as">
	<tr>
	<td> ${as.count }</td>
	<td> ${role.name }</td>
	<td> ${role.time }</td>
	<td> <a href="${rootuser.id }">修改</a> <a>查看</a> <a href="${rootuser.id }">删除</a> </td>
	</tr>
	</c:forEach>
	</table>
	<c:choose>
	<c:when test="${pagerole.page>1 }"> <a href="/HouseManager/to/role?page=${pagerole.page -1 }">上一页</a> </c:when>
	<c:otherwise>上一页</c:otherwise>
	</c:choose>
	当前页： ${pagerole.page } /总共： ${pagerole.pageCount }页
	<c:choose>
	<c:when test="${pagerole.page < pagerole.pageCount }"> <a href="/HouseManager/to/role?page=${pagerole.page+1 }">下一页</a></c:when>
	<c:otherwise>下一页</c:otherwise>
	</c:choose>
	
</body>
</html>