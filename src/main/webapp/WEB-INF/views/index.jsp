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
        <a href="http://localhost:8080/T_school_war_exploded/" class="active">Главная</a>
        <a href="http://localhost:8080/T_school_war_exploded/patient/" >Пациенты</a>
        <a href="http://localhost:8080/T_school_war_exploded/events/">Процедуры</a>
        <a href="http://localhost:8080/T_school_war_exploded/employee/">Сотрудники</a>
        <a href="#">Приемная</a>
    </div>
    <div class="content">
        <div class="navi-block ">
            <a href="http://localhost:8080/T_school_war_exploded/patient/" class="block" >
                <h2>Пациенты</h2>
            </a>
            <a href="http://localhost:8080/T_school_war_exploded/events/" class="block">
                <h2>Процедуры</h2>
            </a>
        </div>
        <div class="navi-block">
            <a href="http://localhost:8080/T_school_war_exploded/employee/" class="block">
                <h2>Сотрудники</h2>
            </a>
            <a href="#" class="block">
                <h2>Приемная</h2>
            </a>
        </div>


    </div>
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
    /*index navi*/

    .navi-block {
        position: relative;
        display: block;
        height: 40%;
        width: 100%;
        margin: 40px;
        box-sizing: border-box;
        text-align: justify;
    }

    .block {
        position: relative;
        display: inline-block;
        width: 45%;
        height: 100%;
        box-sizing: border-box;
        text-align: center;
        background-color: #efffe9;
        border: 3px solid #28a347;
        border-radius: 30px;
        color: #28a347;
        font-size: 20px;
        text-decoration: none;
    }

    .block:hover {
        background-color: #f9e9ff;
        color: #d5272b;
    }

    .block:active {
        background-color: #28a347;
        color: #efffe9;
    }
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
        margin: 0px;
        list-style: none;
        position: absolute;
        left: 0;
        bottom: 55px;
        top: 165px;
        border-right: 3px solid #28a347;
        float: left;
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
</style>