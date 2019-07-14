<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>index</title>
    <script src="js/jquery-1.8.3.js" type="text/javascript"></script>
    <script type="text/javascript">

$(document).ready(function () {
    $("#button1").click(function () {
        alert("post")
        $.post(
            "${pageContext.request.contextPath}/findXxall.action",
            function (result) {
                /*document.write(result)*/
                $("#div1").html("");
                $("#div1").append(result)
            }

        )
    });
});

    </script>
</head>
<body>
welcome to page1
<input type="button" id="button1" value="submit">
<p>xxx</p>
<form id="form1" action="${pageContext.request.contextPath}/findXxall.action">

    <input type="submit">
</form>
<div id="div1"></div>
</body>
</html>
