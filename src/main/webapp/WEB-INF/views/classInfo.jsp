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
    <title>服务列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 服务管理 <span class="c-gray en">&gt;</span> 服务信息 <span
        class="c-gray en">&gt;</span> 信息 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px"
                                            href="javascript:location.replace(location.href);" title="刷新"><i
        class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
    <div class="text-c">

    </div>
    <div class="cl pd-5 bg-1 bk-gray mt-20"><span class="l"><a href="javascript:;" onclick="datadel()"
                                                               class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>  <a class="btn btn-primary radius" onclick="product_add('添加信息','/addClass','750','450')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加信息</a></span><span class="r">共有数据：<strong
            style="color: #5bc0de;">${cc.size()}</strong> 条</span>
    </div>

    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort">
            <thead>
            <tr class="text-c">
                <th width="40"><input name="id" type="checkbox" value="id"></th>
                <th width="60">编号</th>
                <th width="60">员工姓名</th>
                <th width="60">职务</th>
                <th width="80">班系名称</th>
                <th width="40">班系信息</th>
                <th width="40">班系时长</th>
                <th width="60">考勤</th>
                <th width="60">服务老人</th>
                <th width="100">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cc}" var="c" varStatus="in">
                <tr class="text-c">
                    <td><input name="delete" type="checkbox" value="${c.id}"></td>
                    <td>${in.count}</td>
                    <td>${c.head}</td>
                    <td>${c.position}</td>
                    <td>${c.classname}</td>
                    <td>${c.classinfo}</td>
                    <td>${c.classhour}</td>
                    <td class="text-c">${c.situation}</td>
                    <td class="text-c">${c.respname}</td>
                    <td class="td-manage">
                        <a
                            style="text-decoration:none" class="ml-5"
                            onClick="product_edit('状态编辑','${pageContext.request.contextPath}/editClass',${c.id},'750','600')"
                            href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
                        <a
                            style="text-decoration:none" class="ml-5" onClick="product_del(this,${c.id})"
                            href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
                    </td>
                </tr>
            </c:forEach>


            </tbody>
        </table>
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


    $('.table-sort').dataTable({
        /*"aaSorting": [[1, "desc"]],//默认第几个排序*/
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
           /* {"orderable": false, "aTargets": [0, 7]}// 制定列不参与排序*/
        ]
    });

    /*产品-添加*/
    function product_add(title, url,w,h) {
        layer_show(title, url, w, h);
    }

    /*产品-查看*/
    function product_show(title, url, id) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*产品-审核*/
    function product_shenhe(obj, id) {
        layer.confirm('审核文章？', {
                btn: ['通过', '不通过'],
                shade: false
            },
            function () {
                $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="product_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
                $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
                $(obj).remove();
                layer.msg('已发布', {icon: 6, time: 1000});
            },
            function () {
                $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="product_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
                $(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
                $(obj).remove();
                layer.msg('未通过', {icon: 5, time: 1000});
            });
    }

    /*产品-下架*/
    function product_stop(obj, id) {
        layer.confirm('确认要入住吗？', function (index) {
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_start(this,id)" href="javascript:;" title="入住"><i class="Hui-iconfont">&#xe603;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已入住</span>');
            $(obj).remove();
            layer.msg('已入住!', {icon: 5, time: 1000});
        });
    }

    /*产品-发布*/
    function product_start(obj, id) {
        layer.confirm('确认要预定吗？', function (index) {
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_stop(this,id)" href="javascript:;" title="预定"><i class="Hui-iconfont">&#xe6de;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已预定</span>');
            $(obj).remove();
            layer.msg('已预定!', {icon: 6, time: 1000});
        });
    }

    /*产品-申请上线*/
    function product_shenqing(obj, id) {
        $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
        $(obj).parents("tr").find(".td-manage").html("");
        layer.msg('已提交申请，耐心等待审核!', {icon: 1, time: 2000});
    }

    /*产品-编辑*/
    function product_edit(title, url, id,w,h) {
        layer_show(title, url+'?id='+id, w, h);
    }

    /*产品-删除*/
    function product_del(obj, id) {
        /* alert(id);*/
        layer.confirm('确认要删除吗？', function (index) {
            $.ajax({
                type: 'POST',
                url: '${pageContext.request.contextPath}/delClass?id=' + id,
                dataType: 'json',
                success: function (data) {
                    if (data.success == '1') {
                        $(obj).parents("tr").remove();
                        layer.msg('已删除!', {icon: 1, time: 2000});
                    }
                },
                error: function (data) {
                    console.log(data.msg);
                },
            });
        });
    }

    /*批量删除*/
    function datadel() {
        var obj = document.getElementsByName("delete");//选择所有name="delete"的对象，返回数组
        var s = '';//如果这样定义var s;变量s中会默认被赋个null值
        for (var i = 0; i < obj.length; i++) {
            if (obj[i].checked) //取到对象数组后，我们来循环检测它是不是被选中
                s += obj[i].value + ',';   //如果选中，将value添加到变量s中
        }
        /*     alert(s)*/
        if (s == '') {
            $.Huimodalalert('您目前未选取用户！', 1500);
        } else {
            layer.confirm('确认要删除吗？', function (index) {
                $.ajax({
                    async: false,
                    type: 'GET',
                    url: '/batchDelBed?bedId=' + s,
                    success: function (data) {
                        if (data == "success") {
                            layer.msg('已删除!', {icon: 1, time: 1000});
                            //$.Huimodalalert('删除成功!',1000);
                            setTimeout(function () {
                                location.reload();
                            }, 1010)
                        }
                    },
                    error: function (data) {
                        console.log(data.msg);
                        alert(data);
                        alert("状态码是" + XMLHttpRequest.readyState);
                    },
                });
            });
        }
    }
</script>
</body>
</html>