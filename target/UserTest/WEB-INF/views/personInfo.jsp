<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
    <script type="text/javascript" src="/lib/html5shiv.js"></script>
    <script type="text/javascript" src="/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="/static/h-ui/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css" href="/lib/Hui-iconfont/1.0.8/iconfont.css"/>
    <link rel="stylesheet" type="text/css" href="/static/h-ui.admin/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="/static/h-ui.admin/css/style.css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="/lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>图片列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 身份管理 <span class="c-gray en">&gt;</span> 身份信息 <span
        class="c-gray en">&gt;</span> 信息 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                            href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c">

    </div>
    <div style="width: 100%;height: 100px;"></div>
    <div align="left"
         style=" width: 500px;height: 420px; top: 0px;left: 0;right: 0;bottom: 0;margin: auto;border: 2px solid black;">
        <h1 style="margin-left: 177px;font-family: FangSong_GB2312 ">身份信息</h1>
        <p>
            <span style="margin-left: 10px"> 用户名：</span>
            <strong>${info.username}</strong>
        </p>

        <p>
            <span style="margin-left: 10px"> 昵称：</span>
            <strong>${info.nickname}</strong>
        </p>
        <p>
            <span style="margin-left: 10px"> 民族：</span>
            <strong>${info.nation}</strong>
        </p>
        <p>
            <span style="margin-left: 10px"> 性别：</span>
            <c:if test="${info.gender == 0}">
                <strong>未设置</strong>
            </c:if>
            <c:if test="${info.gender == 1}">
                <strong>男</strong>
            </c:if>
            <c:if test="${info.gender == 2}">
                <strong>女</strong>
            </c:if>

        </p>
        <p>
            <span style="margin-left: 10px"> 年龄：</span>
            <strong>${info.age}</strong>

        </p>
        <p>
            <span style="margin-left: 10px"> 身份证号码：</span>
            <strong>${info.idcard}</strong>

        </p>
        <c:if test="${info.role == 1}">
        <p>
            <span style="margin-left: 10px"> 工资卡号：</span>
            <strong>${info.salarycard}</strong>

        </p>
        </c:if>

        <p>
            <span style="margin-left: 10px"> 手机号码：</span>
            <strong>${info.phone}</strong>
        </p>
        <p>
            <span style="margin-left: 10px"> 亲属手机号码：</span>
            <strong>${info.realationtele}</strong>
        </p>
        <p>
            <span style="margin-left: 10px"> 地址：</span>
            <strong>${info.address}</strong>
        </p>
        <p>
            <span style="margin-left: 10px"> 邮箱：</span>
            <strong>${info.email}</strong>
        </p>
    </div>
</div>

    <!--_footer 作为公共模版分离出去-->
    <script type="text/javascript" src="/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="/lib/layer/2.4/layer.js"></script>
    <script type="text/javascript" src="/static/h-ui/js/H-ui.min.js"></script>
    <script type="text/javascript" src="/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

    <!--请在下方写此页面业务相关的脚本-->
    <script type="text/javascript" src="/lib/My97DatePicker/4.8/WdatePicker.js"></script>
    <script type="text/javascript" src="/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="/lib/laypage/1.2/laypage.js"></script>
    <script type="text/javascript">


    </script>
</body>
</html>