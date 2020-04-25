<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>工资展示</title>
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
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 工资管理 <span class="c-gray en">&gt;</span> 工资信息 <span
        class="c-gray en">&gt;</span> 信息 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                            href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c">

    </div>
    <div class="section" id="projects">
        <div class="container">
            <div class="col-md-12">
                <h4>每月工资展示</h4>
            </div>

            <div class="main-container portfolio-inner clearfix">
                <!-- portfolio div -->
                <div class="portfolio-div">
                    <div class="portfolio">
                        <!-- portfolio_container -->
                        <div class="no-padding portfolio_container clearfix" data-aos="fade-up">
                            <!-- single work -->

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=1"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">1月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=2"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal2.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">2月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=3"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal3.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">3月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=4"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal4.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">4月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=5"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal5.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">5月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=6"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal6.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">6月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>


                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=7"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal7.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">7月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=8"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal8.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">8月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=9"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal9.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">9月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>


                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=10"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal10.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">10月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=11"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal11.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">11月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>

                            <div class="col-md-4 col-sm-6  fashion logo">
                                <a href="${pageContext.request.contextPath}/show?uid=${sessionScope.user.id}&mid=12"
                                   class="portfolio_item">
                                    <img src="/information/img/portfolio/cal12.jpg" alt="image" class="img-responsive"/>
                                    <div class="portfolio_item_hover">
                                        <div class="portfolio-border clearfix">
                                            <div class="item_info"><span style="font-size: 60px">12月工资</span></div>
                                        </div>
                                    </div>
                                </a>
                            </div>


                        </div>
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