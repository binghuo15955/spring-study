<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../../lib/jquery/1.11.3/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$.getJSON("http://localhost:8080/spring-study/student/json",function(data){
			console.log(data);
		})
		
	})
</script>
<title>AJAX返回JSON</title>
</head>
<body>
</body>
</html>