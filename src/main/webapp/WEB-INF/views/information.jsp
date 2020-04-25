<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>公告管理</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/html5shiv.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/respond.min.js"></script>
    <!-- Bootstrap -->
 <%--   <link href="/information/css/bootstrap.min.css" rel="stylesheet">
    <link href="/information/ionicons/css/ionicons.min.css" rel="stylesheet">
    <link href="/information/css/animate.min.css" rel="stylesheet">
    <link href="/information/css/aos.css" rel="stylesheet">--%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <!-- main style -->
    <link href="${pageContext.request.contextPath}/information/css/style.css" rel="stylesheet">
</head>

<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 公告管理 <span class="c-gray en">&gt;</span> 公告信息 <span
        class="c-gray en">&gt;</span> 信息 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                            href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c">

    </div>
<div class="section" id="projects">
    <div class="container">
        <div class="col-md-12">
            <h4>公告管理</h4>
        </div>
        <!-- main container -->
        <div class="main-container portfolio-inner clearfix">
            <!-- portfolio div -->
            <div class="portfolio-div">
                <div class="portfolio">
                    <!-- portfolio_container -->
                    <div class="no-padding portfolio_container clearfix" data-aos="fade-up">
                        <!-- single work -->
                        <c:forEach items="${information}" var="info">
                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a  href="${pageContext.request.contextPath}/informationById?id=${info.id}"
                                             class="portfolio_item">
                                <img src="${info.pic}" alt="image" class="img-responsive"/>
                                <div class="portfolio_item_hover" >
                                    <div class="portfolio-border clearfix">
                                        <div class="item_info"><span>${info.title}</span></div>
                                    </div>
                                </div>
                            </a>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<!-- jQuery -->
<%--<script src="/information/js/jquery.js"></script>
<!--  plugins  -->
<script src="/information/js/bootstrap.min.js"></script>
<script src="/information/js/plugins.js"></script>
<script src="/information/js/aos.js"></script>
<script src="/information/js/jquery.form.js"></script>
<script src="/information/js/jquery.validate.min.js"></script>--%>


<!--  main script  -->
<script src="${pageContext.request.contextPath}/information/js/custom.js"></script>
</body>

</html>