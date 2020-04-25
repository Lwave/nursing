<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring"
		   uri="http://www.springframework.org/tags" %>
<meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>登陆</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/auth/auth.css">

	<script type="text/javascript" src="${pageContext.request.contextPath}/lib/html5shiv.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/lib/respond.min.js"></script>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-uiSet.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" />

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
</head>

<body background="${pageContext.request.contextPath}/welcome/img/login.jpg" style=" background-repeat:no-repeat ;background-size:100% 100%;background-attachment: fixed;">
	<div class="lowin">
		<div class="lowin-brand">
			<img src="${pageContext.request.contextPath}/auth/room.jpg" alt="logo">
		</div>
		<div class="lowin-wrapper">
			<div class="lowin-box lowin-login">
				<div class="lowin-box-inner">
					<form class="form form-horizontal" id="form-article" enctype="multipart/form-data">
						<p><spring:message code="ready"/></p>
						<div class="lowin-group">
							<label><spring:message code="username"/> <%--<a href="#" class="login-back-link">登陆?</a>--%></label>
							<input type="text" autocomplete="username" name="username" class="lowin-input">
						</div>
						<div class="lowin-group password-group">
							<label><spring:message code="password"/> <%--<a href="#" class="forgot-link">忘记密码?</a>--%></label>
							<input type="password" name="password" autocomplete="current-password" class="lowin-input">
						</div>
						<button class="lowin-btn login-btn" type="submit">
							<spring:message code="butt"/>
						</button>

						<label><spring:message code="way"/></label>
						<button class="lowin-btn login-btn" id="butn" type="button">
							<spring:message code="direct"/>
						</button>
						<div class="text-foot">
							<spring:message code="nothing"/><a href="" class="register-link"><spring:message code="register"/></a>
						</div>
					</form>
				</div>
			</div>

			<div class="lowin-box lowin-register">
				<div class="lowin-box-inner">
					<form id="form-article-add" class="form form-horizontal">
						<p><spring:message code="create"/></p>
						<div class="lowin-group">
							<label><spring:message code="username"/></label>
							<input id="name" type="text" name="username" autocomplete="username" class="lowin-input">
						</div>
						<div class="lowin-group">
							<label><spring:message code="password"/></label>
							<input id="pwd" type="password" name="password" autocomplete="current-password" class="lowin-input">
						</div>
						<div class="lowin-group">
							<label><spring:message code="password2"/></label>
							<input id="pwd1" type="password" name="password2" autocomplete="off" class="lowin-input">
						</div>
						<div class="lowin-group">
							<label><spring:message code="crowd"/></label>
							<select class="select" name="role" size="1">
<%--
								<option value="5"><spring:message code="ouser"/></option>
--%>
								<option value="3"><spring:message code="elderly"/></option>
                                <option value="7"><spring:message code="employee"/></option>
                            </select>
						</div>
						<button class="lowin-btn" type="submit">
							<spring:message code="regist"/>
						</button>

						<div class="text-foot">
							<spring:message code="Already"/><a href="" class="login-link"><spring:message code="butt"/></a>
						</div>
					</form>
				</div>
			</div>
		</div>
	
		<footer class="lowin-footer">
			<a  href="${pageContext.request.contextPath}/transform?prefix=zh&suffix=CN" title="中文"><spring:message code="Chinese"/></a> - <spring:message code="transform"/> - <a href="${pageContext.request.contextPath}/transform?prefix=en&suffix=US" title="英文">	<spring:message code="English"/></a>
		</footer>
	</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/webuploader/0.1.5/webuploader.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/ueditor/1.4.3/ueditor.config.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/ueditor/1.4.3/ueditor.all.min.js"> </script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>

<script src="${pageContext.request.contextPath}/auth/auth.js"></script>

	<script type="text/javascript">
		Auth.init({
			login_url: '#login',
			forgot_url: '#forgot'
		});


		$("#butn").click(function(){
			window.location.href="/indexx";
		});

		$("#form-article").validate({
			rules:{
				username:{
					required:true,
				},
				password:{
					required:true,
				},
			},
			onkeyup:false,
			focusCleanup:true,
			success:"valid",
			submitHandler:function(form){
				$(form).ajaxSubmit({
					async : false,
					type: 'post',
					url: "/ulogin",
					//dataType: 'json',
					success: function(data){
					    if(data=="admin"){
							$.Huimodalalert('管理员登录!',1500);
							setTimeout(function(){
								window.location.href="/index";
							},2000)
                        }else if (data == "error") {
							$.Huimodalalert('用户名或密码输入错误!',1500);
                        }else if (data == "user") {
							$.Huimodalalert('登录成功!',1500);
							setTimeout(function(){
								window.location.href="/index";
							},2000)
						}
					},
					error: function(XmlHttpRequest, textStatus, errorThrown){
						alert("error");
						layer.msg('error!',{icon:1,time:1000});
					}
				});
				/*var index = parent.layer.getFrameIndex(window.name);
				parent.$('.btn-refresh').click();
				parent.layer.close(index);*/
			}
		});

		$("#form-article-add").validate({
			rules: {
				username:{
					required:true,
					maxlength:8
				},
				/*email: {
					required: true,
					email: true
				},*/
				password:{
					required:true,
					minlength:3,
					maxlength:16
				},
				password2:{
					required:true,
					equalTo: "#pwd"
				},
			},
			onkeyup:false,
			focusCleanup:true,
			success:"valid",
			submitHandler:function(form){
				$(form).ajaxSubmit({
					async : false,
					type: 'post',
					url: "/uregister",
					//dataType: 'json',
					success: function(data){
						if(data == "success"){
							$.Huimodalalert('注册成功！',1500);
                            $(form)[0].reset(); //清空表单
                        }else if (data == "error") {
							$.Huimodalalert('用户名已被使用！',1500);
                            $(form)[0].reset(); //清空表单
						}
                    },
					error: function(XmlHttpRequest, textStatus, errorThrown){
						alert("error");
						layer.msg('error!',{icon:1,time:1000});
					}
				});
			}
		});
	</script>
</body>
</html>