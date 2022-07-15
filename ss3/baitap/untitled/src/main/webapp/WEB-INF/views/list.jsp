<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/15/2022
  Time: 11:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <input type="text" pattern="^\d*(\.\d{0,9})?$"  name="num1" value="${num1}" required placeholder="nhap gia tri 1">
    <input type="text" pattern="^\d*(\.\d{0,9})?$" name="num2" value="${num2}" required placeholder="nhap gia tri 2">
    <hr>
    <button type="submit" name="calculation" value="add">Addivision(+)</button>
    <button type="submit" name="calculation" value="sub">Subtraction(-)</button>
    <button type="submit" name="calculation" value="mul">Multiplication(*)</button>
    <button type="submit" name="calculation" value="div">Divison(/)</button>

    <h3>Total : ${total}</h3>
</form>
</body>
</html>
