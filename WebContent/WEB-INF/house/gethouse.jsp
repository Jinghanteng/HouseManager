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
	<table border="1">

		<tr>
			<th>id</th>
			<th>地区</th>
			<th>小区</th>
			<th>单元号</th>
			<th>楼层</th>
			<th>房间号</th>
			<th>面积</th>
			<th>朝向</th>
			<th>装修</th>
			<th>是否双气</th>
			<th>可住人数</th>
		</tr>
		<c:forEach items="${list }" var="house">
			<tr>
				<td>${house.id }</td>
				<td>${house.location}</td>
				<td>${house.plot}</td>
				<td>${house.unit}</td>
				<td>${house.floor}</td>
				<td>${house.room}</td>
				<td>${house.area}</td>
				<td>${house.orientation}</td>
				<td>${house.finish}</td>
				<td>${house.gas}</td>
				<td>${house.people}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>