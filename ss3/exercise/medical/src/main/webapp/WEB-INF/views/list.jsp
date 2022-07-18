<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/17/2022
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/boostrap/bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/boostrap/datatables/css/dataTables.bootstrap4.min.css"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<div>
    <h1>${note}</h1>

    <table class="table table-striped table-inverse table-responsive col-lg-12">

        <thead class="thead-inverse col-lg-12">
        <tr class="col-lg-12">
            <th>ID</th>
            <th>Name</th>
            <th>BirthYear</th>
            <th>Gender</th>
            <th>National</th>
            <th>IdCard</th>
            <th>TransportType</th>
            <th>TransportId</th>
            <th>Seat</th>
            <th>InputDay</th>
            <th>InputMonth</th>
            <th>inputYear</th>
            <th>OutDay</th>
            <th>OutMonth</th>
            <th>OutYear</th>
            <th>Other</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${medicalList}" var="item">
            <tr class="col-lg-12">
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.birthYear}</td>
                <td>${item.gender}</td>
                <td>${item.national}</td>
                <td>${item.idCard}</td>
                <td>${item.transportType}</td>
                <td>${item.transportId}</td>
                <td>${item.seat}</td>
                <td>${item.inputDay}</td>
                <td>${item.inputMonth}</td>
                <td>${item.inputYear}</td>
                <td>${item.outDay}</td>
                <td>${item.outMonth}</td>
                <td>${item.outYear}</td>
                <td>${item.other}</td>
                <td>
                    <button>
                        <a href="/update?id=${item.id}">
                            <button value="update">update</button>
                        </a>
                    </button>
                </td>
            </tr>
        </c:forEach>

        <tr>
            <th>
                <a href="/create">Create</a>
            </th>
        </tr>
        </tbody>
    </table>

</div>
</body>
<script src="/boostrap/jquery/jquery-3.5.1.min.js"></script>
<script src="/bootstrap/datatables/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/bootstrap/bootstrap413/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</html>
