<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019.06.11
  Time: 19:38
  Name: login
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>登录页面</title>

</head>

<body onload="startTime()">
<form class="layui-form" action="${pageContext.request.contextPath}/UserAction_login.action" method="post">

    <div class="layui-row">
        <div class="layui-col-xs6 layui-col-sm6 layui-col-md4">
            <div class="grid-demo grid-demo-bg1">&nbsp;</div>
        </div>
        <div class="layui-col-xs6 layui-col-sm6 layui-col-md4">
            <div class="grid-demo">
                <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
                    <legend>用户登录</legend>
                </fieldset>
                <div class="layui-form-item">
                    <label class="layui-form-label">用户名</label>
                    <div class="layui-input-inline">
                        <input type="text" name="user_name" lay-verify="title" autocomplete="off" placeholder="请输入用户名"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">密码</label>
                    <div class="layui-input-inline">
                        <input type="password" name="user_password" lay-verify="pass" placeholder="请输入密码" autocomplete="off"
                               class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">请填写6到12位密码</div>
                </div>
                <input type="submit" lay-submit lay-filter="demo1" class="layui-btn layui-btn-normal"
                       value="登&nbsp;&nbsp;录" style="width: 100px; margin-left: 100px; margin-top:20px ;"/>
                <a href="${pageContext.request.contextPath}/register.jsp" class="layui-btn" target="_parent"
                   style="margin-top:20px ;">&nbsp;&nbsp;&nbsp;&nbsp;注&nbsp;&nbsp;册&nbsp;&nbsp;&nbsp;&nbsp;</a>
            </div>
        </div>
    </div>
</form>

<!--底部分割线-->
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
</fieldset>
<link rel="stylesheet" type="text/css" charset="UTF-8"
      href="${pageContext.request.contextPath}/public/layui/css/layui.css">
<script charset="UTF-8" type="application/javascript"

        src="${pageContext.request.contextPath}/public/layui/layui.js"></script>
</body>
</html>
