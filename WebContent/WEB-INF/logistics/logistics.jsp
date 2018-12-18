<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="b" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>这里是后勤人员管理界面</h1>
<a href="/HouseManager/to/view">返回首界面</a>
<table border="1">
<tr>
	<th>编号</th>
	<th>姓名</th>
	<th>身份证号</th>
	<th>手机号</th>
	<th>性别</th>
	<th>部门岗位</th>
	<th>添加时间</th>
	<th>工资</th>
	<th>籍贯</th>
	<th>操作</th>
</tr>
<c:forEach items="${logistics.list}" var="logistics" varStatus="as">
<tr>
 	<td> ${as.count }</td>
 	<td> ${logistics.name }</td>
 	<td> ${logistics.idCard }</td>
 	<td> ${logistics.tel }</td>
 	<td> ${logistics.sex }</td>
 	<td> ${logistics.role_id }</td>
 	<td><b:formatDate value="${logistics.time }" pattern="YYYY年MM月dd日 HH:MM:ss"/></td>
 	<td> ${logistics.salary }</td>
 	<td> ${logistics.place }</td>
 	<td> <a href="">修改</a> <a href=" ">查看</a> <a href="">删除</a> </td>
</tr>
</c:forEach>
</table>
<c:choose>
	<c:when test="${logistics.page>1 }"><a href="/HouseManager/to/logistics?page=${logistics.page-1 }">上一页</a></c:when>
	<c:otherwise>上一页</c:otherwise>
</c:choose>
	当前页 ${logistics.page }   总共${logistics.pagesize } 页
<c:choose>
<c:when test="${logistics.page<logistics.pagesize }"><a href="/HouseManager/to/logistics?page=${logistics.page+1 }">下一页</a></c:when>
<c:otherwise>下一页</c:otherwise>
</c:choose>
<br>
<a href="/HouseManager/to/addLogistic">添加人员 </a>

</body>
</html>