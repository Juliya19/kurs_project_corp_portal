<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sing Up</title>
    <link rel="stylesheet" href="../../../resources/css/bootstrap.min.css">
    <script src="../../../resources/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../../resources/css/style.css">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

    <script type="text/javascript">
        function findEqualsLogin() {
            $.ajax({
                url: 'findEqualsLogin',
                data: ({name : $('#login').val()}),
                success: function(data) {
                    $('#isBeing').html(data);
                }
            });
        }

        function checkStrength() {
            $.ajax({
                url: 'checkStrength',
                data: ({name : $('#password').val()}),
                success: function(data) {
                    $('#strengthValue').html(data);
                }
            });
        }
    </script>
</head>
<body>
<!--header-->
<header class = "upper">
</header>
<div class="container">
    <!--context-->
    <div class="row">
        <div class="col-md-3">
        </div>
        <div class="col-md-6 form-group">
            <h2>Шаг 1 </h2><br>
            <form:form class="center" method="POST" commandName="user" action="sing-up-2" role="form">
                <fieldset>
                    <form:label style="font-size: 14pt" path="login">Логин:</form:label><br>
                    <form:input class="col-md-6 input-lg" path="login" onkeyup="findEqualsLogin()"/>
                    <span style="float: right" id="isBeing"></span><br><br><br>

                    <form:label style="font-size: 14pt" path="password">Пароль:</form:label><br>
                    <form:password class="col-md-6 input-lg" path="password" onkeyup="checkStrength()"/>
                    <span style="float: right" id="strengthValue"></span><br><br>

                </fieldset><br><br>

               <%-- <fieldset>
                    <form:label path="lastname">Фамилия:</form:label><br>
                    <form:input class="form-control" path="lastname"/><br>
                    <form:errors path="lastname" cssClass="error"/><br>

                    <form:label path="firtsname">Имя:</form:label><br>
                    <form:input class="form-control" path="firtsname"/><br>
                    <form:errors path="firtsname" cssClass="error"/><br>

                    <form:label path="name">Отчество:</form:label><br>
                    <form:input class="form-control" path="name"/><br>
                    <form:errors path="name" cssClass="error"/><br>

                    <form:label path="dateOfBirth">Дата рождения:</form:label>
                    <div class='input-group date' id='datetimepicker9'>
                        <form:input type='text' class="form-control" path="dateOfBirth"/>
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-calendar">
                            </span>
                        </span>
                    </div>
                </fieldset>--%>
                <!--Submits-->
                <input style="float: right" class="btn btn-primary col-md-3" type="submit" value="Шаг 2">
            </form:form>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(function () {
        $('#datetimepicker9').datetimepicker({
            viewMode: 'years'
        });
    });
</script>
</body>
</html>
