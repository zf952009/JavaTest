<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019.08.09
  Time: 13:04
  Name: form_you_get
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>you-get</title>
</head>
<body>
<h3>you-get-form</h3>
<form action="${pageContext.request.contextPath}/YouGet_form.action" style="margin: 50px">
    前缀: <input type="text" name="prefix">
    <hr>
    后缀: <input type="text" name="suffix">
    <hr>
    开始: <input type="text" name="start">
    <hr>
    结束: <input type="text" name="end">
    <hr>
    <input type="submit" value="提交" class="layui-btn layui-btn-warm">
</form>

<p style="margin: 50px">${message}</p>


<link rel="stylesheet" type="text/css" charset="UTF-8"
      href="${pageContext.request.contextPath}/public/layui/css/layui.css">
<script charset="UTF-8" type="application/javascript"
        src="${pageContext.request.contextPath}/public/layui/layui.js"></script>
</body>
</html>
