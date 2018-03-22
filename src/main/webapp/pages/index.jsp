<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp" ng-controller="homecontroller">
<head>
<meta charset="utf-8">
<title>首页</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<link type="text/css" rel="stylesheet" href="style/indexBody.css"><!-- 原来在这里的样式 -->
<link rel="stylesheet" href="itdage-show/layui/css/layui.css" media="all">
<link type="text/css" rel="stylesheet" href="style/reset.css"><!-- 头部解忧驿站 -->
<link type="text/css" rel="stylesheet" href="style/header.css"><!-- 头部登陆注册 -->
<link type="text/css" rel="stylesheet" href="style/main.css"><!-- 头部解忧驿站 -->
<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script src="itdage-show/layui/layui.js" charset="utf-8"></script>
<script src="itdage-show/js/jquery.js" charset="utf-8"></script>
<script src="js/login.js" charset="utf-8"></script><!-- 界面中间登陆注册的按钮 -->
<script src="js/header.js" charset="utf-8"></script><!-- 头部按登陆注册的按钮下面的动态效果 -->
<script src="js/controller/homecontroller.js" charset="utf-8"></script><!-- 控制器 -->

<style type="text/css">
	.footer{
	    float:left;
		background-color:#393D49;
		width:1200px;
		align:center;
		margin:auto;
		height:55px;
		margin-top:20px;
	}
</style>
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-bg-gray" style="align:center; margin:auto" >
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
					<li class="layui-nav-item"><a href="login.jsp?id='register'">注册</a></li>
				</ul>
			</div>
		</div>
	</div>
	

	<div style="height:20px;"></div>
	
	<div class = "left">
		<form class="layui-form" action="">
		  <div class="layui-form-item layui-form-text">
		      <textarea name="desc" placeholder="说点什么吧..." class="layui-textarea" ng-model="textarea"></textarea>
		  </div>
		</form>
    </div>
	<div class = "right">
		<div class="site-demo-button" style="margin-top: 20px;">
			<button class="layui-btn site-demo-layedit" data-type="content">发表帖子</button>
			<button class="layui-btn layui-btn-primary" ng-click="clearTest()">重置</button>
		</div>
	</div>
	
	<div>
		<div class="left">
			<div class="article">
				<ul>
					<li id="article_list">
						<div id='article_li'>
							<h3 style='color:black;'>
								<a  href="user.jsp">
								    <img alt=""
										src="images/小清新.jpg"
										style="width: 50px; height: 50px; border-radius: 200px;">
								林飘飘</a>
							</h3>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<br>
							
							<div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a class='title' target='_blank' href='card.jsp'>最近又要工作又要写毕设，顶着学校的压力和工作的压力，还有自己的生活上经济压力。</a>
							</div>
							<br><br>
							<div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span>2018-03-11 20：48：00</span>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<!-- <i class='layui-icon'>&#xe612;</i>&nbsp;<span>用户名 </span> -->
							&nbsp;
							<!-- <a class='comment'><img alt='' src='/itdage-show/images/tag.png' width='20px;' height='13px;'>&nbsp;<span>类型</span></a>
							&nbsp;&nbsp;&nbsp;&nbsp; -->
							<span><i class="layui-icon">&#xe6c6;</i> 赞(20)</span>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<a class='comment'><i class='layui-icon'>&#xe611;</i>&nbsp;<span>评论(20)</span></a>
							</p>
							</div>
						</div>	
					</li>
					<li id="article_list">
						<div id='article_li'>
							<h3 style='color:black;'>
								<a  href="user.jsp">
								    <img alt=""
										src="images/小清新.jpg"
										style="width: 50px; height: 50px; border-radius: 200px;">
								李春花</a>
							</h3>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<br>
							
							<div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a class='title' target='_blank' href='card.jsp'>小丫头的出生让我们欣喜的同时，也让我们发愁，我爸妈和他爸妈都没空帮忙照顾女儿，难道我只能辞职回到家中做全职母亲了么？</a>
							</div>
							<br><br>
							<div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span>2018-03-10 20：48：00</span>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<!-- <i class='layui-icon'>&#xe612;</i>&nbsp;<span>用户名 </span> -->
							&nbsp;
							<!-- <a class='comment'><img alt='' src='/itdage-show/images/tag.png' width='20px;' height='13px;'>&nbsp;<span>类型</span></a>
							&nbsp;&nbsp;&nbsp;&nbsp; -->
							<span><i class="layui-icon">&#xe6c6;</i> 赞(20)</span>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<a class='comment'><i class='layui-icon'>&#xe611;</i>&nbsp;<span>评论(20)</span></a>
							</p>
							</div>
						</div>	
					</li>	
					
				</ul>
			</div>
		</div>
		<div class="right">
			<div class="hot_article" >
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;热门帖子
				<hr class="layui-bg-green">
				<ul id="hot_article_list">
				    <li><a onclick="getArticle('121')" class="title">1.
									回眸却已逝去</a></li>
						
							<li><a onclick="getArticle('119')" class="title">2.
									有一段青春，不再提起</a></li>
						
							<li><a onclick="getArticle('118')" class="title">3.
									我的幸福刚刚好</a></li>
						
							<li><a onclick="getArticle('117')" class="title">4.
									时光慢些吧，不要再让他老去</a></li>
						
							<li><a onclick="getArticle('116')" class="title">5.
									乡愁是一种味道</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	
	<div align="center" class="footer  layui-bg-cyan">
	<p style="padding-top:20px">2017 - 2018 联系我们  | QQ：1091164143</p>
    </div>
	
</body>
</html>


