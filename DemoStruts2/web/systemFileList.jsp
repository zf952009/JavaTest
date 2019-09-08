<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019.07.06
  Time: 17:36
  Name: systemFileList
  To change this template use MyFile | Settings | MyFile Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>文件列表</title>

</head>
<body>
<c:forEach var="val" items="${data}">
    <div class="layui-col-md3 open" style="margin:10px 40px;">
        <a href="JavaScript:;?filepath=${val.file_url}"
           class="filepath">
            <img src="${pageContext.request.contextPath}/public/icon/svg/${val.type}.svg" height="50px" width="50px">
                ${val.name}
        </a>
    </div>
</c:forEach>
<link rel="stylesheet" type="text/css" charset="UTF-8"
      href="${pageContext.request.contextPath}/public/layui/css/layui.css">
<script src="${pageContext.request.contextPath}/public/js/jquery-3.4.1.js"></script>
<script charset="UTF-8" type="javascript"
        src="${pageContext.request.contextPath}/public/layui/layui.js"></script>

</body>
</html>
