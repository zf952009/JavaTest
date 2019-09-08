<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019.06.06
  Time: 17:03
  To change this template use MyFile | Settings | MyFile Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>服务器域名管理</title>
</head>
<body>
<table class="layui-table" lay-skin="line row" style="width: 95%;margin-left: 20px">
    <thead>
    <tr>
        <th>编号</th>
        <th>网站名</th>
        <th>域名</th>
        <th>服务器类型</th>
        <th>操作</th>
    </tr>
    </thead>


    <form action="${pageContext.request.contextPath}/Tb_WebAction_list" method="post">
        <tr>
            <td>条件</td>
            <td>
                <input type="text" name="name" placeholder="网站名" autocomplete="off" class="layui-input">
            </td>
            <td>
                <input type="text" name="url" placeholder="url" autocomplete="off" class="layui-input">
            </td>
            <td>
                <input type="text" name="web" placeholder="PHP/Java" autocomplete="off" class="layui-input">
            </td>
            <td>
                <input type="submit" class="layui-btn" value="查询">
            </td>
        </tr>
    </form>
    <%--<s:iterator value="#list">
        <tr>
            <td>
                <s:property value="id"></s:property>
            </td>
            <td><a href="<s:property value="url"></s:property>" target="_blank"><s:property
                    value="web"></s:property></a></td>
            <td><a href="<s:property value="url"></s:property>" target="_blank"><s:property
                    value="url"></s:property></a></td>
            <td align="center"><s:property value="web"></s:property></td>
            <td>
                <a href="${pageContext.request.contextPath}/Tb_WebAction_delete?id=<s:property value="id"></s:property>"
                   onclick="return confirm('确认删除!!!')">
                    <button type="button" class="layui-btn layui-btn-sm layui-btn-normal"><i
                            class="layui-icon">&#xe640;</i>
                        删除
                    </button>
                </a>
            </td>
        </tr>
    </s:iterator>--%>
    <c:forEach items="${list}" var="value">
        <tr>
            <td>${value.id}</td>
            <td><a href="${value.url}" target="_blank">${value.name}</a></td>
            <td><a href="${value.url}" target="_blank">${value.url}</a></td>
            <td align="center">${value.web}</td>
            <td>
                <a href="${pageContext.request.contextPath}/Tb_WebAction_delete?id=${value.id}"
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
        <form action="${pageContext.request.contextPath}/Tb_WebAction_add" class="layui-form" method="post">
            <td>
                <s:property value="#list.size+1"></s:property>
                <input type="hidden" value="<s:property value="#list.size+1"/>" name="id">
            </td>
            <td>
                <input type="text" name="name" placeholder="网站名" autocomplete="off" class="layui-input">
            </td>
            <td>
                <input type="text" name="url" placeholder="url" autocomplete="off" class="layui-input">
            </td>
            <td>
                <input type="text" name="web" placeholder="PHP/Java" autocomplete="off" class="layui-input">
            </td>
            <td>
                <input type="submit" class="layui-btn" onclick="return confirm('确定添加!!!')" value="添加">
            </td>

        </form>
    </tr>
    <tr>
        <td></td>
        <td>
            <a href="javascript:;" class="layui-btn layui-btn-sm layui-btn-normal" target="mainFrame">上一页</a>
            <a href="javascript:;" class="layui-btn layui-btn-sm layui-btn-danger" target="mainFrame">下一页</a>
        </td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>

<link rel="stylesheet" type="text/css" charset="UTF-8"
      href="${pageContext.request.contextPath}/public/layui/css/layui.css">
<script charset="UTF-8" type="application/javascript"
        src="${pageContext.request.contextPath}/public/layui/layui.js"></script>

</body>
</html>