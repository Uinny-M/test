
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@include file="../img/logo-mini.jpg"%>--%>
<img src="./img/logo-mini.jpg">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="./css/t.css" rel="stylesheet" type="text/css">
    <title>CLINIC</title>
    
</head>
<body>
<header class="header">
    <div class="row-logo">
        <div class="col-lg-1">
            <img src="./img/logo-mini.jpg" width="200" height="160" alt="logo-mini.jpg">
        </div>
        <div class="col-lg-2">
            <h2>CLINIC</h2>
            <h4>Адрес клиники: г.Санкт-Петерубрг, наб.Обводного канала, д.9</h4>
            <h4>Телефон: 8-800-800-80-80</h4>
        </div>
        <div class="col-lg-3">
            <h4>ИМЯ ПОСЕТИТЕЛЯ</h4>
            <img src="../img/admin.jpg" width="140" height="88" alt="admin.jpg">
            <button type="submit" class="btn">ВЫЙТИ</button>
        </div>
    </div>
</header>
</body>
</html>
<style>
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
</style>
