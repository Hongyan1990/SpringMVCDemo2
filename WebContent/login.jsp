<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${ pageContext.request.contextPath }/user/login" method="post" >
用户名：<input type="text" name="uname" value="${ uname }" />
<br/>
密码：<input type="password" name="upass" />

<br>
<input type="submit" value="提交" />
</form>
</body>
</html>