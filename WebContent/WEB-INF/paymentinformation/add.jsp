<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<form action="/HouseManager/AddPayment">
			<br>
			房屋信息<input name="house_id" />
			<br />
			租户信息<input name="user_id" />
			<br />
			缴纳房租额<input name="payment" />
			<br />
			缴纳时间<input name="time" />
			<br />
			备注信息<input name="other" />
			<br />
				<input type="submit" />
		</form>

	</body>

</html>