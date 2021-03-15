<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1>未知错误：</H1><%=exception %>
    <H2>错误内容：</H2>
    <%
        exception.printStackTrace(response.getWriter());
    %>
</body>
</html>