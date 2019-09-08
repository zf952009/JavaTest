<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019.06.06
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>index</title>
<head>
</head>
<body>
<aside class="lt_aside_nav content mCustomScrollbar" style="top:0">
    <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="demo" style="margin-right: 10px;">
        <li class="layui-nav-item layui-nav-itemed">
            <a href="javascript:;">demo</a>
            <dl class="layui-nav-child">
                <dd>
                    <a href="${pageContext.request.contextPath}/Tb_WebAction_list" target="mainFrame">web</a>
                </dd>
                <dd>
                    <a href="${pageContext.request.contextPath}/RegularAction_list" target="mainFrame">正则表达式</a>
                </dd>
                <dd>
                    <a href="${pageContext.request.contextPath}/File_List_file_list" target="mainFrame">文件列表</a>
                </dd>
                <dd>
                    <a href="${pageContext.request.contextPath}/File_List_systemFileList.action" target="mainFrame">系统文件列表</a>
                </dd>
                <dd>
                    <a href="${pageContext.request.contextPath}/form_you_get.jsp" target="mainFrame">you-get</a>
                </dd>
            </dl>
        </li>
    </ul>
</aside>
</body>
<link rel="stylesheet" type="text/css" charset="UTF-8"
      href="${pageContext.request.contextPath}/public/layui/css/layui.css">
<script charset="UTF-8" type="application/javascript"
        src="${pageContext.request.contextPath}/public/layui/layui.js"></script>
<script>
    (function ($) {
        $(window).load(function () {
            $("a[rel='load-content']").click(function (e) {
                e.preventDefault();
                var url = $(this).attr("href");
                $.get(url, function (data) {
                    $(".content .mCSB_container").append(data);
                    $(".content").mCustomScrollbar("scrollTo", "h2:last");
                });
            });
            $(".content").delegate("a[href='top']", "click", function (e) {
                e.preventDefault();
                $(".content").mCustomScrollbar("scrollTo", $(this).attr("href"));
            });

        });
    });
</script>
</html>
