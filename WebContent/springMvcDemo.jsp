<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
未注册用户请<a href="${ pageContext.request.contextPath }/register" >注册</a>
<br>
未登录用户请<a href="${ pageContext.request.contextPath }/login" >登录</a>
</body>
</html>