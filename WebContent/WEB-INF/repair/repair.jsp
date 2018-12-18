<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>这里是修缮界面</h1>
	<a href="/HouseManager/to/view">返回首界面</a>
	<table border="1">
		<tr>
			<th>编号</th>
			<th>房屋信息</th>
			<th>负责人</th>
			<th>修缮说明</th>
			<th>修缮时间</th>
			<th>修缮结果</th>
			<th>备注说明</th>
		</tr>


		<c:forEach items="${repair.list }" var="repair" varStatus="as">
			<tr>
				<td>${as.count }</td>
				<td>${repair.housing }</td>
				<td>${repair.principal }</td>
				<td>${repair.instructions }</td>
				<td>${repair.time }</td>
				<td>${repair.result }</td>
				<td>${repair.other }</td>
			</tr>
		</c:forEach>
	</table>
	<c:choose>
		<c:when test="${repair.page>1 }">
			<a href="/HouseManager/to/repair?page=${repair.page-1 }">上一页</a>
		</c:when>
	</c:choose>
	<c:choose>
		<c:when test="${repair.page<repair.pageCount }">
			<a href="/HouseManager/to/repair?page=${repair.page+1 }">下一页</a>
		</c:when>
	</c:choose>

</body>
</html>