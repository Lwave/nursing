<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="lib/html5shiv.js"></script>
    <script type="text/javascript" src="lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css"/>
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>夕阳红养老院管理系统</title>
</head>
<body>
<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl"><a class="logo navbar-logo f-l mr-10 hidden-xs">夕阳红养老院管理系统</a>
            <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="javascript:;"></a>
            <span class="logo navbar-slogan f-l mr-10 hidden-xs"></span>
            <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
            <c:if test="${sessionScope.ss != 0}">
            <nav class="nav navbar-nav">
                <ul class="cl">
                    <li class="dropDown dropDown_hover"><a href="javascript:;" class="dropDown_A"> 当前登陆时间 <i
                            class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;"><span id="time"></span></a>
                            </li>
                            <li  class="weather" pc>
                                <div id="tp-weather-widget"></div>
                                <script>(function(T,h,i,n,k,P,a,g,e){g=function(){P=h.createElement(i);a=h.getElementsByTagName(i)[0];P.src=k;P.charset="utf-8";P.async=1;a.parentNode.insertBefore(P,a)};T["ThinkPageWeatherWidgetObject"]=n;T[n]||(T[n]=function(){(T[n].q=T[n].q||[]).push(arguments)});T[n].l=+new Date();if(T.attachEvent){T.attachEvent("onload",g)}else{T.addEventListener("load",g,false)}}(window,document,"script","tpwidget","//widget.seniverse.com/widget/chameleon.js"))</script>
                                <script>tpwidget("init", {
                                    "flavor": "slim",
                                    "location": "WX4FBXXFKE4F",
                                    "geolocation": "enabled",
                                    "language": "zh-chs",
                                    "unit": "c",
                                    "theme": "chameleon",
                                    "container": "tp-weather-widget",
                                    "bubble": "disabled",
                                    "alarmType": "badge",
                                    "color": "#312738",
                                    "uid": "U9EC08A15F",
                                    "hash": "039da28f5581f4bcb5c799fb4cdfb673"
                                });
                                tpwidget("show");</script>
                            </li>
                        </ul>
                </ul>
            </nav>
            </c:if>

            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <c:if test="${sessionScope.user.role == 1}">
                        <li style="width: 80px">欢迎光临</li>
                    </c:if>
                    <c:if test="${sessionScope.user.role == 2}">
                        <li style="width: 80px">欢迎光临</li>
                    </c:if>
                    <c:if test="${sessionScope.user.role == 6}">
                        <li style="width: 80px">欢迎光临</li>
                    </c:if>
                    <c:choose>
                        <c:when test="${sessionScope.ss == 0}">
                            <li class="dropDown dropDown_hover" style="width: 80px"><a href="/loginn">注册</a></li>
                        </c:when>
                        <c:otherwise>
                            <li class="dropDown dropDown_hover">
                                <a href="#" class="dropDown_A">${sessionScope.user.username}<i class="Hui-iconfont">&#xe6d5;</i></a>
                                <ul class="dropDown-menu menu radius box-shadow">
                                    <li><a href="javascript:;"
                                           onclick="admin_edit('个人信息编辑','/admin-editt',${sessionScope.user.id},'690','470')">个人信息</a>
                                    </li>
                                    <li><a href="/login">退出</a></li>
                                </ul>
                            </li>
                        </c:otherwise>
                    </c:choose>
                    <li id="Hui-skin" class="dropDown right dropDown_hover"><a href="javascript:;" class="dropDown_A"
                                                                               title="换肤"><i class="Hui-iconfont"
                                                                                             style="font-size:18px">&#xe62a;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                            <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
                            <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                            <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                            <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                            <li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<aside class="Hui-aside">
    <div class="menu_dropdown bk_2">

        <c:if test="${sessionScope.user.role == 2 ||sessionScope.user.role == 3||sessionScope.user.role == 1}">
            <dl id="menu-picture">
                <dt><i class="Hui-iconfont">&#xe613;</i> 个人信息展示模块<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>

                            <li><a data-href="${pageContext.request.contextPath}/personInfo" data-title="个人信息"
                                   href="javascript:void(0)">个人信息</a></li>

                    </ul>
                </dd>
            </dl>
        </c:if>
        <c:if test="${sessionScope.user.role == 1}">
        <dl id="menu-comments">
            <dt><i class="Hui-iconfont">&#xe622;</i> 公告管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                        <li>
                            <a data-href="${pageContext.request.contextPath}/inforList" data-title="公告列表"
                               href="javascript:;">公告列表</a>
                        </li>
                    <c:if test="${sessionScope.user.role != 1}">
                        <li><a data-href="${pageContext.request.contextPath}/informationFix" data-title="公告资讯"
                               href="javascript:;">公告资讯</a>
                        </li>
                    </c:if>
                </ul>
            </dd>
        </dl>
        </c:if>
        <c:if test="${sessionScope.user.role != 1}">
            <dl id="menu-comments">
                <dt><i class="Hui-iconfont">&#xe622;</i> 公告信息展示模块<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
                <dd>
                    <ul>
                            <li><a data-href="${pageContext.request.contextPath}/informationFix" data-title="公告资讯"
                                   href="javascript:;">公告资讯</a>
                            </li>
                    </ul>
                </dd>
            </dl>
        </c:if>


        <c:if test="${sessionScope.user.role == 1}">
        <dl id="menu-picture">
            <dt><i class="Hui-iconfont">&#xe613;</i> 床位管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
            </dt>
            <dd>
                <ul>
                        <li><a data-href="${pageContext.request.contextPath}/changeBed" data-title="用户预定床位"
                               href="javascript:void(0)">床位信息管理</a>
                        </li>

                </ul>
            </dd>
        </dl>
    </c:if>

        <c:if test="${sessionScope.user.role == 2 || sessionScope.user.role == 3 ||sessionScope.ss == 0}">
            <dl id="menu-picture">
                <dt><i class="Hui-iconfont">&#xe613;</i> 用户预定床位模块<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                            <li><a data-href="${pageContext.request.contextPath}/bedInfo" data-title="床位信息"
                                   href="javascript:void(0)">用户预定床位</a></li>
                    </ul>
                </dd>
            </dl>
        </c:if>

        <c:if test="${sessionScope.user.role == 2 || sessionScope.user.role == 3}">
            <dl id="menu-product">
                <dt><i class="Hui-iconfont">&#xe620;</i> 费用展示模块<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                        <li><a data-href="${pageContext.request.contextPath}/CostUserCissify" data-title="缴费信息"
                               href="javascript:void(0)">缴费信息</a></li>
                            <%--  <li><a data-href="product-category.html" data-title="分类管理" href="javascript:void(0)">分类管理</a></li>
                              <li><a data-href="product-list.html" data-title="产品管理" href="javascript:void(0)">产品管理</a></li>--%>
                    </ul>
                </dd>
            </dl>
        </c:if>
        <c:if test="${sessionScope.user.role == 1}">
            <dl id="menu-product">
                <dt><i class="Hui-iconfont">&#xe620;</i> 费用管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                        <li><a data-href="${pageContext.request.contextPath}/CostUserAll" data-title="费用信息"
                               href="javascript:void(0)">费用信息</a></li>
                            <%--  <li><a data-href="product-category.html" data-title="分类管理" href="javascript:void(0)">分类管理</a></li>
                              <li><a data-href="product-list.html" data-title="产品管理" href="javascript:void(0)">产品管理</a></li>--%>
                    </ul>
                </dd>
            </dl>
        </c:if>
        <c:if test="${sessionScope.user.role == 6}">
            <dl id="menu-product">
                <dt><i class="Hui-iconfont">&#xe620;</i> 用户信息展示模块<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                        <li><a data-href="/elderly-list-is" data-title="用户展示信息" href="javascript:void(0)">用户信息</a></li>
                            <%--
                                                    <li><a data-href="/ouster-list-is" data-title="注册游客" href="javascript:void(0)">注册游客</a></li>
                            --%>
                    </ul>
                </dd>
            </dl>
        </c:if>
        <c:if test="${sessionScope.user.role == 1}">
            <dl id="menu-product">
                <dt><i class="Hui-iconfont">&#xe620;</i> 用户管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                        <li><a data-href="/elderly-list-is" data-title="用户信息" href="javascript:void(0)">用户信息</a></li>
                            <%--
                                                    <li><a data-href="/ouster-list-is" data-title="注册游客" href="javascript:void(0)">注册游客</a></li>
                            --%>
                    </ul>
                </dd>
            </dl>
        </c:if>
        <c:if test="${sessionScope.user.role == 1}">
            <dl id="menu-comments">
                <dt><i class="Hui-iconfont">&#xe622;</i> 健康信息管理<i
                        class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
                <dd>
                    <ul>
                            <li><a data-href="/bodyInfo-list" data-title="身体健康信息管理"
                                   href="javascript:void(0)">身体健康维护信息</a></li>
                    </ul>
                </dd>
            </dl>
        </c:if>

        <c:if test="${sessionScope.user.role == 2}">
            <dl id="menu-comments">
                <dt><i class="Hui-iconfont">&#xe622;</i> 身体健康信息维护模块<i
                        class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
                <dd>
                    <ul>
                            <li><a data-href="/bodyInfo" data-title="身体健康信息" href="javascript:;">身体健康信息</a></li>
                    </ul>
                </dd>
            </dl>
        </c:if>

        <c:if test="${sessionScope.user.role == 1}">
            <dl id="menu-admin">
                <dt><i class="Hui-iconfont">&#xe62d;</i> 人事管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                            <li><a data-href="/employeeInfo" data-title="员工信息管理" href="javascript:void(0)">员工信息管理</a></li>


                            <li><a data-href="/employeeService" data-title="员工考勤管理" href="javascript:void(0)">员工考勤管理</a>
                            </li>

                    </ul>
                </dd>
            </dl>
        </c:if>

        <c:if test="${sessionScope.user.role == 6}">
            <dl id="menu-admin">
                <dt><i class="Hui-iconfont">&#xe62d;</i> 人事信息展示模块<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                            <li><a data-href="/singleInfo" data-title="个人信息" href="javascript:void(0)">个人信息</a></li>

                            <li><a data-href="/singleClass" data-title="考勤信息" href="javascript:void(0)">考勤信息</a></li>

                    </ul>
                </dd>
            </dl>
        </c:if>

        <c:if test="${sessionScope.user.role == 1}">
            <dl id="menu-admin">
                <dt><i class="Hui-iconfont">&#xe62d;</i> 工资管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                            <li><a data-href="/getAllSalary" data-title="员工工资管理"
                                   href="javascript:void(0)">员工工资管理</a></li>
                    </ul>
                </dd>
            </dl>
        </c:if>

        <c:if test="${sessionScope.user.role == 6}">
            <dl id="menu-admin">
                <dt><i class="Hui-iconfont">&#xe62d;</i> 工资信息展示模块<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>

                            <li><a data-href="/getUserMonthSingle" data-title="个人工资信息"
                                   href="javascript:void(0)">个人工资信息</a></li>

                    </ul>
                </dd>
            </dl>
        </c:if>


        <c:if test="${sessionScope.user.role == 1}">
            <dl id="menu-admin">
                <dt><i class="Hui-iconfont">&#xe62d;</i> 管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                            <%--<li><a data-href="admin-role.html" data-title="角色管理" href="javascript:void(0)">角色管理</a></li>
                            <li><a data-href="admin-permission.html" data-title="权限管理" href="javascript:void(0)">权限管理</a></li>--%>
                        <li><a data-href="/admin-list" data-title="管理员列表" href="javascript:void(0)">管理员列表</a></li>
                    </ul>
                </dd>
            </dl>
        </c:if>
        <c:if test="${sessionScope.user.role == 1}">
            <dl id="menu-tongji">
                <dt><i class="Hui-iconfont">&#xe61a;</i> 系统统计<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
                </dt>
                <dd>
                    <ul>
                        <li><a data-href="/pieChart" data-title="饼状图" href="javascript:void(0)">饼状图</a></li>
                    </ul>
                </dd>
            </dl>
        </c:if>
    </div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a>
</div>
<section class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active">
                    <span title="我的桌面" data-href="welcome.html">我的桌面</span>
                    <em></em></li>
            </ul>
        </div>
        <div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S"
                                                  href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a
                id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a>
        </div>
    </div>
    <div id="iframe_box" class="Hui-article">
        <div class="show_iframe">
            <div style="display:none" class="loading"></div>
            <iframe scrolling="yes" frameborder="0" src="welcome.html"></iframe>
        </div>
    </div>
</section>

<div class="contextMenu" id="Huiadminmenu">
    <ul>
        <li id="closethis">关闭当前</li>
        <li id="closeall">关闭全部</li>
    </ul>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
<script type="text/javascript">
    //获取当前时间
    setInterval(function () {
        document.getElementById("time").innerHTML = new Date().toLocaleString();
    }, 1000)
    $(function () {
        /*$("#min_title_list li").contextMenu('Huiadminmenu', {
            bindings: {
                'closethis': function(t) {
                    console.log(t);
                    if(t.find("i")){
                        t.find("i").trigger("click");
                    }
                },
                'closeall': function(t) {
                    alert('Trigger was '+t.id+'\nAction was Email');
                },
            }
        });*/
    });
    /*个人信息*/
    /*管理员-编辑*/
    function admin_edit(title, url, id, w, h) {
        layer_show(title, url + "?id=" + id, w, h);
    }

    /* function myselfinfo(){
         layer.open({
             type: 1,
             area: ['300px','200px'],
             fix: false, //不固定
             maxmin: true,
             shade:0.4,
             title: '查看信息',
             content: '<div>管理员信息</div>'
         });
     }*/

    /*资讯-添加*/
    function article_add(title, url) {
        layer_show(title, url, w, h);
        ;
    }

    /*图片-添加*/
    function picture_add(title, url) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*产品-添加*/
    function product_add(title, url) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*用户-添加*/
    function member_add(title, url, w, h) {
        layer_show(title, url, w, h);
    }


</script>

<!--此乃百度统计代码，请自行删除-->
<script>
    var _hmt = _hmt || [];
    (function () {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
<!--/此乃百度统计代码，请自行删除-->
</body>
</html>