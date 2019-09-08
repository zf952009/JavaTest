<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019.07.04
  Time: 14:49
  Name: file_list
  To change this template use MyFile | Settings | MyFile Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件列表</title>
</head>
<body>

<br/>
<%--<div class="clear" style="padding-left: 80%">
    <h4 style="color: red">--847条数据--</h4>
    <a href="/index.php/home/index/dataMaintain.jsp" target="_parent" title="id维护,数据去空白">数据维护</a>
    &nbsp;&nbsp;
    <a href="/index.php/home/index/addAll.jsp" target="_parent">批量添加</a>
</div>--%>
<div class="layui-card"></div>
<form action="${pageContext.request.contextPath}/File_List_file_list" class="layui-form" method="post">
    <div class="layui-inline">
        <label class="layui-form-label">编号</label>
        <div class="layui-input-inline">
            <input type="text" name="id" autocomplete="off" placeholder="查找ID..." class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">文章名</label>
        <div class="layui-input-inline">
            <input type="text" name="name_search" autocomplete="off" placeholder="查找文章名..." class="layui-input">
        </div>
    </div>
    <input type="submit" class="layui-btn layui-btn-warm" value="搜索">
    <br/>
    <div class="layui-inline">
        <label class="layui-form-label">文章名</label>
        <div class="layui-input-inline">
            <input type="text" name="name"  autocomplete="off" placeholder="文章名..." class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">URL</label>
        <div class="layui-input-inline">
            <input type="tel" name="url"  autocomplete="off" class="layui-input" placeholder="URL...">
        </div>
    </div>
    <input type="hidden" name="addId" value="848">
    <input type="submit" class="layui-btn" value="添加">
</form>


<table class="layui-table" lay-skin="line row" style="width: 95%;margin-left: 20px">
    <thead>
    <tr>
        <th>编号</th>
        <th>文章名</th>
        <th>操作</th>
    </tr>
    </thead>
    <c:forEach items="${list}" var="val">
    <tr>
        <td>${val.id}</td>
        <td>
            <a href="${val.url}" target="mainFrame">${val.name}</a>
        </td>
        <td>删除</td>
    </tr>
    </c:forEach>

    <link rel="stylesheet" type="text/css" charset="UTF-8"
          href="${pageContext.request.contextPath}/public/layui/css/layui.css">
    <script charset="UTF-8" type="application/javascript"
            src="${pageContext.request.contextPath}/public/layui/layui.js"></script>
</body>
</html>
