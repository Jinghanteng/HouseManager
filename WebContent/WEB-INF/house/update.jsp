<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>更新界面</h1>
	<a href="/HouseManager/to/view">返回首界面</a>
	<%--
	所属地区location、所属小区plot、单元号unit、所属楼层floor、
	房间号room、面积area、朝向orientation、
	装修(精装、简装等)finish、是否双气gas、限住人数people、
	 --%>
	 
	 <form action="/HouseManager/house/update" method="post">
	 	所属地区<input  name="location" value="${house.location }" />
	 	<br />
	 	所属小区<input name="plot" value="${house.plot }" />
		<br />
	 	单元号<input name="unit" value="${house.unit }" />
	 	<br />
	 	所属楼层<input name="floor" value="${house.floor }" />
	 	<br />
	 	房间号<input name="room" value="${house.room }" />
	 	<br />
	 	面积<input name="area" value="${house.area }" />
	 	<br />
	 	朝向<input name="orientation" value="${house.orientation }" />
	 	<br />
	 	装修<input name="finish" value="${house.finish }" />
	 	<br />
	 	是否双气<input name="gas" value="${house.gas }" />
	 	<br />
	 	限住人数<input name="people" value="${house.people }" />
	 	<br />
	 	
	 	<input type="submit" />
	 </form>
	
</body>
</html>