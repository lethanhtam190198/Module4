<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/13/2022
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="/usd">
    <label>USD: </label><br/>
    <input type="number" name="usd" placeholder="USD" value="0"/><br/>
    <h1>Result : ${vnd} VND</h1>
    <input type="submit" id="submit" value="Converter"/>
</form>
</body>
</html>
