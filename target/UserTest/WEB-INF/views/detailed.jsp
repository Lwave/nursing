<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
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
<title>注册老人编辑</title>
	<style>
		.page-container{
			padding-left: 70px;
		}
		.body{
			font-size: 17px;
		}
		p{
			padding-left: 20px;
		}
	</style>
</head>
<body>
<article class="page-container">
	<form class="form form-horizontal" id="form-admin-add">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>用户名：</label>
		<%--<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${allById.username}" placeholder="" id="adminName" name="username">
		</div>--%>
		<div class="formControls col-xs-8 col-sm-9">
			<p>${allById.username}</p>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>体重区间：</label>
		<c:if test="${fn:contains(allById.weight,'0')}">
			<div class="formControls col-xs-8 col-sm-9">
				<p>40kg以下</p>
			</div>
		</c:if>
		<c:if test="${fn:contains(allById.weight,'1' )}">
			<div class="formControls col-xs-8 col-sm-9">
				<p>40kg-50kg</p>
			</div>
		</c:if>
		<c:if test="${fn:contains(allById.weight,'2' )}">
			<div class="formControls col-xs-8 col-sm-9">
				<p>50kg-60kg</p>
			</div>
		</c:if>
		<c:if test="${fn:contains(allById.weight,'3' )}">
			<div class="formControls col-xs-8 col-sm-9">
				<p>60kg-70kg</p>
			</div>
		</c:if>
		<c:if test="${fn:contains(allById.weight,'4' )}">
			<div class="formControls col-xs-8 col-sm-9">
				<p>70kg-80kg</p>
			</div>
		</c:if>
		<c:if test="${fn:contains(allById.weight,'5' )}">
			<div class="formControls col-xs-8 col-sm-9">
				<p>80kg以上</p>
			</div>
		</c:if>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>身体冰凉情况：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<c:if test="${fn:contains(allById.cold,'1' )}">
				<p>手脚经常冰凉</p>
			</c:if>
			<c:if test="${fn:contains(allById.cold,'2' )}">
				<p>腹部经常冰凉</p>
			</c:if>
			<c:if test="${fn:contains(allById.cold,'3' )}">
				<p>腰部经常冰凉</p>
			</c:if>
			<c:if test="${fn:contains(allById.cold,'4' )}">
				<p>其他部位冰凉</p>
			</c:if>
			<c:if test="${fn:contains(allById.cold,'5' )}">
				<p>无此现象</p>
			</c:if>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>身体关注情况：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<c:if test="${fn:contains(allById.bodyattent,'1' )}">
				<p>心脑血管</p>
			</c:if>
			<c:if test="${fn:contains(allById.bodyattent,'2' )}">
				<p>肠胃功能</p>
			</c:if>
			<c:if test="${fn:contains(allById.bodyattent,'3' )}">
				<p>呼吸系统</p>
			</c:if>
			<c:if test="${fn:contains(allById.bodyattent,'4' )}">
				<p>肌肉骨骼</p>
			</c:if>
			<c:if test="${fn:contains(allById.bodyattent,'5' )}">
				<p>男科</p>
			</c:if>
			<c:if test="${fn:contains(allById.bodyattent,'6' )}">
				<p>营养状态</p>
			</c:if>
			<c:if test="${fn:contains(allById.bodyattent,'7' )}">
				<p>免疫功能</p>
			</c:if>
			<c:if test="${fn:contains(allById.bodyattent,'8' )}">
				<p>肝胆功能</p>
			</c:if>
			<c:if test="${fn:contains(allById.bodyattent,'9' )}">
				<p>妇科</p>
			</c:if>
			<c:if test="${fn:contains(allById.bodyattent,'10' )}">
				<p>皮肤/内分泌</p>
			</c:if>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>慢性疾病：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<c:if test="${fn:contains(allById.chronic,'1' )}">
				<p>高血压</p>
			</c:if>
			<c:if test="${fn:contains(allById.chronic,'2' )}">
				<p>高血糖</p>
			</c:if>
			<c:if test="${fn:contains(allById.chronic,'3' )}">
				<p>高血脂</p>
			</c:if>
			<c:if test="${fn:contains(allById.chronic,'4' )}">
				<p>无慢性病</p>
			</c:if>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>小便情况：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<c:if test="${fn:contains(allById.urine,'1' )}">
				<p>量多色白</p>
			</c:if>
			<c:if test="${fn:contains(allById.urine,'2' )}">
				<p>量少色黄</p>
			</c:if>
			<c:if test="${fn:contains(allById.urine,'3' )}">
				<p>量多色黄</p>
			</c:if>
			<c:if test="${fn:contains(allById.urine,'4' )}">
				<p>淋漓不尽</p>
			</c:if>
			<c:if test="${fn:contains(allById.urine,'5' )}">
				<p>不便较频</p>
			</c:if>
			<c:if test="${fn:contains(allById.urine,'6' )}">
				<p>夜尿多其他补充(如前列腺炎)</p>
			</c:if>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>大便类型：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<c:if test="${fn:contains(allById.shit,'1' )}">
				<p>量多色白</p>
			</c:if>
			<c:if test="${fn:contains(allById.shit,'2' )}">
				<p>量少色黄</p>
			</c:if>
			<c:if test="${fn:contains(allById.shit,'3' )}">
				<p>量多色黄</p>
			</c:if>
			<c:if test="${fn:contains(allById.shit,'4' )}">
				<p>淋漓不尽</p>
			</c:if>
			<c:if test="${fn:contains(allById.shit,'5' )}">
				<p>不便较频</p>
			</c:if>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>近期症状：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<c:if test="${fn:contains(allById.symptom,'1' )}">
				<p>胃痛</p>
			</c:if>
			<c:if test="${fn:contains(allById.symptom,'2' )}">
				<p>腹泻</p>
			</c:if>
			<c:if test="${fn:contains(allById.symptom,'3' )}">
				<p>胃胀</p>
			</c:if>
			<c:if test="${fn:contains(allById.symptom,'4' )}">
				<p>头痛</p>
			</c:if>
			<c:if test="${fn:contains(allById.symptom,'5' )}">
				<p>咳嗽</p>
			</c:if>
			<c:if test="${fn:contains(allById.symptom,'6' )}">
				<p>感冒</p>
			</c:if>
			<c:if test="${fn:contains(allById.symptom,'7' )}">
				<p>咽喉痛</p>
			</c:if>
			<c:if test="${fn:contains(allById.symptom,'8' )}">
				<p>没有</p>
			</c:if>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>胸闷情况：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<c:if test="${fn:contains(allById.tightness,'1' )}">
				<p>没有</p>
			</c:if>
			<c:if test="${fn:contains(allById.tightness,'2' )}">
				<p>有,不严重</p>
			</c:if>
			<c:if test="${fn:contains(allById.tightness,'3' )}">
				<p>经常会</p>
			</c:if>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>既往病史：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<p>${allById.medhistory}</p>
		</div>
	</div>
	<%--<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">角色：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<span class="select-box" style="width:150px;">
			<select class="select" name="role" size="1">
				<option value="1">管理员</option>
				&lt;%&ndash;<option value="1">总编</option>&ndash;%&gt;
			</select>
			</span>
		</div>
	</div>--%>
		<input type="hidden" name="id" value="${userById.id}">
	<%--<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">备注：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<textarea name="" cols="" rows="" class="textarea"  placeholder="说点什么...100个字符以内" dragonfly="true" onKeyUp="$.Huitextarealength(this,100)"></textarea>
			<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
		</div>
	</div>--%>
	</form>
</article>

<!--_footer 作为公共模版分离出去--> 
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-admin-add").validate({
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
				async : false,
				type: 'get',
				url: "/seeDetailed",
				success: function(data){
					if(data == "success"){
						layer.msg('修改成功!',{icon:1,time:1000});
					}
					setTimeout(function(){
						var index = parent.layer.getFrameIndex(window.name);
						parent.$('.btn-refresh').click();
						parent.layer.close(index);
					},1200)

				},
                error: function(XmlHttpRequest, textStatus, errorThrown){
					layer.msg('error!',{icon:1,time:1000});
				}
			});

		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>