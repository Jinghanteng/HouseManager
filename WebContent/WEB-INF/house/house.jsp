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
<h1>这里是房子展示界面</h1> 你好 ${rootUser.name }
<br>
<form action="/HouseManager/to/getByRoom">
	<input name="value" />
	<input type="submit" value="查询" />
	
</form>
<a href="/HouseManager/to/view">返回首界面</a>
<table border="1" role="1px">
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
<th>操作</th>
</tr>
<c:forEach items="${pageInfo.list }" var="house" varStatus="as">
<tr>
<td> ${as.count}</td>
<td> ${house.location}</td>
<td> ${house.plot}</td>
<td> ${house.unit}</td>
<td> ${house.floor}</td>
<td> ${house.room}</td>
<td> ${house.area}</td>
<td> ${house.orientation}</td>
<td> ${house.finish}</td>
<td> ${house.gas}</td>
<td> ${house.people}</td>
<td> <a href="/HouseManager/to/update?id=${house.id }">修改</a> <a href="/HouseManager/to/get?id=${house.id }">查看</a> <a href="/HouseManager/house/delete?id=${house.id }">删除</a> </td>
</tr>
</c:forEach>
</table>


<h5>当前是${pageInfo.page } 页，总共是  ${pageInfo.pageCount }页</h5>
<c:choose>
<c:when test="${pageInfo.page>1 }"><a href="/HouseManager/to/houseinfo?page=${pageInfo.page-1 }">上一页</a></c:when>
<c:otherwise><a>上一页</a></c:otherwise>
</c:choose>
<c:choose>
<c:when test="${pageInfo.page<pageInfo.pageCount }"><a href="/HouseManager/to/houseinfo?page=${pageInfo.page+1 }">下一页</a></c:when>
<c:otherwise><a>下一页</a></c:otherwise>
</c:choose>
<br>
你还可以
<a href="/HouseManager/to/houseAdd">添加房间</a>
</body>
</html>