<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="header.html" %>--%>
<%--<%@ include file="footer.jsp" %>--%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"><meta/>
    <link href="css/t.css" rel="stylesheet" type="text/css">
    <title>Пациенты</title>
</head>

<body>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />

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
        <a href="#">Link 2</a>
        <a href="#">Link 3</a>
        <a href="#">Link 4</a>
    </div>
    <div class="content">
        <form class="form">
            <div class="form-group-search">
                <b>Name</b>
                <input type="text" class="form-s" placeholder="Фамилия">
                <button type="submit" class="btn">Найти</button>
                <!--                    <button type="submit" class="btn">Новый</button>-->

            </div>
        </form>

        <section class="section-hidding">
            <button id="example_2_1" class="btn" onclick="document.getElementById('example_2').style.display='block'; document.getElementById('example_2_1').style.display='none'; document.getElementById('example_2_2').style.display='block';" style="display:none;">Создать</button>

            <button id="example_2_2" class="btn" onclick="document.getElementById('example_2').style.display='none'; document.getElementById('example_2_2').style.display='none'; document.getElementById('example_2_1').style.display='block';">Отмена</button>
            <div id="example_2" style="display:block;">



                <form action="" class="form form-hidding">
                    <div class="form-group-create row">
                        <b class="col-xs-3">Фамилия</b>
                        <div class="col-xs-8">
                            <input class="form-s" type="text" value="Фамилия" id="example-text-input">
                        </div>
                    </div>
                    <div class="form-group-create row">
                        <b class="col-xs-3">Имя</b>
                        <div class="col-xs-8">
                            <input class="form-s" type="text" value="Имя" id="example-text-input">
                        </div>
                    </div>
                    <div class="form-group-create row">
                        <b class="col-xs-3">Отчество</b>
                        <div class="col-xs-8">
                            <input class="form-s" type="text" value="Отчество" id="example-text-input">
                        </div>
                    </div>
                    <div class="form-group row">
                        <b class="col-xs-3">Дата рождения</b>
                        <div class="col-xs-8">
                            <input class="form-s" type="date" value="2011-08-19" id="example-date-input">
                        </div>
                    </div>
                    <div class="form-group-create row">
                        <b class="col-xs-3">Страховка №</b>
                        <div class="col-xs-8">
                            <input class="form-s" type="text" value="Номер страховки" id="example-text-input">
                        </div>
                    </div>
                    <div class="form-group-create row">
                        <b class="col-xs-3">Пол</b>
                        <div>
                            <input type="radio" name="gender"> Мужской
                            <input type="radio" name="gender" value="Женский"> Женский
                        </div>
                    </div>
                    <button type="submit" class="btn">Сохранить</button>
                </form>

            </div>
        </section>
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
            <tr>

                <td>Mark</td>
                <td>02.03.2011</td>
                <td>111</td>
            </tr>
            <tr>

                <td>Jacob</td>
                <td>01.11.1900</td>
                <td>at</td>
            </tr>
            <tr>
                <td>Jacob</td>
                <td>01.11.1900</td>
                <td>at</td>
            </tr>
            </tbody>
        </table>
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
         overflow-y:scroll;
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

     .form{
         width: 100%;
         height: auto;
         display: block;
         margin: 10px;
     }
     .form-hidding{
         margin-top: 30px;
         border-bottom: 1px solid #28a347;
         border-top: 1px solid #28a347;

     }
     .form-group-search{
         float: left;
         margin-left: 10px;
         margin-top: 10px;
         display: inline;
     }
     .row{
         margin-top: 20px;
     }

     .form-s {
         background-color: #f9e9ff;
         width: 300px;
         border: 1px solid #28a347;
     }

     .form b{
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