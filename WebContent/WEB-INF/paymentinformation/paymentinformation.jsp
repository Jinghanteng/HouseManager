<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="b" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>这里是房租信息管理界面</h1>
<a href="/HouseManager/to/view">返回首界面</a>
<table border="1">
<tr>
<th>编号</th>
<th>房屋信息</th>
<th>租户信息</th>
<th>缴纳房租额</th>
<th>缴纳时间</th>
<th>备注</th>
<th>操作</th>
</tr>
<c:forEach items="${pagePaymentinformation.list}" var="paymentinformation" varStatus="as">
<tr>
<td> ${as.count }</td>
<td> ${paymentinformation.house_id }</td>
<td> ${paymentinformation.user_id }</td>
<td> ${paymentinformation.payment }</td>
<td> <b:formatDate value="${paymentinformation.time }" pattern="YYYY年MM月dd日 HH:MM"/></td>
<td> ${paymentinformation.other }</td>
<td> <a>查看</a> <a>修改</a> <a>删除</a></td>
</tr>
</c:forEach>
</table>
<c:choose>
<c:when test="${pagePaymentinformation.page>1 }"><a href="/HouseManager/to/ForwardTopaymentinformation?page=${pagePaymentinformation.page-1 }">上一页</a></c:when>
<c:otherwise>上一页</c:otherwise>
</c:choose>
当前是：第 ${pagePaymentinformation.page }页,总共是 ${pagePaymentinformation.pageCount }页
<c:choose>
<c:when test="${pagePaymentinformation.page<pagePaymentinformation.pageCount }"><a href="/HouseManager/to/ForwardTopaymentinformation?page=${pagePaymentinformation.page+1 }">下一页</a></c:when>
<c:otherwise>下一页</c:otherwise>
</c:choose>
<h3><a href="/HouseManager/to/payment">添加</a></h3>
</body>
</html>