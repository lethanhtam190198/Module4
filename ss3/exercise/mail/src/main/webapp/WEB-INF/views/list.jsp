<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/15/2022
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form action="/save" method="get">
    <table class="table">

        <tr>
            <th>ID</th>
            <th>Language</th>
            <th>Page Size</th>
            <th>Spams Filter</th>
            <th>Signature</th>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
                <td scope="col">${list.id}</td>
                <td scope="col">${list.language}</td>
                <td scope="col">${list.pageSize}</td>
                <td scope="col">${list.spamsFilter}</td>
                <td scope="col">${list.signature}</td>
                <td scope="col"><input type="submit" value="update" name="update"></td>
            </tr>
        </c:forEach>

    </table>

</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</html>

