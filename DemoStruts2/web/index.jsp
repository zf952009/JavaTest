<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019.06.06
  Time: 14:57
  To change this template use MyFile | Settings | MyFile Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>测试demo</title>
<head>
    <frameset rows="65,*" cols="*" frameborder="no" border="0" framespacing="0">
        <frame src="top.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" target="main" />
        <frameset cols="193,*" frameborder="no" border="0" framespacing="0">
            <frame src="left.jsp" scrolling="No" noresize="noresize" id="leftFrame" target="main" />
            <frame src="${pageContext.request.contextPath}/File_List_systemFileList.action" name="mainFrame" id="mainFrame" />
        </frameset>
    </frameset>
    <noframes>
<body>
</body>
</noframes>
</html>
