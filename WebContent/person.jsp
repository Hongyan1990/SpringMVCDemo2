<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<form action="">
        用户名：<input type="text" name="name" id="name" /><br> 
        性别：<input type="sex" name="sex" id="sex" /> <br> 
        年龄：<input type="text" name="age" id="age"><br> 
        <input type="button" value="测试" onclick="testJson()" />
    </form>
</body>
<script type="text/javascript">
function testJson() {
    //获取输入的值pname为id
    var name = $("#name").val();
    var age = $("#age").val();
    var sex = $("#sex").val();
    $.ajax({
        //请求路径
        url : "${pageContext.request.contextPath }/testJson",
        //请求类型
        type : "post",
        //data表示发送的数据
        data : JSON.stringify({
            name : name,
            age : age,
            sex : sex
        }), //定义发送请求的数据格式为JSON字符串
        contentType : "application/json;charset=utf-8",
        //定义回调响应的数据格式为JSON字符串，该属性可以省略
        dataType : "json",
        //成功响应的结果
        success : function(data) {
            if (data != null) {
                alert("输入的用户名：" + data.name + "，年龄：" + data.age
                        + "， 性别：" + data.sex);
            }
        }
    });
}
</script>
</html>