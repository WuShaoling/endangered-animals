<%--
Created by IntelliJ IDEA.
User: wu124
Date: 2018-05-09
Time: 13:29
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Pandora</title>
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="source/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="source/assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="source/assets/css/form-elements.css">
    <link rel="stylesheet" href="source/assets/css/style.css">
    <link rel="shortcut icon" href="source/assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144"
          href="source/assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114"
          href="source/assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="source/assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="source/assets/ico/apple-touch-icon-57-precomposed.png">
</head>

<body>
<div class="top-content">
    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1>Pandora专家系统</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top">
                        <div class="form-top-left">
                            <h3>注册新用户</h3>
                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-key"></i>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <form role="" action="" method="post" class="login-form">
                            <div class="form-group">
                                <label class="sr-only" for="form-account">Username</label>
                                <input type="text" name="form-account" placeholder="account..."
                                       class="form-username form-control" id="form-account">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-username">Password</label>
                                <input type="text" name="form-username" placeholder="username..."
                                       class="form-password form-control" id="form-username">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-password">Password</label>
                                <input type="password" name="form-password" placeholder="Password..."
                                       class="form-password form-control" id="form-password">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-confirm-password">ConfirmPassword</label>
                                <input type="password" name="form-confirm-password" placeholder="confirm password..."
                                       class="form-password form-control" id="form-confirm-password">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-phone">Password</label>
                                <input type="text" name="form-phone" placeholder="phone..."
                                       class="form-password form-control" id="form-phone">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-email">Password</label>
                                <input type="text" name="form-email" placeholder="email..."
                                       class="form-password form-control" id="form-email">
                            </div>
                            <button onclick="Register()" type="button" class="btn">注册</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="source/assets/js/jquery-1.11.1.min.js"></script>
<script src="source/assets/bootstrap/js/bootstrap.min.js"></script>
<script src="source/assets/js/jquery.backstretch.min.js"></script>
<script src="source/assets/js/scripts.js"></script>
<script>
    function Register() {
        var account = document.getElementById("form-account").value;
        var username = document.getElementById("form-username").value;
        var password = document.getElementById("form-password").value;
        var confirmpassword = document.getElementById("form-confirm-password").value;
        var phone = document.getElementById("form-phone").value;
        var email = document.getElementById("form-email").value;

        if (account.length == 0 || account.length > 20) {
            alert("账号长度不正确");
            return;
        } else if (username.length == 0 || username.length > 20) {
            alert("用户名长度不正确");
            return;
        } else if (password.length == 0 || password.length > 20) {
            alert("密码长度不正确");
            return;
        } else if (password.length != confirmpassword.length) {
            alert("密码不一致");
            return;
        } else if (phone.length != 11) {
            alert("手机号不正确");
            return;
        } else if (email.length == 0) {
            alert("邮箱长度不正确");
            return;
        }
        $.ajax({
            type: "POST",
            url: "/professor/register",
            data: {
                account: account,
                username: username,
                password: password,
                phone: phone,
                email: email
            },
            dataType: "json",
            success: function (data) {
                if (data.code == "1") {
                    alert("注册成功");
                    window.location.href = "..";
                } else {
                    alert(data.content)
                }
            }
        });
    }
</script>
</body>
</html>