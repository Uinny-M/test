
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="vertical-menu">
    <a href="http://localhost:8080/T_school_war_exploded/" class="menu-index">Главная</a>
    <a href="http://localhost:8080/T_school_war_exploded/patient/" class="menu-patient">Пациенты</a>
    <a href="http://localhost:8080/T_school_war_exploded/events/" class="menu-events">Процедуры</a>
    <a href="http://localhost:8080/T_school_war_exploded/employee/" class="menu-employees">Сотрудники</a>
    <a href="#">Приемная</a>
</div>

<style>
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
        overflow: auto;
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


</style>