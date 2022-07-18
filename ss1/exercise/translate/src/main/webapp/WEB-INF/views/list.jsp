<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/13/2022
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post" action="/dictionary">
    <input type="text" name="keyword" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="search"/>
    <h3>Result : ${result}</h3>
</form>
</body>
</html>
