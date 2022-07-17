<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/17/2022
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>


<div class="container">
    <h3 class="col-lg-12 text-center align-content-center">TỜ KHAI Y TẾ</h3>
    <h5>
        ĐÂY LÀ TÀI LIỆU QUAN TRỌNG ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN
        NHIỄM
    </h5>
    <span class="text-danger"> Khuyến cáo : Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể bị xử lý hình sự
</span>
    <form:form action="/create-medical" modelAttribute="medical">
        <table class="table-primary col-lg-12 row-bli">
            <tr class="row col-lg-12">
                <td class="row col-lg-12"><label>Id <span class="text-danger"> (*)</span></label></td>
            </tr>

            <tr class="row col-lg-12">
                <td class="row col-lg-12"><form:input path="id"/></td>
            </tr>

            <tr class="row col-lg-12">
                <td><label>Họ tên <span class="text-danger">(*)</span></label></td>
            </tr>

            <tr class="row col-lg-12">
                <td class="row col-lg-12"><form:input path="name"/></td>
            </tr>

            <tr>
                <td class="row col-lg-2">Năm sinh
                    <span class="text-danger">(*)</span>
                    <form:select path="birthYear" items="${birthdayList}"> </form:select>
                </td>
                <td class="row col-lg-2">Giới tính
                    <span class="text-danger">(*)</span>
                    <form:select path="gender" items="${genderList}"> </form:select>
                </td>
                <td class="row col-lg-2">Quốc tịch
                    <span class="text-danger">(*)</span>
                    <form:select path="national" items="${nalionalityList}"> </form:select>
                </td>
            </tr>

            <tr class="row col-lg-12">
                <td class="row col-lg-12">
                    <label for="idCard">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác
                        <span>(*)</span>
                    </label>
                </td>
            </tr>

            <tr class="row col-lg-12">
                <td class="row col-lg-12"><form:input path="idCard" id="idCrad" cssClass="col-lg-12"/></td>
            </tr>

            <tr>
                <td> Thông tin đi lại <span class="text-danger">(*)</span></td>
            </tr>

            <tr>
                <td><form:radiobuttons path="transportType" items="${transportType}"/></td>
            </tr>

            <tr class="row col-lg-6">
                <td class="row col-lg-6"> Số hiệu phương tiện</td>
                <td class="row col-lg-6">Số ghế</td>
            </tr>

            <tr class="row col-lg-6">
                <td class="row col-lg-6"><form:input path="transportId"/></td>
                <td class="row col-lg-6"><form:input path="seat"/></td>
            </tr>
            <tr>
                <td class="">Ngày khởi hành <span class="text-danger">(*)</span></td>
                <td>Ngày kết thúc <span class="text-danger">(*)</span></td>
            </tr>

            <tr>

                <td>
                    <form:select path="inputDay">
                        <form:options items="${inputDay}"></form:options>
                    </form:select>

                    <form:select path="inputMonth">
                        <form:options items="${inputMonth}"></form:options>
                    </form:select>

                    <form:select path="inputYear">
                        <form:options items="${inputYear}"></form:options>
                    </form:select>
                </td>

                <td>
                    <form:select path="outDay">
                        <form:options items="${outDay}"></form:options>
                    </form:select>

                    <form:select path="outMonth">
                        <form:options items="${outMonth}"></form:options>
                    </form:select>

                    <form:select path="outYear">
                        <form:options items="${outYear}"></form:options>
                    </form:select>
                </td>

            </tr>

            <tr>
                <td> trong vòng 14 ngày qua , Anh/chị có đi đến tỉnh thành phố nào? <span
                        class="text-danger">(*)</span>
                </td>
            </tr>

            <tr>
                <td><form:input path="other"/></td>
            </tr>

            <tr>
                <td>
                    <button type="submit"  value="/create-info">Đăng kí</button>
                </td>
            </tr>
        </table>
    </form:form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
        crossorigin="anonymous"></script>
</html>
