<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>公告管理</title>
    <script type="text/javascript" src="/lib/html5shiv.js"></script>
    <script type="text/javascript" src="/lib/respond.min.js"></script>
    <!-- Bootstrap -->
    <link href="/information/css/bootstrap.min.css" rel="stylesheet">
    <link href="/information/ionicons/css/ionicons.min.css" rel="stylesheet">
    <link href="/information/css/animate.min.css" rel="stylesheet">
    <link href="/information/css/aos.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/static/h-ui/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css" href="/lib/Hui-iconfont/1.0.8/iconfont.css"/>
    <link rel="stylesheet" type="text/css" href="/static/h-ui.admin/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/style.css"/>
    <script type="text/javascript" src="/lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <!-- main style -->
    <link href="/information/css/style.css" rel="stylesheet">
</head>

<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 服务管理 <span class="c-gray en">&gt;</span> 服务信息 <span
        class="c-gray en">&gt;</span> 信息 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                            href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c">

    </div>
<div class="section" id="projects">
    <div class="container">
        <div class="section" id="experience">
            <div class="container">
                <div class="col-md-12">
                    <h4>带你走进乐趣</h4>
                    <h1 class="size-50">My <br />Service </h1>
                    <div class="h-50"></div>
                </div>

                <div class="col-md-12">
                    <ul class="timeline">
                        <li class="timeline-event" data-aos="fade-up">
                            <label class="timeline-event-icon"></label>
                            <div class="timeline-event-copy">
                                <p class="timeline-event-thumbnail">员工姓名</p>
                                <h3>${singleClass.head}</h3>
                            </div>
                        </li>
                        <li class="timeline-event" data-aos="fade-up" data-aos-delay=".2">
                            <label class="timeline-event-icon"></label>
                            <div class="timeline-event-copy">
                                <p class="timeline-event-thumbnail">职务</p>
                                <h4>${singleClass.position}</h4>
                            </div>
                        </li>
                        <li class="timeline-event" data-aos="fade-up" data-aos-delay=".4">
                            <label class="timeline-event-icon"></label>
                            <div class="timeline-event-copy">
                                <p class="timeline-event-thumbnail">班系</p>
                                <h3>名称：${singleClass.classname}</h3>
                                <h3>信息：${singleClass.classinfo}</h3>
                                <h3>时长：${singleClass.classhour}h</h3>
                                <h3>考勤：${singleClass.situation}</h3>
                                <c:if test="${singleClass.uresp != 0}">
                                <h3>服务老人：${singleClass.respname}</h3>
                                <br>请严格遵守夕阳红养老院的规章制度，做到尽职尽责，为老人们带来乐趣！</p>
                                </c:if>
                                <c:if test="${singleClass.uresp == 0}">
                                    <h3>服务老人：无</h3>
                                    <br>请严格遵守夕阳红养老院的规章制度，做到尽职尽责，为老人们带来乐趣！</p>
                                </c:if>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<!-- jQuery -->
<script src="/information/js/jquery.js"></script>
<!--  plugins  -->
<script src="/information/js/bootstrap.min.js"></script>
<script src="/information/js/plugins.js"></script>
<script src="/information/js/aos.js"></script>
<script src="/information/js/jquery.form.js"></script>
<script src="/information/js/jquery.validate.min.js"></script>


<!--  main script  -->
<script src="/information/js/custom.js"></script>
</body>

</html>