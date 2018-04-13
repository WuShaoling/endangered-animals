<%@ page import="cn.edu.sdust.wsl.bean.Location" %>
<%@ page import="cn.edu.sdust.wsl.bean.UnIdentified" %>
<%--
  Created by IntelliJ IDEA.
  User: WSL
  Date: 2018-04-12
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Pandora</title>

    <link rel="shortcut icon" href="favicon.ico">
    <link href='http://fonts.googleapis.com/css?family=Playfair+Display:400,700,400italic|Roboto:400,300,700'
          rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="../../source/css/animate.css">
    <link rel="stylesheet" href="../../source/css/icomoon.css">
    <link rel="stylesheet" href="../../source/css/bootstrap.css">
    <link rel="stylesheet" href="../../source/css/style.css">
    <script src="../../source/js/modernizr-2.6.2.min.js"></script>
    <script src="../../source/js/respond.min.js"></script>

    <style>
        .button {
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div id="fh5co-offcanvas">
    <a href="#" class="fh5co-close-offcanvas js-fh5co-close-offcanvas"><span><i
            class="icon-cross3"></i> <span>Close</span></span></a>
    <div class="fh5co-bio">
        <figure>
            <img src="../../source/images/person1.jpg" alt="Free HTML5 Bootstrap Template" class="img-responsive">
        </figure>
        <h3 class="heading">关于我</h3>
        <h2>WSL</h2>
        <p>动物保护专家. </p>
    </div>
</div>

<header id="fh5co-header">
    <div class="container-fluid">
        <div class="row">
            <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
            <ul class="fh5co-social">
                <li><a class="button" href="/un/"> 首页 </a></li>
            </ul>
            <div class="col-lg-12 col-md-12 text-center">
                <h1 id="fh5co-logo"><a href="">详情</a></h1>
            </div>
        </div>
    </div>
</header>

<%
    UnIdentified un = (UnIdentified) request.getAttribute("animal");
    Location location = (Location) request.getAttribute("location");
%>
<a href="/un/predetail?index=<%out.print(un.getUid());%>" class="fh5co-post-prev"><span><i
        class="icon-chevron-left"></i> Prev</span></a>
<a href="/un/nextdetail?index=<%out.print(un.getUid());%>" class="fh5co-post-next"><span>Next <i
        class="icon-chevron-right"></i></span></a>

<div class="container-fluid">
    <div class="row fh5co-post-entry single-entry">

        <article
                class="col-lg-8 col-lg-offset-2 col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 col-xs-12 col-xs-offset-0">
            <figure class="animate-box">
                <img src="<%out.print(un.getUimage());%>" alt="Image" class="img-responsive">
            </figure>

            <p>拍摄地：<%out.print(location.getProvince());%><%out.print(location.getCity());%></p>

            <p>动物类别</p>
            <input type="text" id="aname"/><br>
            <p>保护等级</p>
            <select name="degree" id="degree">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
            </select>
            <br>
            <br>
            <span class="fh5co-meta animate-box"><button class="button"
                                                         onclick="Submit(<%out.print(un.getUid());out.print(",");out.print(location.getId());%>)">提交</button></span>
        </article>

    </div>
</div>

<script src="../../source/js/jquery.min.js"></script>
<script src="../../source/js/jquery.easing.1.3.js"></script>
<script src="../../source/js/bootstrap.min.js"></script>
<script src="../../source/js/jquery.waypoints.min.js"></script>
<script src="../../source/js/main.js"></script>

<script>
    function Submit(uid, lid) {
        var aname = document.getElementById("aname").value;
        var degree = $('#degree option:selected').val();
        $.ajax({
            type: "POST",
            url: "/un/identified",
            data: {uid: uid, aname: aname, degree: degree, lid: lid},
            dataType: "json",
            success: function (data) {
                if (data.code == 1) {
                    window.location.href = "/un/";
                }
                alert(data);
            }
        });
    }
</script>

</body>
</html>


