<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="help/header.jsp" %>
<%@ include file="help/footer.jsp" %>
<%@include file="help/menu.jsp" %>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta/>
    <link href="${pageContext.request.contextPath}/assets/css/t.css" rel="stylesheet" type="text/css">
    <title>Employees</title>
</head>
<body>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
<jsp:include page="help/header.jsp"></jsp:include>
<div class="container">
    <jsp:include page="help/menu.jsp"></jsp:include>
    <div class="content">
        <h3>Employee's data</h3>
        <form:form action="${pageContext.request.contextPath}/employee/add" method="post" modelAttribute="employee"
                   cssClass="form">
            <div class="form-group-create row">
                <b class="col-xs-3">Secondname</b>
                <form:input cssClass="form-s" path="secondName"/>
            </div>
            <div class="form-group-create row">
                <b class="col-xs-3">Firstname</b>
                <form:input cssClass="form-s" path="firstName"/>
            </div>
            <div class="form-group-create row">
                <b class="col-xs-3">Middlename</b>
                <form:input cssClass="form-s" path="middleName"/>
            </div>
            <div class="form-group-create row">
                <b class="col-xs-3">Position</b>
                <form:input cssClass="form-s" path="position"/>
            </div>
            <div class="form-group-create row">
                <b class="col-xs-3">Login</b>
                <form:input cssClass="form-s" path="login"/>
            </div>
            <div class="form-group-create row">
                <b class="col-xs-3">Password</b>
                <form:password cssClass="form-s" path="password"/>
            </div>
            <div class="form-group-create row">
                <b class="col-xs-3">Access level</b>
                <div class="form-check">
                Admin <form:radiobutton cssClass="form-check-input" value="ADMIN" path="role"/>
                Doctor <form:radiobutton cssClass="form-check-input" value="DOCTOR" path="role"/>
                Nurse <form:radiobutton cssClass="form-check-input" value="NURSE" path="role"/>
                </div>
            </div>
            <br>
            <sec:authorize access="hasRole('ROLE_ADMIN')">
                <button type="submit" class="btn">Save changes</button>
            </sec:authorize>
        </form:form>
        <br>
    </div>
</div>
<jsp:include page="help/footer.jsp"></jsp:include>
</body>
</html>

<style>
    /*Menu*/
    .vertical-menu a.menu-employees{
        background-color: #28a347;
        color: #efffe9;
    }
    /*!*Content*!*/
    /*.content {*/
    /*    background-color: #fff;*/
    /*    height: auto;*/
    /*    width: auto;*/
    /*    right: 0;*/
    /*    display: block;*/
    /*    !*margin: 0px;*!*/
    /*    padding: 20px;*/
    /*    list-style: none;*/
    /*    position: absolute;*/
    /*    left: 200px;*/
    /*    bottom: 55px;*/
    /*    top: 165px;*/
    /*    overflow-y: scroll;*/
    /*}*/
    /*!*Form-search*!*/
    /*.content .btn {*/
    /*    font-size: 14px;*/
    /*    height: 30px;*/
    /*    color: #fff;*/
    /*    background: #28a347;*/
    /*    border-radius: 15px;*/
    /*    padding: 5px 25px;*/
    /*    border: none;*/
    /*    text-transform: capitalize;*/
    /*    transition: all 0.5s ease 0s;*/
    /*}*/
    /*.form {*/
    /*    width: 100%;*/
    /*    height: auto;*/
    /*    display: block;*/
    /*    margin: 10px;*/
    /*    text-transform: capitalize;*/
    /*}*/


    /*.form-group-search {*/
    /*    float: left;*/
    /*    margin-left: 10px;*/
    /*    margin-top: 10px;*/
    /*    display: inline;*/
    /*}*/
    /*.row {*/
    /*    margin-top: 20px;*/
    /*}*/
    /*.form-s {*/
    /*    background-color: #f9e9ff;*/
    /*    width: 300px;*/
    /*    border: 1px solid #28a347;*/
    /*}*/
    /*.form b {*/
    /*    font-size: 17px;*/
    /*    color: #28a347;*/
    /*    transition: all 0.5s ease 0s;*/
    /*}*/
    /*!*Table*!*/
    /*.table {*/
    /*    background-color: #efffe9;*/
    /*}*/
    /*.table :active {*/
    /*    background-color: #efffe9;*/
    /*}*/
</style>