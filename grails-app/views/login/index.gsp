<!DOCTYPE html>
<html>
<head>

    <link rel="stylesheet" type="text/css" href="${resource(dir:'css', file:'bootstrap.min.css')}"/>
    <link rel="stylesheet" href="${resource(dir:'css', file:'bootstrap-theme.min.css')}"/>

    <title>Login to enter in the Link Sharing</title>
    <style type="text/css">
        body{
            /*font-family: "Verdana", sans-serif;*/
        }
    </style>

</head>

<body>

<div class="container">

    <div class="row">
        <div class="bs-example" style="border: 1px solid ;float: right; height: 25%; width: 30%;margin-top: 1%;
        background: -webkit-linear-gradient(#717171, #e1e1e1);">
            <p style="border-bottom: 1px solid; background: darkseagreen;font-weight: bold;padding: 5px;">
                Login
            </p>
            <g:form controller="login" action="doLogin" style="margin: 5px;" class="form">
                <div class="form-group">
                   %{--<span style="padding: 10px">--}%
                       <label>Email/User Name* :</label>
                        <g:textField name="name" size="20" class="form"/>
                    %{--</span>--}%
                </div>
            %{--<br/>--}%
                <div class="form-group">
                    %{--<span style="padding: 10px">--}%
                        <label>Password* :</label>
                        <g:passwordField name="password" size="20" class="form-control"/>
                    %{--</span>--}%
                </div>
            %{--<br/>--}%
                <div class="form-group">
                        %{--<span style="padding: 10px">--}%
                        <g:submitButton name="submit" value="Login"  class="btn-primary btn">Login</g:submitButton>
                        <g:link controller="login" action="forgot" style="float:right;margin-right: 20px">Forgot Password</g:link>

                        %{--</span>--}%
                </div>
            </g:form>
        </div>

    </div>
</div>

<link rel="script"
      href="${resource(dir:'js', file:'bootstrap.min.js')}"/>


</body>
</html>