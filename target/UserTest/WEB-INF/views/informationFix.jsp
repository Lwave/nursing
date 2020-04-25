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
    <link rel="stylesheet" type="text/css" href="/information/statics/css/style.css"/>

    <title>公告管理</title>
</head>
<body>
<div class="page-container">
    <div class="text-c">

    </div>
    <div class="container">
        <div class="main">
            <div class="title">
                <h4>公告资讯</h4>
                <p>notice</p>
            </div>
            <ul>
                <%--    <li class="one">
                        <a href="#">
                            <img src="/information/statics/images/new-cont.jpg"/>
                            <div class="news-title">
                                <h5>公告资讯</h5>
                                <p>News information</p>
                                <i class="icon-news"></i>
                            </div>
                        </a>
                    </li>--%>
                <li class="two">
                    <c:forEach items="${information}" var="info" varStatus="aa">
                        <c:if test="${aa.count%2 == 0}">
                            <a href="${pageContext.request.contextPath}/informationById?id=${info.id}">
                                <div class="top">
                                    <h5>${info.title}</h5>
                                    <div class="p">
                                        <p>夕阳红养老院具体通知请点击查看...</p>
                                    </div>
                                    <img src="/information/statics/images/new-jiantou.jpg">
                                </div>
                                <div class="bottom">
                                    <h3>${info.createtimeStr.substring(8,10)}</h3>
                                    <span>${info.createtimeStr.substring(0,4)}.${info.createtimeStr.substring(5,7)}</span>
                                </div>
                            </a>
                        </c:if>
                    </c:forEach>
                </li>
                <li class="three">
                    <c:forEach items="${information}" var="info" varStatus="aa">
                        <c:if test="${aa.count%2 == 1}">
                            <a href="${pageContext.request.contextPath}/informationById?id=${info.id}">
                                <div class="left">
                                    <h3>${info.createtimeStr.substring(8,10)}</h3>
                                    <span>${info.createtimeStr.substring(0,4)}.${info.createtimeStr.substring(5,7)}</span>
                                </div>
                                <div class="right">
                                    <h5> ${info.title}</h5>
                                    <img src="/information/statics/images/new-jiantou.jpg"/>
                                </div>
                            </a>
                        </c:if>
                    </c:forEach>
                </li>
            </ul>
        </div>

    </div>
</div>
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
            "aaSorting": [[1, "desc"]],//默认第几个排序
            "bStateSave": true,//状态保存
            "aoColumnDefs": [
                {"orderable": false, "aTargets": [0, 7]}// 制定列不参与排序
            ]
        });

        /*产品-添加*/
        function product_add(title, url) {
            var index = layer.open({
                type: 2,
                title: title,
                content: url
            });
            layer.full(index);
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
        function product_stop(obj, costid, dormId, bedid) {
            layer.confirm('您确认要取消预定吗？', function (index) {
                $.ajax({
                    type: 'POST',
                    url: '${pageContext.request.contextPath}/cancleOrder?costid=' + costid + '&dormId=' + dormId + '&bedid=' + bedid,
                    dataType: 'json',
                    success: function (data) {
                        if (data.success == '1') {
                            layer.msg('您已取消预定，欢迎下次再来订购啊！', {icon: 6, time: 2500});
                        }
                    }
                });
            });
        }

        /*产品-发布*/
        function product_start(obj, id) {
            layer.confirm('确认要预定吗？', function (index) {
                $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_stop(this,id)" href="javascript:;" title="预定"><i class="Hui-iconfont">&#xe6de;</i></a>');
                $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已预定</span>');
                $(obj).remove();
                layer.msg('已预定!', {icon: 6, time: 1500});
            });
        }

        /*产品-申请上线*/
        function product_shenqing(obj, id) {
            $(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
            $(obj).parents("tr").find(".td-manage").html("");
            layer.msg('已提交申请，耐心等待审核!', {icon: 1, time: 2000});
        }

        /*产品-编辑*/
        function product_edit(title, url, id) {
            var index = layer.open({
                type: 2,
                title: title,
                content: url
            });
            layer.full(index);
        }

        /*产品-删除*/
        function product_del(obj, id) {
            /* alert(id);*/
            layer.confirm('确认要删除吗？', function (index) {
                $.ajax({
                    type: 'POST',
                    url: '${pageContext.request.contextPath}/delBed?id=' + id,
                    dataType: 'json',
                    success: function (data) {
                        $(obj).parents("tr").remove();
                        layer.msg('已删除!', {icon: 1, time: 1500});
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
                    s += obj[i].value + ','; //如果选中，将value添加到变量s中
            }
            /* alert(s)*/
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

        /* function confirm(obj, id, bid) {
        layer.confirm('确认要缴费吗？', function (index) {
        $.ajax({
        /!* async: false,*!/
        url: "/updateStatus?id=" + id + "&bid=" + bid,
        datatype: "json",
        success: function (data) {
        if (data == "success") {
        /!*
        $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" href="javascript:;" title="申请上线"></a>');
        *!/
        $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已支付</span>');
        $(obj).remove();
        layer.msg('缴费成功！', {icon: 6, time: 1000});
        } else {
        /!* $(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" href="javascript:;" title="申请上线"></a>');*!/

        $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">未支付</span>');
        $(obj).remove();
        layer.msg('缴费失败！', {icon: 6, time: 1000});
        }

        }
        });
        });*/
        function confirm(obj, id, bid, c) {
            layer.confirm('确认要缴费吗？', function (index) {
                $.ajax({
                    /* async: false,*/
                    url: "/updateStatus?id=" + id + "&bid=" + bid,
                    datatype: "json",
                    success: function (data) {
                        if (data.success == '2') {
                            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已支付</span>');
                            layer.msg('缴费成功！', {icon: 6, time: 2500});
                        } else if (data.success == '3') {
                            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">未支付</span>');
                            $(obj).remove();
                            layer.msg('缴费失败！', {icon: 6, time: 2500});
                        } else if (data.success == '1') {
                            layer.msg('您已经完成缴费' + c + '元！不要重复缴费', {icon: 6, time: 2500});

                        }

                    }
                });
            });

        }
    </script>
</body>
</html>

</html>