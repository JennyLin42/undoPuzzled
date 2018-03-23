<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp" ng-controller="logincontroller">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<title>登录</title>
<style type="text/css">
body {
	width: 1200px;
}

.register0 {
	height: 500px;
}

a.changecursor:hover {
	cursor: pointer !important;
}
</style>
<link rel="stylesheet" href="itdage-show/css/global.css" media="all">
<link rel="stylesheet" href="itdage-show/layui/css/layui.css"
	media="all">
<link type="text/css" rel="stylesheet" href="style/header.css"><!-- 头部登陆注册 -->
<link type="text/css" rel="stylesheet" href="style/reset.css"><!-- 解忧驿站 -->
<link type="text/css" rel="stylesheet" href="style/main.css"><!-- 解忧驿站 -->
<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script src="itdage-show/layui/layui.js" charset="utf-8"></script>
<script src="itdage-show/js/jquery.js" charset="utf-8"></script>
<!-- <script src="js/login.js" charset="utf-8"></script> --><!-- 界面中登陆注册的按钮 -->
<script src="js/header.js" charset="utf-8"></script><!-- 按登陆注册的按钮下面的动态效果 -->
<script src="js/controller/logincontroller.js" charset="utf-8"></script><!-- 控制器 -->
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-bg-gray" style="align: center; margin: auto">


	<div class="layui-container header0 layui-bg-cyan">
		<div class="layui-row">
			<div class="logo">
				<ul class="layui-nav  layui-bg-cyan">
					<li><a href="index.jsp" class="homePage"
						style="font-size: 26px; color: #fff;">解忧驿站</a></li>
				</ul>
			</div>
			<div class="header3">
				<ul class="layui-nav  layui-bg-cyan">
					<li class="layui-nav-item"><a href="login.jsp">登录</a></li>
					<li class="layui-nav-item"><a href="#" ng-click="register()">注册</a></li>
				</ul>
			</div>
		</div>
	</div>
	<input type="hidden" value="" id="is_login">



	<div class="layui-container fly-marginTop register0">
		<div class="fly-panel fly-panel-user" pad20>
			<div class="layui-tab layui-tab-brief" lay-filter="user">
				<ul class="layui-tab-title">
					<li class="layui-this" ng-click="login()">登入</li>
					<li ng-click="register()">注册</li>
				</ul>
				<div class="layui-form layui-tab-content" id="LAY_ucm"
					style="padding: 20px 0;">
					<!-- ---------登录----------------- -->
					<div class='layui-tab-item layui-show' ng-if="isLogin">
						<div class='layui-form layui-form-pane'>

							<div class='layui-form-item'>
								<label for='L_email' class='layui-form-label'>手机号</label>
								<div class='layui-input-inline'>
									<input type='text' id='username' name='username' class='layui-input'>
								</div>
							</div>
							<div class='layui-form-item'>
								<label for='L_pass' class='layui-form-label'>密码</label>
								<div class='layui-input-inline'>
									<input type='password' id='password' name='password' class='layui-input'>
								</div>
							</div>
							<div class='layui-form-item'>

								<div class='layui-form-item'
									style='align: center; margin: 0 0 0 70px;'>
									<button class='layui-btn' id='login'>立即登录</button>

								</div>
							</div>
							<div class='layui-form-item fly-form-app'></div>
						</div>
					</div>
					<!-- ----------注册---------------- -->
					<div class='layui-tab-item layui-show' ng-if="!isLogin">
						<div class='layui-form layui-form-pane'>

							<div class='layui-form-item'>
								<label for='L_email' class='layui-form-label'>昵称</label>
								<div class='layui-input-inline'>
									<input type='text' id='username' name='username' class='layui-input'>
								</div>
							</div>
							<div class='layui-form-item'>
								<label for='L_email' class='layui-form-label'>密码</label>
								<div class='layui-input-inline'>
									<input type='password' id='password' name='password' class='layui-input'>
								</div>
							</div>
							<div class='layui-form-item'>
								<label for='L_pass' class='layui-form-label'>确认密码</label>
								<div class='layui-input-inline'>
									<input type='password' id='confirm_password'
										name='confirm_password' class='layui-input'>
								</div>
							</div>
							<div class='layui-form-item'>
								<label for='L_email' class='layui-form-label'>手机</label>
								<div class='layui-input-inline'>
									<input type='text' id='tel' name='tel' class='layui-input'>
								</div>
							</div>

							<div class='layui-form-item'>
								<label for='L_email' class='layui-form-label'>所在地</label>
								<div class='layui-input-inline'>
									<input type='text' id='email' name='mail' required
										lay-verify='email' placeholder='请输入个人所在地' autocomplete='off'
										class='layui-input'>
								</div>
							</div>
							<!---------上传图片 -->
							<div class='layui-upload'>
								<button type='button' class='layui-btn' id='test1'>上传图片</button>
								<div class='layui-upload-list'>
									<img class='layui-upload-img' id='demo1'>
									<p id='demoText'></p>
								</div>
							</div>
							<!----------上传图片 -->

							<div class='layui-form-item'
								style='align: center; margin: 0 0 0 70px;'>
								<button class='layui-btn' id='login' >注册</button>
								<button type='reset' class='layui-btn layui-btn-primary'>重置</button>
							</div>
						</div>
					</div>
					<!-- -------------------------- -->
				</div>
			</div>
		</div>
	</div>

	<input type="hidden" value="" id="email_username">

</body>
</html>