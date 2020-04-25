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
<title>身体健康信息修改</title>

</head>
<body>
<div id="modal-demo" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content radius">
			<div class="modal-header">
				<h3 class="modal-title">温馨提示</h3>
				<a class="close" data-dismiss="modal" aria-hidden="true" href="javascript:void();">×</a>
			</div>
			<div class="modal-body">
				<p style="font-size: 20px">您已经填写过身体健康的有关信息！</p>
				<p style="font-size: 20px">您可以选择想要更新的信息进行填写！</p>
			</div>
			<div class="modal-footer">
				<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
			</div>
		</div>
	</div>
</div>

<div id="modal-demo1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content radius">
			<div class="modal-header">
				<h3 class="modal-title">温馨提示</h3>
				<a class="close" data-dismiss="modal" aria-hidden="true" href="javascript:void();">×</a>
			</div>
			<div class="modal-body">
				<p style="font-size: 20px">您还未填写过身体健康的有关信息！</p>
				<p style="font-size: 20px">请认真填写相关全部内容！</p>
			</div>
			<div class="modal-footer">
				<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
			</div>
		</div>
	</div>
</div>


<article class="page-container">
	<form class="form form-horizontal" id="form-admin-add">
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>用户名：</label>
		<%--<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${adminId.username}" placeholder="" id="adminName" name="username">
		</div>--%>
		<div class="formControls col-xs-8 col-sm-9">
			<p>${sessionScope.user.username}</p>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>您的体重区间：</label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<input name="weight" type="radio" id="weight-0" value="0">
				<label for="weight-0">40kg以下</label>
			</div>
			<div class="radio-box">
				<input name="weight" type="radio" id="weight-1" value="1">
				<label for="weight-1">40kg-50kg</label>
			</div>
			<div class="radio-box">
				<input type="radio" id="weight-2" name="weight" value="2">
				<label for="weight-2">50kg-60kg</label>
			</div>
			<div class="radio-box">
				<input type="radio" id="weight-3" name="weight" value="3">
				<label for="weight-3">60kg-70kg</label>
			</div>
			<div class="radio-box">
				<input type="radio" id="weight-4" name="weight" value="4">
				<label for="weight-4">70kg-80kg</label>
			</div>
			<div class="radio-box">
				<input type="radio" id="weight-5" name="weight" value="5">
				<label for="weight-5">80kg以上</label>
			</div>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>您身体的某些部位经常冰凉吗？<span>【多选题】</span></label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<input type="checkbox" id="cold-1" name="cold" value="1">
				<label for="cold-1">手脚经常冰凉</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="cold-2" name="cold" value="2">
				<label for="cold-2">腹部经常冰凉</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="cold-3" name="cold" value="3">
				<label for="cold-3">腰部经常冰凉</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="cold-4" name="cold" value="4">
				<label for="cold-4">其他部位冰凉</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="cold-5" name="cold" value="5">
				<label for="cold-5">无此现象</label>
			</div>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>您对身体的哪些状况关注最多？<span>【多选题】</span></label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-1" name="bodyattent" value="1">
				<label for="bodyattent-1">心脑血管</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-2" name="bodyattent" value="2">
				<label for="bodyattent-2">肠胃功能</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-3" name="bodyattent" value="3">
				<label for="bodyattent-3">呼吸系统</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-4" name="bodyattent" value="4">
				<label for="bodyattent-4">肌肉骨骼</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-5" name="bodyattent" value="5">
				<label for="bodyattent-5">男科</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-6" name="bodyattent" value="6">
				<label for="bodyattent-6">营养状态</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-7" name="bodyattent" value="7">
				<label for="bodyattent-7">免疫功能</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-8" name="bodyattent" value="8">
				<label for="bodyattent-8">肝胆功能</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-9" name="bodyattent" value="9">
				<label for="bodyattent-9">妇科</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="bodyattent-10" name="bodyattent" value="10">
				<label for="bodyattent-10">皮肤/内分泌</label>
			</div>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>有无慢性疾病？<span>【多选题】</span></label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<input type="checkbox" id="chronic-1" name="chronic" value="1">
				<label for="chronic-1">高血压</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="chronic-2" name="chronic" value="2">
				<label for="chronic-2">高血糖</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="chronic-3" name="chronic" value="3">
				<label for="chronic-3">高血脂</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="chronic-4" name="chronic" value="4">
				<label for="chronic-4">无慢性病</label>
			</div>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>您的小便情况？<span>【多选题】</span></label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<input type="checkbox" id="urine-1" name="urine" value="1">
				<label for="urine-1">量多色白</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="urine-2" name="urine" value="2">
				<label for="urine-2">量少色黄</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="urine-3" name="urine" value="3">
				<label for="urine-3">量多色黄</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="urine-4" name="urine" value="4">
				<label for="urine-4">淋漓不尽</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="urine-5" name="urine" value="5">
				<label for="urine-5">不便较频</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="urine-6" name="urine" value="6">
				<label for="urine-6">夜尿多其他补充(如前列腺炎)</label>
			</div>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>您的大便排便类型？<span>【多选题】</span></label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<input type="checkbox" id="shit-1" name="shit" value="1">
				<label for="shit-1">量多色白</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="shit-2" name="shit" value="2">
				<label for="shit-2">量少色黄</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="shit-3" name="shit" value="3">
				<label for="shit-3">量多色黄</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="shit-4" name="shit" value="4">
				<label for="shit-4">淋漓不尽</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="shit-5" name="shit" value="5">
				<label for="shit-5">不便较频</label>
			</div>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>近期是否有以下状况？<span>【多选题】</span></label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<input type="checkbox" id="symptom-1" name="symptom" value="1">
				<label for="symptom-1">胃痛</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="symptom-2" name="symptom" value="2">
				<label for="symptom-2">腹泻</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="symptom-3" name="symptom" value="3">
				<label for="symptom-3">胃胀</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="symptom-4" name="symptom" value="4">
				<label for="symptom-4">头痛</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="symptom-5" name="symptom" value="5">
				<label for="symptom-5">咳嗽</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="symptom-6" name="symptom" value="6">
				<label for="symptom-6">感冒</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="symptom-7" name="symptom" value="7">
				<label for="symptom-7">咽喉痛</label>
			</div>
			<div class="radio-box">
				<input type="checkbox" id="symptom-8" name="symptom" value="8">
				<label for="symptom-8">没有</label>
			</div>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>有过胸闷、上楼气短的感觉吗？</label>
		<div class="formControls col-xs-8 col-sm-9 skin-minimal">
			<div class="radio-box">
				<input type="radio" id="tightness-1" name="tightness" value="1">
				<label for="tightness-1">没有</label>
			</div>
			<div class="radio-box">
				<input type="radio" id="tightness-2" name="tightness" value="2">
				<label for="tightness-2">有,不严重</label>
			</div>
			<div class="radio-box">
				<input type="radio" id="tightness-3" name="tightness" value="3">
				<label for="tightness-3">经常会</label>
			</div>
		</div>
	</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>既往病史：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<textarea name="medhistory" cols="" rows="" class="textarea"  placeholder="说点什么吧...让我们更了解您..." dragonfly="true" <%--onKeyUp="$.Huitextarealength(this,100)"--%>></textarea>
			<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
		</div>
	</div>
	<input type="hidden" name="id" value="${bId}">
	<input type="hidden" name="uid" value="${sessionScope.user.id}">
	<div class="row cl">
		<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
			<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
		</div>
	</div>
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
	var h = "${have}";
	$(function(){
		if(h == 1){
			$("#modal-demo").modal("show")
		}else if (h == 0){
			$("#modal-demo1").modal("show")
		}
	});

	$(".textarea").Huitextarealength({
		exceed: false,
		maxlength:100
	});

$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-admin-add").validate({
		rules:{
			medhistory:{
				required:true,
				minlength: 5
			},
			/*weight:{
				required:true,
			},
			cold:{
				required:true,
			},
			bodyAttent:{
				required:true,
			},
			chronic:{
				required:true,
			},
			urine:{
				required:true,
			},
			shit:{
				required:true,
			},
			symptom:{
				required:true,
			},
			tightness:{
				required:true,
			},*/
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit({
				async : false,
				type: 'post',
				url: "/changeBodyInfo?state="+h,
				success: function(data){
					if(data == "renew"){
						layer.msg('更新成功!',{icon:1,time:1000});
					}else if (data == "finishAdd") {
						layer.msg('填写成功!',{icon:1,time:1000});
					}else {
						$.Huimodalalert('成功!',1000);
					}
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