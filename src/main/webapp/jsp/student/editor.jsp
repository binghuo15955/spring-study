<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息修改</title>
<base href="http://localhost:8080/spring-study/"/>
</head>
<body>
	<form action="student/add" method="post">
		学号:<input type="text" name="stuID" /><br/>
		姓名:<input type="text" name="name" /><br/>
		出生日期:<input type="text" name="birthday" /><br/>
		手机:<input type="text" name="mobile" /><br/>
		住址:<input type="text" name="addr" /><br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>