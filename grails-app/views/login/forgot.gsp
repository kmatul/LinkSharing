<%--
  Created by IntelliJ IDEA.
  User: intelligrape
  Date: 22/4/15
  Time: 2:43 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Reset Password here</title>
</head>

<body>


<div class="container">



    <div class="row">
        <div class="bs-example" style="border: 1px solid ;float: right; height: 25%; width: 30%;margin-right: 2%;margin-top: 2%;
        background: -webkit-linear-gradient(#717171, #e1e1e1);">
            <p style="margin-top :0px; padding-top: 0px; border-bottom: 1px solid; background: darkseagreen;font-size: medium">Login</p>
            <g:form controller="login" action="doLogin">
                <div class="form-group">
                    %{--<span style="padding: 10px">--}%
                    <label style="float:left">Email/User Name* :</label>
                    <g:textField name="name" size="20" style="float:right" class="form-control"/>
                    %{--</span>--}%
                </div>
            %{--<br/>--}%
                <div class="form-group">
                    %{--<span style="padding: 10px">--}%
                    <label style="float:left">Password* :</label>
                    <g:passwordField name="password" size="20" style="float:right" class="form-control"/>
                    %{--</span>--}%
                </div>
            %{--<br/>--}%
                <div class="form-group">
                    %{--<span style="padding: 10px">--}%
                    <g:submitButton name="submit" style="float:left" class="btn-primary btn">Login</g:submitButton>
                    <g:link controller="login" action="forgot" style="float:right;margin-right: 20px">Forgot Password</g:link>

                    %{--</span>--}%
                </div>
            </g:form>
        </div>

    </div>
</div>
</body>
</html>