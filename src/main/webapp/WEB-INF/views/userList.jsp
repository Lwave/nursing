<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="/lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>用户管理</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span
        class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                              href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c"> 日期范围：
        <input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin"
               class="input-text Wdate" style="width:120px;">
        -
        <input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax"
               class="input-text Wdate" style="width:120px;">
        <input type="text" class="input-text" style="width:250px" placeholder="输入会员名称、电话、邮箱" id="" name="">
        <button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户
        </button>
    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20"><span class="l"><a href="javascript:;" onclick="datadel()"
                                                               class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <a
            href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')"
            class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a></span> <span
            class="r">共有数据：<strong>88</strong> 条</span></div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-hover table-bg table-sort">
            <thead>
            <tr class="text-c">
                <th width="25"><input type="checkbox" name="checkbox" value=""></th>
                <th width="80">ID</th>
                <th width="100">用户名</th>
                <th width="100">密码</th>
                <th width="40">性别</th>
              <%--  <th width="90">年龄</th>--%>
                <th width="150">电话</th>
                <th width="">生日</th>
                <th width="130">创建时间</th>
                <th width="70">角色</th>
                <th width="100">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${user}" var="user">
                <tr class="text-c">
                    <td><input type="checkbox" value="1" name="input"></td>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.genderStr}</td>
                    <td>${user.age}</td>
                    <td>${user.phone}</td>
                   <%-- <td>${user.birthdayStr}</td>--%>
                    <td><fmt:formatDate value="${user.createdate}" pattern="yyyy-MM-dd"/></td>
                    <td class="user-status"><span class="label label-success">${user.roleStr}</span></td>
                    <td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')"
                                             href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a
                            title="编辑" href="javascript:;" onclick="member_edit('编辑','member-add.html','4','','510')"
                            class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a
                            style="text-decoration:none" class="ml-5"
                            onClick="change_password('修改密码','change-password.html','10001','600','270')"
                            href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> <a title="删除"
                                                                                                         href="javascript:;"
                                                                                                         onclick="member_del(this,'1')" class="ml-5"
                                                                                                         style="text-decoration:none"><i
                            class="Hui-iconfont">&#xe6e2;</i></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div id="pageNav" class="pageNav"></div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    window.onload = (function () {
        // optional set
        pageNav.pre = "&lt;上一页";
        pageNav.next = "下一页&gt;";
        // p,当前页码,pn,总页面
        pageNav.fn = function (p, pn) {
            $("#pageinfo").text("当前页:" + p + " 总页: " + pn);
        };
        //重写分页状态,跳到第三页,总页33页
        pageNav.go(1, 13);
    });
    $('.table-sort').dataTable({
        "lengthMenu": false,//显示数量选择
        "bFilter": false,//过滤功能
        "bPaginate": false,//翻页信息
        "bInfo": false,//数量信息
        "aaSorting": [[1, "desc"]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable": false, "aTargets": [0, 8, 9]}// 制定列不参与排序
        ]
    });

    //保存数据
    $("#saveBtn").click(function () {
        $("#editForm").form("submit", {
            //url:提交到后台的地址
            url: "customer/save",
            //onsubmit：表单提交前的回调函数，true,提交表单 false：不提交表单
            onSubmit: function () {
                //判断表单是否通过
                return $("#editForm").form("validate");
            },
            //服务器执行完毕的回调函数
            success: function (data) {//data：服务器返回的数据，类型字符串类
                //要求Controller返回的数据格式
                //成功：{success:true}  失败：{success:false,msg:错误信息}

                //把data字符串转换对象类型
                data = eval("(" + data + ")");
                if (data.success) {
                    //关闭窗口
                    $("#win").window("close");
                    //刷新datagrid
                    $("#list").datagrid("reload");
                    $.messager.alert("提示", "保存成功", "info");

                } else {
                    $.messager.alert("提示", "保存失败:" + data.msg, "error");

                }
            }
        });
    });
</script>
</body>
</html>

