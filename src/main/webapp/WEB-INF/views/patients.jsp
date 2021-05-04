<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="header.html" %>--%>
<%--<%@ include file="footer.jsp" %>--%>

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

<header class="header">
    <div class="row-logo">
        <div class="col-lg-1">
            <img src="img/logo-mini.jpg" width="200" height="160" alt="logo-mini.jpg">
        </div>
        <div class="col-lg-2">
            <h2>CLINIC</h2>
            <h4>Адрес клиники: г.Санкт-Петерубрг, наб.Обводного канала, д.9</h4>
            <h4>Телефон: 8-800-800-80-80</h4>
        </div>
        <div class="col-lg-3">
            <h4>ИМЯ ПОСЕТИТЕЛЯ</h4>
            <img src="img/admin.jpg" width="140" height="88" alt="admin.jpg">
            <button type="submit" class="btn">ВЫЙТИ</button>
        </div>
    </div>
</header>

<div class="container">
    <div class="vertical-menu">
        <a href="http://localhost:8080/T_school_war_exploded/">Главная</a>
        <a href="http://localhost:8080/T_school_war_exploded/patient/" class="active">Пациенты</a>
        <a href="http://localhost:8080/T_school_war_exploded/events/">Процедуры</a>
        <a href="http://localhost:8080/T_school_war_exploded/employee/">Сотрудники</a>
        <a href="#">Приемная</a>
    </div>
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
<footer class="footer">
    <div>
        <div class="text-center">
                <span>Обращайтесь в <a href="https://www.t-systems.com/ru/en">Техподдержку</a>,
                    <a href="tel:+7812 5555555">+7 812 555-55-55</a> </span>
        </div>
    </div>
</footer>
</body>
</html>

<style>
    /* footer */
    .footer {
        position: absolute;
        bottom: 0;
        width: 100%;
        height: 55px;
        line-height: 2.5rem;
        background-color: #efffe9;
        border-top: 3px solid #28a347;
    }

    /* header */
    .header {
        position: absolute;
        top: 0;
        width: 100%;
        height: 165px;
        line-height: 25px;
        background-color: #efffe9;
        border-bottom: 3px solid #28a347;
    }

    .row-logo {
        display: flex;
        flex: 1;
        height: 16.5rem;
        line-height: 50px;
        color: #28a347;
    }

    .col-lg-1 {
        min-width: 200px;
        max-width: 200px;
    }

    .col-lg-2 {
        text-align: center;
        height: 16.5rem;
        flex: 1;
        min-width: 300px;
        overflow: hidden;
    }

    .col-lg-3 {
        text-align: center;
        min-width: 200px;
        max-width: 200px;
    }

    .col-lg-3 .btn {
        font-size: 14px;
        color: #fff;
        background: #28a347;
        border-radius: 30px;
        border: none;
        text-transform: capitalize;
        transition: all 0.5s ease 0s;
        margin-top: -30px;
    }

    /*Menu*/
    .vertical-menu {
        display: block;
        width: 200px;
        height: auto;
        list-style: none;
        position: absolute;
        left: 0;
        bottom: 55px;
        top: 165px;
        border-right: 3px solid #28a347;
        float: left;
        overflow-y: scroll;
    }

    .vertical-menu a {
        background-color: #efffe9;
        color: #28a347;
        display: block;
        padding: 20px;
        text-decoration: none;
        border: 8px solid #fff;
        border-radius: 15px
    }

    .vertical-menu a:hover {
        background-color: #f9e9ff;
        color: #d5272b;
    }

    .vertical-menu a.active {
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

    .section-hidding {
        margin: 10px;
        margin-top: 100px;
    }

    .form {
        width: 100%;
        height: auto;
        display: block;
        margin: 10px;
    }

    .form-hidding {
        margin-top: 30px;
        border-bottom: 1px solid #28a347;
        border-top: 1px solid #28a347;
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