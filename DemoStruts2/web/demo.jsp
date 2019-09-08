<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019.06.06
  Time: 22:46
  Name: demo
  To change this template use MyFile | Settings | MyFile Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>傻邹</title>
</head>
<body>
<br>
<%
    String name = request.getParameter("name");
    String url = request.getParameter("url");
    String web = request.getParameter("web");
    request.setAttribute("name",name);request.setAttribute("url",url);request.setAttribute("web",web);

%>
${id}
<h2>ceshi </h2>
${map.name[0]}
<br/>
${map.url[0]}
<br/>
${map.web[0]}
</br>
${page}
</br>
${map.pageNext[0]}
</br>
${map.method[0]}
</br>
<hr/>
${name}
<hr/>
${url}
<hr/>
${web}
<hr/>
<s:iterator begin="1" end="5" status="1">
    <s:property></s:property>
    <hr/>
</s:iterator>
<s:form action="" name="" method="POST">
<s:textfield name="name" label="用户名" value=""></s:textfield>
    <s:submit value="提交"></s:submit>

</s:form>

</body>
</html>
