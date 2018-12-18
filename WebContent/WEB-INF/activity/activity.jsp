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
<h1>这里是公寓活动管理</h1>
	<table border="1">
		<tr>
			<th>编号</th>
			<th>活动日期</th>
			<th>活动主题</th>
			<th>活动内容</th>
			<th>活动地点</th>
			<th>活动费用</th>
			<th>活动组织方信息</th>
		</tr>
		<c:forEach items="${pageActivity.list}" var="activity" varStatus="as">
			<tr>
				<td>${as.count }</td>
				<td>${activity.time }</td>
				<td>${activity.theme }</td>
				<td>${activity.content }</td>
				<td>${activity.location }</td>
				<td>${activity.cost }</td>
				<td>${activity.organizer }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="">添加活动</a>

</body>
</html>