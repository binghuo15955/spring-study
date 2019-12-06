<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload file</title>

<base href="http://localhost:8080/spring-study/"/>
</head>
<body>
	<form action="file/up" method="post" enctype="multipart/form-data">
		文件:<input type="file" name="upFile" /><br />
		描述:<input type="text" name="desc" /><br />
		
		<input type="submit" value="提交" />
	</form>
</body>
</html>