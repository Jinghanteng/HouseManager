<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>这里是后勤添加界面</h1>
	<form action="/HouseManager/AddLogisticServlet">
		<br/>
	姓名<input name="name"/>
	<br/>
	身份证号<input name="idcard"/>
	<br/>
	手机号<input name="tel"/>
	<br/>
	性别<input name="sex"/>
	<br/>
	部门岗位编号<input name="role_id"/>
	<br/>
	添加时间<input name="time"/>
	<br/>
	工资<input name="salary"/>
	<br/>
	籍贯<input name="place"/>
	<br/>
	<input type="submit" />
	<br/>
	</form>
</body>
</html>