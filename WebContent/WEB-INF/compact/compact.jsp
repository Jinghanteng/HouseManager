<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>这里是合同信息</h1>
	<a href="/HouseManager/to/view">返回首界面</a>
	<table border="1">
		<tr>
			<th>合同号</th>
			<th>房屋id</th>
			<th>租户id</th>
			<th>合同日期</th>
			<th>开始时间</th>
			<th>结束时间</th>
			<th>房租总额</th>
			<th>付款方式</th>
			<th>押金</th>
			<th>付款期数</th>

		</tr>
		<c:forEach items="${pagecompact.list }" var="compact">
			<tr>
				<td>${compact.id }</td>
				<td>${compact.house_id }</td>
				<td>${compact.user_id }</td>
				<td>${compact.time }</td>
				<td>${compact.begintime }</td>
				<td>${compact.endtime }</td>
				<td>${compact.rental }</td>
				<td>${compact.payment }</td>
				<td>${compact.pledge }</td>
				<td>${compact.periods }</td>
			</tr>
		</c:forEach>
		
	</table>
	<c:choose>
			<c:when test="${pagecompact.page>1 }">
				<a href="/HouseManager/to/compact?page=${pagecompact.page-1 }">上一页</a></c:when>
			<c:otherwise>上一页</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${pagecompact.page<pagecompact.pageCount }">
				<a href="/HouseManager/to/compact?page=${pagecompact.page+1 }">下一页</a></c:when>
			<c:otherwise>下一页</c:otherwise>
		</c:choose>
	<a href="/HouseManager/to/compactAdd">添加合同</a>

</body>
</html>