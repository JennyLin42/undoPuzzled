<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style type="text/css">
body {
	width: 1200px;
}

.register0 {
	height: 500px;
}

a.changecursor:hover{
	cursor:pointer!important;
}
</style>
<link rel="stylesheet" href="itdage-show/css/global.css"
	media="all">
</head>
<body class="layui-bg-gray" style="align: center; margin: auto">
	


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>头部</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="itdage-show/layui/css/layui.css" media="all">
<link type="text/css" rel="stylesheet" href="style/header.css"><!-- 头部登陆注册 -->
<link type="text/css" rel="stylesheet" href="style/reset.css"><!-- 解忧驿站 -->
<link type="text/css" rel="stylesheet" href="style/main.css"><!-- 解忧驿站 -->
<script src="itdage-show/layui/layui.js" charset="utf-8"></script>
<script src="itdage-show/js/jquery.js" charset="utf-8"></script>
<script src="js/login.js" charset="utf-8"></script><!-- 界面中登陆注册的按钮 -->
<script src="js/header.js" charset="utf-8"></script><!-- 按登陆注册的按钮下面的动态效果 -->
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->

</head>
<body>
	<div class="layui-container header0 layui-bg-cyan">
		<div class="layui-row">
			<div class="logo">
			<ul class="layui-nav  layui-bg-cyan">
            	<li><a href="index.jsp" class="homePage" style="font-size:26px;color:#fff;">解忧驿站</a></li>
            </ul>
			</div>
			<div class="header3">
				<ul class="layui-nav  layui-bg-cyan">
					<li class="layui-nav-item"><a href="login.jsp">登录</a></li>
					<li class="layui-nav-item"><a href="#" onclick="register()">注册</a></li>
				</ul>
			</div>
		</div>
	</div>
	<input type="hidden" value=""  id="is_login">

</body>
</html>
	<div class="layui-container fly-marginTop register0">
		<div class="fly-panel fly-panel-user" pad20>
			<div class="layui-tab layui-tab-brief" lay-filter="user">
				<ul class="layui-tab-title">
					<li class="layui-this" onclick="login()">登入</li>
					<li onclick="register()">注册</li>
				</ul>
				<div class="layui-form layui-tab-content" id="LAY_ucm"
					style="padding: 20px 0;"></div>
			</div>
		</div>
	</div>
	<input type="hidden" value="" id="email_username">
	<script type="text/javascript">
	
    </script>
</body>
</html>