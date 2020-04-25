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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 考勤管理 <span class="c-gray en">&gt;</span> 服务信息 <span
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
                        <h4>个人信息</h4>
                        <div class="h-50"></div>
                    </div>

                    <div class="col-md-12">
                        <ul class="timeline">
                            <li class="timeline-event" data-aos="fade-up">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">姓名</p>
                                    <h3>${user.username}</h3>
                                </div>
                            </li>

                            <li class="timeline-event" data-aos="fade-up">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">昵称</p>
                                    <h3>${user.nickname}</h3>
                                </div>
                            </li>

                            <li class="timeline-event" data-aos="fade-up">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">民族</p>
                                    <h3>${user.nation}</h3>
                                </div>
                            </li>

                            <li class="timeline-event" data-aos="fade-up" data-aos-delay=".1">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">性别</p>
                                    <c:if test="${user.gender == 0}">
                                        <h4>未设置</h4>
                                    </c:if>
                                    <c:if test="${user.gender == 1}">
                                        <h4>男</h4>
                                    </c:if>
                                    <c:if test="${user.gender == 2}">
                                        <h4>女</h4>
                                    </c:if>
                                </div>
                            </li>

                            <li class="timeline-event" data-aos="fade-up" data-aos-delay=".2">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">年龄</p>
                                    <h4>${user.age}</h4>
                                </div>
                            </li>

                            <li class="timeline-event" data-aos="fade-up" data-aos-delay=".3">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">电话号</p>
                                    <h4>${user.phone}</h4>
                                </div>
                            </li>

                            <li class="timeline-event" data-aos="fade-up" data-aos-delay=".4">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">亲属电话号</p>
                                    <h4>${user.realationtele}</h4>
                                </div>
                            </li>

                            <li class="timeline-event" data-aos="fade-up" data-aos-delay=".5">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">身份证号码</p>
                                    <h4>${user.idcard}</h4>
                                </div>
                            </li>


                            <li class="timeline-event" data-aos="fade-up" data-aos-delay=".6">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">邮箱</p>
                                    <h4>${user.email}</h4>
                                </div>
                            </li>

                            <li class="timeline-event" data-aos="fade-up" data-aos-delay=".7">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">住址</p>
                                    <h4>${user.address}</h4>
                                </div>
                            </li>

                            <li class="timeline-event" data-aos="fade-up" data-aos-delay=".8">
                                <label class="timeline-event-icon"></label>
                                <div class="timeline-event-copy">
                                    <p class="timeline-event-thumbnail">工资卡号</p>
                                    <h4>${user.salarycard}</h4>
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