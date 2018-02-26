<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>首页</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link type="text/css" rel="stylesheet" href="style/indexBody.css"><!-- 原来在这里的样式 -->
</head>
<body class="layui-bg-gray" style="align:center; margin:auto">

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
<link type="text/css" rel="stylesheet" href="style/reset.css"><!-- 头部解忧驿站 -->
<link type="text/css" rel="stylesheet" href="style/header.css"><!-- 头部登陆注册 -->
<link type="text/css" rel="stylesheet" href="style/main.css"><!-- 头部解忧驿站 -->
<script src="itdage-show/layui/layui.js" charset="utf-8"></script>
<script src="itdage-show/js/jquery.js" charset="utf-8"></script>
<script src="js/login.js" charset="utf-8"></script><!-- 界面中间登陆注册的按钮 -->
<script src="js/header.js" charset="utf-8"></script><!-- 头部按登陆注册的按钮下面的动态效果 -->

<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->

</head>
<body>
	<div class="layui-container header0 layui-bg-cyan">
		<div class="layui-row">
			<div class="logo">
			<ul class="layui-nav  layui-bg-cyan">
            	<li><a href="index.jsp" class="homePage" style="font-size:26px;">解忧驿站</a></li>
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
	<input type="hidden" value=""
		id="is_login">
</body>
</html>
<hr>
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
							用户名</a>
						</h3>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<br>
						
						<div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a class='title' target='_blank' href='card.jsp'>内容内容。。。。。。。。。。。内容</a>
						</div>
						<br><br>
						<div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span>时间噢</span>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<span><i class="layui-icon">&#xe6c6;</i>&nbsp;赞(20)</span>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a class='comment'><i class='layui-icon'>&#xe611;</i>&nbsp;<span>评论(20)</span></a>
						</p>
						</div>
					</div>	
				</li><li id="article_list">
					<div id='article_li'>
						<h3 style='color:black;'>
							<a  href="user.jsp">
							    <img alt=""
									src="images/小清新.jpg"
									style="width: 50px; height: 50px; border-radius: 200px;">
							用户名</a>
						</h3>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<br>
						
						<div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a class='title' target='_blank' href='card.jsp'>内容内容。。。。。。。。。。。内容</a>
						</div>
						<br><br>
						<div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span>时间噢</span>
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
			<div class="hot_article" style="text-align: center;height:160px;">
				&nbsp;&nbsp;贴主简介
				<hr class="layui-bg-green">
				<ul>
					<!-- 测试为写死的图片 -->
					<li>
					<a href="javascript:"><img alt=""
							src="images/小清新.jpg"
							style="width: 50px; height: 50px; border-radius: 200px;">&nbsp;&nbsp;</a></li>
					<!-- <li><a href="#" class="title"> 用户名
					<span  class="layui-badge layui-bg-green">+ 关注</span></a></li> -->
					<li><a  href="user.jsp"><b>用户名</b></a></li>
					<li>原创：88</li>
				</ul>
			</div>

			<div class="hot_article" style="margin-top: 20px;">
				<span style="padding-left: 133px;">他的最新文章</span>
				<hr class="layui-bg-green">
				<ul id="new_article_list">
					
						<li><a onclick="getArticle('121')" class="title">1.
								回眸却已逝去</a></li>
					
						<li><a onclick="getArticle('119')" class="title">2.
								有一段青春，不再提起</a></li>
					
						<li><a onclick="getArticle('118')" class="title">3.
								我的幸福刚刚好</a></li>
					
						<li><a onclick="getArticle('117')" class="title">4.
								时光慢些吧，不要再让他老去</a></li>
					
						<li><a onclick="getArticle('116')" class="title">5.
								乡愁是一种味道</a></li>
					
				</ul>
			</div>
		</div>
</div>
<div id="demo7"></div>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>footer</title>
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
</head>
<body>
<div align="center" class="footer  layui-bg-cyan">
	<p style="padding-top:20px">2017 - 2018 联系我们  | QQ：1091164143</p>
</div>
</body>
</html>
<script type="text/javascript">

layui.use(['laypage', 'layer'], function(){
	  var laypage = layui.laypage
	  ,layer = layui.layer;
	  var totalCount = getTotalArticle('all', null);
	  //完整功能
	  laypage.render({
	    elem: 'demo7'
	    ,count: totalCount
	    ,limit: 8
	    ,layout: ['count', 'prev', 'page', 'next',  'skip']
	  ,jump: function(obj, first){
		    //首次不执行
		    if(!first){
		      //do something
		      $("#article_list").empty();
		      getMainArticleList(obj.curr, 'select', null);
		    }
		  }
	  });
	});
	
function getArticleByTag(tag){
	$("#article_list").empty();
	getMainArticleList(1, 'getArticleByTag', tag);
	layui.use(['laypage', 'layer'], function(){
		  var laypage = layui.laypage
		  ,layer = layui.layer;
		  var totalCount = getTotalArticle('tagAll', tag);
		  //完整功能
		  laypage.render({
		    elem: 'demo7'
		    ,count: totalCount
		    ,limit: 8
		    ,layout: ['count', 'prev', 'page', 'next',  'skip']
		  ,jump: function(obj, first){
			    //obj包含了当前分页的所有参数，比如：
			    //首次不执行
			    if(!first){
			      //do something
			      $("#article_list").empty();
			      getMainArticleList(obj.curr, 'getArticleByTag', tag);
			    }
			  }
		  });
		});
}

function search(){
	layer.prompt({title: '请输入文章标签或标题', formType: 2}, function(tag, index){
		  layer.close(index);
		  getArticleByTag(tag);
		 // layer.msg(pass);
		});
}
	
	//得到主页文章(左半部分)
	function getMainArticleList(currpage, path2, tag){
		var jsonStr = null;
		if(path2 == "select"){
			//分页
			jsonStr = {"pageNo":currpage};
		}else if(path2 == "getArticleByTag"){
			jsonStr = {"pageNo":currpage,"tag":tag};
		}
		
		$.ajax({
			url : "/itdage-show/article/"+path2,
			dataType : "json",
			type : "GET",
			data : jsonStr,
			success : function(data) {
				if (data.state == 1) {
					//成功,列举数据
					for (var i = 0; i < data.object.length; i++) {
						var classStr = null;
						var id = data.object[i].id;
						var href = '/itdage-show/article/getArticle/' + id;
						if(data.object[i].type == '原创'){
							//原创
							classStr = "<span class='layui-badge'>原创</span>";
						}else{
							classStr = "<span class='layui-badge layui-bg-green'>转载</span>";
						}
						$("#article_list").append("<div id='article_li'>"
						+ "<a class='title' target='_blank' href='"+href+"'><h3 style='color:black;'>"
						+ classStr
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ data.object[i].title 
						+ "</h3><br><div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>" 
						+ data.object[i].content
						+ "</div></a><br><br><div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span>" + data.object[i].publish_date + "</span>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<i class='layui-icon'>&#xe612;</i>&nbsp;<span>" + data.object[i].username + "</span>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<a class='comment'><img alt='' src='/itdage-show/images/tag.png' width='20px;' height='13px;'>&nbsp;<span onclick=getArticleByTag('"+data.object[i].tag+"')>" + data.object[i].tag + "</span></a>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<img alt='' src='/itdage-show/images/look.png' width='20px;' height='13px;'>&nbsp;<span>浏览("+data.object[i].page_view+")</span>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<a class='comment'><i class='layui-icon'>&#xe611;</i>&nbsp;<span>评论("+data.object[i].comment+")</span></a>"
						+ "</p></div>"
						+ "</div>");
					}
				}
			},
			error : function(data, type, err) {
					console.log("ajax错误类型3："+type);
					console.log(err); 
				}
			});
	}
	
$(function(){
	getMainArticleList(1, 'select', null);
	getHotArticle();
	getNotice();
});

 function getTotalArticle(flag, data){
	 var count = 0;
	$.ajax({
		url : "/itdage-show/article/getTotalArticle/" + flag,
		dataType : "json",
		type : "GET",
		async: false,
		data:{"tag":data},
		success : function(data) {
			if (data.state > 0) {
				count = data.state;
			}
		},
		error : function(data, type, err) {
				console.log("ajax错误类型4："+type);
				console.log(err); 
			}
		});
	return count;
}
 
 function getNotice(){
	$.ajax({
		url : "/itdage-show/notice/get",
		dataType : "json",
		type : "GET",
		success : function(data) {
			if (data.state > 0) {
				count = data.state;
				$("#notice").empty();
				$("#notice").append("<li><p style='color:black;'>"+data.object.content+"</p></li>");
			}
		},
		error : function(data, type, err) {
				console.log("ajax错误类型5："+type);
				console.log(err); 
			}
		});
}

function getHotArticle(){
	$.ajax({
		url : "/itdage-show/article/getHotArticle",
		dataType : "json",
		type : "GET",
		success : function(data) {
			if (data.state == 1) {
				//成功,关闭页面
				for (var i = 0; i < data.object.length; i++) {
					var j = i+1;
					var href = '/itdage-show/article/getArticle/' + data.object[i].id;
					$("#hot_article_list").append("<li><a target='_blank' href='"+href+"' class='title'>"+j+". "+data.object[i].title+"</a></li>");
				}
			}else{
				$("#hot_article_list").append("<li><a class='title' href='#'>获取最新文章失败</a></li>");
			}
		},
		error : function(data, type, err) {
				console.log("ajax错误类型6："+type);
				console.log(err); 
			}
		});
}
</script>

</body>
</html>