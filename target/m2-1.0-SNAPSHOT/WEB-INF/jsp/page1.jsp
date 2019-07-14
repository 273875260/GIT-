<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/10
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>page1</title>

</head>
<body>
welcome to page1
<input type="button" id="button">


<c:forEach items="${x}" var="xx">
    <p>${xx.id}</p>
    <p>${xx.name}</p>
</c:forEach>
</body>
</html>
