<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/14/2022
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <input type="number"  name="usd" required value="${usd}" placeholder="nhap gia tri">
    <input type="submit" value="submit">
    <h3>result : ${money}</h3>
</form>

</body>
</html>
