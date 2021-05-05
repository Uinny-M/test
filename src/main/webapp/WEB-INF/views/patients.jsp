<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="help/header.jsp" %>
<%@ include file="help/footer.jsp" %>
<%@include file="help/menu.jsp" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta/>
    <link href="css/t.css" rel="stylesheet" type="text/css">
    <title>Пациенты</title>
</head>
<body>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
<jsp:include page="help/header.jsp"></jsp:include>
<div class="container">
    <jsp:include page="help/menu.jsp"></jsp:include>
    <div class="content">
        <%--        <form:form action="/T_school_war_exploded/patient/search/${patientName}" method="post" modelAttribute="patientName"--%>
        <%--                   cssClass="form">--%>
        <%--            <b>Поиск</b>--%>
        <%--            <form:input cssClass="form-s" path=""/>--%>
        <%--            <button type="submit" class="btn">Найти</button>--%>
        <%--        </form:form>--%>

        <button class="btn" style="margin: 10px">
            <a href="http://localhost:8080/T_school_war_exploded/patient/add" style="color: #efffe9">Новый пациент</a>
        </button>
<%--        <form:form action="/T_school_war_exploded/patient/add" method="POST" modelAttribute="patientNew"--%>
<%--                   cssClass="form form-hidding">--%>
<%--            <div class="form-group-create row">--%>
<%--                <b class="col-xs-3">Фамилия</b>--%>
<%--                <form:input cssClass="form-s" path="secondName"/>--%>
<%--            </div>--%>
<%--            <div class="form-group-create row">--%>
<%--                <b class="col-xs-3">Имя</b>--%>
<%--                <form:input cssClass="form-s" path="firstName"/>--%>
<%--            </div>--%>
<%--            <div class="form-group-create row">--%>
<%--                <b class="col-xs-3">Отчество</b>--%>
<%--                <form:input cssClass="form-s" path="middleName"/>--%>
<%--            </div>--%>
<%--            <div class="form-group row">--%>
<%--                <b class="col-xs-3">Дата рождения</b>--%>
<%--                <form:input cssClass="form-s" type="date" path="birthdate"/>--%>
<%--            </div>--%>
<%--            <div class="form-group-create row">--%>
<%--                <b class="col-xs-3">Пол</b>--%>
<%--                Мужской <form:checkbox cssClass="form-s" value="MALE" path="gender"/><br>--%>
<%--                Женский <form:checkbox cssClass="form-s" value="FEMALE" path="gender"/>--%>
<%--            </div>--%>
<%--            <div class="form-group-create row">--%>
<%--                <b class="col-xs-3">№ страховки</b>--%>
<%--                <form:input cssClass="form-s" path="insurance"/>--%>
<%--            </div>--%>
<%--            <button type="submit" class="btn">Сохранить</button>--%>
<%--        </form:form>--%>

        <table class="table table-striped table-bordered table-hover">
            <thead>
            <tr>
                <th colspan="3">Список пациентов</th>
            </tr>
            <h3>Список пациентов</h3>
            <tr>
                <th width="50%">ФИО</th>
                <th width="25%">Дата рождения</th>
                <th width="25%">Номер страховки</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${patients}" var="p">
                <tr>
                    <td>
                        <a href="http://localhost:8080/T_school_war_exploded/patient/${p.id}">${p.secondName} ${p.firstName} ${p.middleName}</a>
                    </td>
                    <td>${p.birthdate}</td>
                    <td>${p.insurance}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <br>
    </div><!--/.content-->
</div><!-- /.container -->
<jsp:include page="help/footer.jsp"></jsp:include>
</body>
</html>

<style>
    /*Menu*/
    .vertical-menu a.menu-patient {
        background-color: #28a347;
        color: #efffe9;
    }
    /*Content*/
    .content {
        background-color: #fff;
        height: auto;
        width: auto;
        right: 0;
        display: block;
        margin: 0px;
        padding: 0px;
        list-style: none;
        position: absolute;
        left: 200px;
        bottom: 55px;
        top: 165px;
        overflow-y: scroll;
    }
    /*Form-search*/
    .content .btn {
        font-size: 14px;
        height: 30px;
        color: #fff;
        background: #28a347;
        border-radius: 15px;
        padding: 5px 25px;
        border: none;
        text-transform: capitalize;
        transition: all 0.5s ease 0s;
    }
    .form {
        width: 100%;
        height: auto;
        display: block;
        margin: 10px;
    }
    .form-group-search {
        float: left;
        margin-left: 10px;
        margin-top: 10px;
        display: inline;
    }
    .row {
        margin-top: 20px;
    }
    .form-s {
        background-color: #f9e9ff;
        width: 300px;
        border: 1px solid #28a347;
    }
    .form b {
        font-size: 17px;
        color: #28a347;
        transition: all 0.5s ease 0s;
    }
    /*Table*/
    .table {
        background-color: #efffe9;
    }
    .table :active {
        background-color: #efffe9;
    }
</style>