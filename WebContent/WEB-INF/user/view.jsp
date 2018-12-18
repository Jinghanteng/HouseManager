<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>这里是查看界面</h1> 
<h4>欢迎你:${rootUser.name }</h4>
	<a href="/HouseManager/to/houseinfo">房屋信息</a>
	<br>
	<a href="/HouseManager/to/compact">合同信息</a>
	<br>
	<a href="/HouseManager/to/ForwardTopaymentinformation">房租信息</a>
	<br>
	<a href="/HouseManager/to/logistics">后勤人员管理</a>
	<br>
	<a href="/HouseManager/to/activity">公寓活动管理</a>
	<br>
	<a href="/HouseManager/to/rootuser">系统用户</a>
	<br>
	<a href="/HouseManager/to/role">系统角色管理</a>
	<br>
	<a href="/HouseManager/to/user">租户信息</a>
	<br>
	<a href="/HouseManager/to/repair">修缮记录</a>
	<br>
</body>
</html>