<%@ page import="cn.edu.sdust.wsl.bean.UnIdentified" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: WSL
  Date: 2018-04-12
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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

    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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
            <div class="col-lg-12 col-md-12 text-center">
                <h1 id="fh5co-logo"><a href="index.html">Pandora专家识别系统</a></h1>
            </div>
        </div>
    </div>
</header>

<div class="container-fluid">
    <div class="row fh5co-post-entry">
        <%
            Iterator<UnIdentified> it = ((List<UnIdentified>) request.getAttribute("data")).iterator();
            while (it.hasNext()) {
                UnIdentified temp = it.next();
                out.print("<article class=\"col-lg-3 col-md-3 col-sm-3 col-xs-6 col-xxs-12 animate-box\">");
                out.print("<figure>");
                out.print("<a><img src=\"");
                out.print(temp.getUimage());
                out.print("\" alt=\"Image\" class=\"img-responsive\"></a>");
                out.print("</figure>");
                out.print("<span class=\"fh5co-meta\"><a href=getdetail?uid=" + temp.getUid() + ">点击查看详情</a></span>");
                out.print("<span class=\"fh5co-meta fh5co-date\">");
                out.print(temp.getTime());
                out.print("</span>");
                out.print("</article>");
            }
        %>
    </div>
</div>

<script src="../../source/js/jquery.min.js"></script>
<script src="../../source/js/jquery.easing.1.3.js"></script>
<script src="../../source/js/bootstrap.min.js"></script>
<script src="../../source/js/jquery.waypoints.min.js"></script>
<script src="../../source/js/main.js"></script>
</body>
</html>

