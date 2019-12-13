<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="http://localhost:8080/spring-study/"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../../lib/jquery/1.11.3/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$.getJSON("http://localhost:8080/spring-study/student/json",function(data){
			console.log(data);
			
		})
		
	})
</script>
<title>获取学生信息</title>
</head>
<body>
	<h2>学生列表</h2>
	学号:${student.stuID }<br/>
		姓名:${student.name }<br/>
		出生日期:${student.birthday }<br/>
		手机:${student.mobile }<br/>
		住址:${student.addr }<br/>
	message = ${msg }
</body>
</html>