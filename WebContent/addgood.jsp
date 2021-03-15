<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${ pageContext.request.contextPath }/goods/save" method="post" name="goodForm">
商品名称： <input type="text" name="goodName" />
<br>
商品价格： <input type="text" name="goodPrice" />
<br>
商品数量： <input type="text" name="goodNum" />
<br>
日期： <input type="text" name="date" />
<br>
<input type="submit" value="提交" /> 
</form>
${ errors }
</body>
</html>