<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/14/2022
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="save" method="get">
    <h1>SandWich Condiment</h1>
    <input type="checkbox" id="lettuce" name="condiment" value="lettuce">
    <label for="lettuce"> Lettuce</label><br>
    <input type="checkbox" id="tomato" name="condiment" value="tomato">
    <label for="tomato"> Tomato</label><br>
    <input type="checkbox" id="mustard" name="condiment" value="mustard">
    <label for="mustard"> Mustard</label><br>
    <input type="checkbox" id="sprout" name="condiment" value="sprout">
    <label for="sprout"> Sprout</label><br>

    <input type="submit" value="submit">
    <h3>SandWich Condiment :
        ${sandwich}
    </h3>
</form>
</body>
</html>
