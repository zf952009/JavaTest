<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019.06.06
  Time: 19:00
  To change this template use MyFile | Settings | MyFile Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>正则表达式</title>
</head>
<body>

<table class="layui-table" lay-skin="line row" style="width: 95%;margin-left: 20px">
    <thead>
    <tr>
        <th>编号</th>
        <th>作用</th>
        <th>表达式</th>
        <th>操作</th>
    </tr>
    </thead>
    <c:forEach items="${list}" var="value">
        <tr>
            <td>${value.id}</td>
            <td>${value.name}</td>
            <td>${value.regular}</td>
            <td>
                <a href="${pageContext.request.contextPath}/RegularAction_delete?id=${value.id}"
                   onclick="return confirm('确认删除!!!')">
                    <button type="button" class="layui-btn layui-btn-sm layui-btn-normal"><i
                            class="layui-icon">&#xe640;</i>
                        删除
                    </button>
                </a>
            </td>
        </tr>
    </c:forEach>

    <tr>
        <form action="${pageContext.request.contextPath}/RegularAction_add" class="layui-form" method="post">
            <td>
                ${size+1}
                <input type="hidden" name="id" value="${size+1}">
            </td>
            <td>
                <input type="text" name="name" placeholder="网站名" autocomplete="off" class="layui-input">
            </td>
            <td>
                <input type="text" name="regular" placeholder="url" autocomplete="off" class="layui-input">
            </td>
            <td>
                <input type="submit" class="layui-btn" value="添加"  onclick="return confirm('确定添加!!!')">
            </td>

        </form>
    </tr>
    <tr>
        <td>${pageNext}</td>
        <td>
            <a href="${pageContext.request.contextPath}/RegularServlet?pageUP=15"
               class="layui-btn layui-btn-sm layui-btn-normal">上一页</a>
            <a href="${pageContext.request.contextPath}/RegularServlet?pageNex=1" class="layui-btn layui-btn-sm layui-btn-danger">下一页</a>
        </td>
        <td></td>
        <td></td>
    </tr>
</table>

<link rel="stylesheet" type="text/css" charset="UTF-8"
      href="${pageContext.request.contextPath}/public/layui/css/layui.css">
<script charset="UTF-8" type="application/javascript"
        src="${pageContext.request.contextPath}/public/layui/layui.js"></script>
<script>
    //Demo
    layui.use('form', function () {
        var form = layui.form;
        //监听提交
        form.on('submit(formDemo)', function (data) {
            layer.msg(JSON.stringify(data.field));
            return true;
        });
    });
</script>
</body>
</html>
