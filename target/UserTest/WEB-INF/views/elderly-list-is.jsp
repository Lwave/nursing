<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>注册老人列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 注册老人管理 <span class="c-gray en">&gt;</span> 注册老人列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> <%--<a href="javascript:;" onclick="admin_add('添加老人','/elderly-add','770','500')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加老人</a>--%> <span> </span><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span><a href="/export" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe634;</i> 导出为Excel</a></span> <span class="r">共有数据：<strong>${userByRole.size()}</strong> 条</span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
				<tr class="text-c">
					<th width="20"><input type="checkbox" name="" value=""></th>
					<th width="25">ID</th>
					<th width="120">登录名</th>
                    <th width="120">昵称</th>
                    <th width="100">民族</th>
                    <th width="200">身份证</th>
                    <th width="200">地址</th>
					<th width="65">性别</th>
					<th width="150">手机</th>
                    <th width="150">亲属手机号</th>
					<th width="150">邮箱</th>
					<th width="60">年龄</th>
					<th width="135">加入时间</th>
                    <th width="100">状态</th>
                    <th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${userByRole}" var="elderly" varStatus="ss">
				<tr class="text-c">
					<td><input type="checkbox" value="${elderly.id}" name="delete"></td>
					<td>${ss.count}</td>
                    <td>${elderly.username}</td>
                    <td>${elderly.nickname}</td>
                    <td>${elderly.nation}</td>
                    <td>${elderly.idcard}</td>
                    <td>${elderly.address}</td>
					<td>
						<c:if test="${elderly.gender == 0}">未设置</c:if>
						<c:if test="${elderly.gender == 1}">男</c:if>
						<c:if test="${elderly.gender == 2}">女</c:if>
					</td>
					<td>${elderly.phone}</td>
                    <td>${elderly.realationtele}</td>
					<td>${elderly.email}</td>
                    <td>${elderly.age}</td>
					<td><fmt:formatDate value="${elderly.createdate}" pattern="yyyy-MM-dd"/></td>
                    <c:if test="${elderly.role == 2}"><td class="td-status"><span class="label label-success radius">登录中</span></td></c:if>
					<c:if test="${elderly.role == 3}"><td class="td-status"><span class="label label-success radius">未登录</span></td></c:if>
                    <c:if test="${sessionScope.user.role != 6}"><td class="td-manage"><a title="编辑" href="javascript:;" onclick="admin_edit('用户编辑','/user-edit',${elderly.id},'750','450')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a title="删除" href="javascript:;" onclick="admin_del(this,${elderly.id})" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td></c:if>
                    <c:if test="${sessionScope.user.role == 6}"><td class="td-manage">无权限</td></c:if>

                </tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
	$(function(){
		$('.table-sort').dataTable({
			"aaSorting": [
				[
					1, "desc"
				]
			],//默认第几个排序
			"bStateSave": true,//状态保存
			"aoColumnDefs": [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{"orderable":false,"aTargets":[0]}// 制定列不参与排序
			]
		});

	});
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*管理员-增加*/
function admin_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-删除*/
function admin_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			async : false,
			type: 'POST',
			url: '/delElderly?id='+id,
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});
	});
}

	/*批量删除*/
	function datadel() {
		var obj = document.getElementsByName("delete");//选择所有name="delete"的对象，返回数组
		var s='';//如果这样定义var s;变量s中会默认被赋个null值
		for(var i=0;i<obj.length;i++){
			if(obj[i].checked) //取到对象数组后，我们来循环检测它是不是被选中
				s+=obj[i].value+',';   //如果选中，将value添加到变量s中
		}
		if(s == ''){
			$.Huimodalalert('您目前未选取用户！',1500);
		}else {
			layer.confirm('确认要删除吗？',function(index){
				$.ajax({
					async: false,
					type: 'GET',
					url: '/batchDelUser?elderlyIds='+s,
					success: function(data){
						if(data=="success"){
							layer.msg('已删除!',{icon:1,time:1000});
							//$.Huimodalalert('删除成功!',1000);
							setTimeout(function(){
								location.reload();
							},1010)
						}
					},
					error:function(data) {
						console.log(data.msg);
						alert(data);
						alert("状态码是"+XMLHttpRequest.readyState);
					},
				});
			});
		}
	}


/*管理员-编辑*/
function admin_edit(title,url,id,w,h){
	layer_show(title,url+"?id="+id,w,h);
}

/*管理员-停用*/
/*function admin_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……

		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_start(this,id)" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont">&#xe615;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已禁用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}*/

/*管理员-启用*/
function admin_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……


		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,id)" href="javascript:;" title="停用" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!', {icon: 6,time:1000});
	});
}
</script>
</body>
</html>