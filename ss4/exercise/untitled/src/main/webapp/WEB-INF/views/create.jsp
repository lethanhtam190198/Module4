<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/18/2022
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container col-lg-7 align-content-center">
    <form:form action="/create" modelAttribute="medical">
        <table class="table-primary col-lg-12 row-bli">
            <tr class="row col-lg-6">
                <td class="row col-lg-6">Id
                    <form:input path="id"/>
                </td>
            </tr>
            <td class="row col-lg-6">Ho va Ten
                <form:input path="name"/>
            </td>
            </tr>
            <tr>
                <td class="row col-lg-6">Nam sinh
                    <form:select path="birthDay">
                        <form:options items="${birthdayList}"></form:options>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Thong tin di lai
                    <form:radiobuttons path="travelInformation" items="${travelInformationList}"/>
                </td>
            </tr>
            <tr>
                <td class="">Ngày khởi hành <span class="text-danger">(*)</span>
                    <form:select path="departureDay">
                        <form:options items="${departureDayList}"></form:options>
                    </form:select>
                </td>

                <td>Ngày kết thúc <span class="text-danger">(*)</span>
                    <form:select path="endDay">
                        <form:options items="${endDayList}"></form:options>
                    </form:select>
                </td>
            </tr>
            <td class="row col-lg-6">Trong vong 14 ngay qua......
                <form:input path="info"/>
            </td>
            <tr>
                <td>
                    <button type="submit" value="/create-info">Đăng kí</button>
                </td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>
