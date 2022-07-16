<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/15/2022
  Time: 8:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<form:form modelAttribute="mail" action="/save" method="post">
    <table class="table">
        <tr>
            <td>ID</td>
            <td>
                <form:input path="id" />
            </td>
        </tr>

        <td>Language</td>
        <td>
            <form:select path="language" >
                <form:options items="${languageList}"/>
            </form:select>
        </td>
        </tr>
        <tr>
            <td>Page Size</td>
            <td>
                <form:select path="pageSize">
                    <form:options items="${sizeList}"/>value=${sizeList}
                </form:select>
            </td>
        </tr>

        <tr>
            <td>Spams Filter</td>
            <td>
                <form:input path="spamsFilter"/>
            </td>
        </tr>

        <tr>
            <td>Signature</td>
            <td>
                <form:input path="signature"/>
            </td>
        </tr>
    </table>
    <div>
        <button type="submit">Update</button>
    </div>
    <div>
        <button type="reset">Cancel</button>
    </div>
</form:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</body>
</html>
