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
                    <div class="description">
                        <p>
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top">
                        <div class="form-top-left">
                            <h3>登录系统</h3>
                            <p>输入用户名和密码：</p>
                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-key"></i>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <form role="form" action="" method="post" class="login-form">
                            <div class="form-group">
                                <label class="sr-only" for="form-username">Username</label>
                                <input type="text" name="form-username" placeholder="Username..."
                                       class="form-username form-control" id="form-username">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-password">Password</label>
                                <input type="password" name="form-password" placeholder="Password..."
                                       class="form-password form-control" id="form-password">
                            </div>
                            <button onclick="Login()" type="button" class="btn">登录</button>
                            <center><a href="/toregister">注册</a></center>
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
    function Login() {
        var username = document.getElementById("form-username").value;
        var password = document.getElementById("form-password").value;
        $.ajax({
            type: "POST",
            url: "/professor/login",
            data: {username: username, password: password},
            dataType: "json",
            success: function (data) {
                if (data == "1") {
                    window.location.href = "/un/";
                } else {
                    alert(data)
                }
            }
        });
    }
</script>
</body>
</html>