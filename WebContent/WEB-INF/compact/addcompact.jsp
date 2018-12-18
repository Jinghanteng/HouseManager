<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<form action="/HouseManager
		/AddCompactServlet">
			<%-- 合同号id、房屋信息（关联房屋信息）house_id、
			租户信息（关联租户信息）user_id、合同日期time、
			租赁开始时间begintime、租赁结束时间endtime、
			房租总额rental、付款方式（月付、半年付、年付等）payment、
			押金 pledge、付款期数periods
			
			--%>
			房屋信息<input name="house_id" />
			<br />
			租户信息<input name="user_id" />
			<br />
			合同日期<input name="time" />
			<br />
			begintime<input name="begintime" placeholder="YYYY-MM-dd HH:mm:ss" />
			<br />
			租赁结束时间<input name="endtime" placeholder="YYYY-MM-dd HH:mm:ss" />
			<br />
			房租总额<input name="rental" />
			<br />
			付款方式（月付、半年付、年付等）<input name="payment" />
			<br />
			押金pledge<input name="pledge" />
			<br />
			付款期数<input name="periods" />
			<br />
			<input type="submit" />
		</form>
	
	</body>

</html>