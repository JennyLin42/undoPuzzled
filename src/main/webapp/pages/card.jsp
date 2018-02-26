<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>文章详情</title>
<meta name="renderer" content="webkit">
<link rel="stylesheet" href="itdage-show/layui/css/layui.css" media="all">
<link rel="stylesheet" href="style/card.css"><!-- 属于这个界面的CSS -->
<link type="text/css" rel="stylesheet" href="style/reset.css"><!-- 头部解忧驿站 -->
<link type="text/css" rel="stylesheet" href="style/header.css"><!-- 头部登陆注册 -->
<link type="text/css" rel="stylesheet" href="style/main.css"><!-- 头部解忧驿站 -->

<script src="itdage-show/layui/layui.js" charset="utf-8"></script>
<script src="itdage-show/js/jquery.js" charset="utf-8"></script>
<script src="js/header.js" charset="utf-8"></script><!-- 头部按登陆注册的按钮下面的动态效果 -->
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
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

<body class="layui-bg-gray" style="align: center; margin: auto">
	
	<hr>
	<div>
		<div class="left" >
			<div class="article">
				<ul >
					<li id="article_list">
						<div style='margin-top: 20px;line-height: 30px;'
							id="article_main">
							<!-- <h2 style="text-align: center; color: black;">题目题目</h2><p> -->
							<h2>&nbsp;&nbsp;&nbsp;&nbsp;内容内容........................</h2>
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
	<hr width="800px;">
	<div
		style="margin: 0px 0 20px 0; width: 800px; background-color: white;">
		<textarea class="layui-textarea" id="LAY_demo2" style="display: none"></textarea>
	</div>
	<div class="site-demo-button" style="margin-top: 20px;">
		<button class="layui-btn site-demo-layedit" data-type="content">发表评论</button>
		<button class="layui-btn layui-btn-primary">重置</button>
	</div>

	<div id="comment" style="margin-top: 20px;">
		<p style="font-size: 16px; color: #FF5722;">评论列表:</p>
		<hr width="800px" class='layui-bg-green'>
		<br>
		<ul>
			<li id="comment_list"></li>
		</ul>
	</div>
	<br>
	<input type="hidden" id="this_article_id" value="121">
	<input type="hidden" id="username"
		value="">
	<input type="hidden" id="hiddenContent">
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		var username = $("#username").val();

		$(function() {
			//得到初始化评论
			getInitComment();
		})
		layui
				.use(
						[ 'layedit', 'form' ],
						function() {
							var layedit = layui.layedit, $ = layui.jquery, layer = layui.layer;
							var form = layui.form

							//自定义工具栏
							var index = layedit.build('LAY_demo2', {
								tool : [ 'strong', 'italic', '|', 'face', '|',
										'left' ],
								height : 100
							})

							//编辑器外部操作
							var active = {
								content : function() {
									var content = layedit.getContent(index);
									var text = layedit.getText(index);
									if (username == '') {
										layer.msg('您还没有登录,请先登录再发表评论吧!');
									} else {
										if (content == '' || text == '') {
											layer.msg('评论内容不能为空!');
										} else {
											if (content.length > 1900) {
												layer.msg('评论内容太多!');
											} else {
												var article_id = $(
														"#this_article_id")
														.val();
												$
														.ajax({
															url : "/itdage-show/comment/add",
															dataType : "json",
															type : "POST",
															data : {
																"article_id" : article_id,
																"content" : content
															},
															success : function(
																	data) {
																if (data.state == 1) {
																	//成功,关闭页面
																	var srcPath = '/itdage-show/images/user/'
																			+ data.object.image;
																	var content = data.object2.content;
																	layer
																			.msg("评论成功");
																	$(
																			"#comment_list")
																			.prepend(
																					showCommentBlock(
																							data.object2.id,
																							srcPath,
																							data.object.username,
																							data.object2.time,
																							content,
																							null,
																							true));

																} else {
																	layer
																			.msg("评论失败");
																}
															},
															error : function(
																	data, type,
																	err) {
																console
																		.log("ajax错误类型："
																				+ type);
																console
																		.log(err);
															}
														});
											}

										}
									}
								}
							};
							$('.site-demo-layedit').on('click', function() {
								var type = $(this).data('type');
								active[type] ? active[type].call(this) : '';
							});

						});

		function showCommentBlock(id, srcPath, username, time, content, id2,
				deleteButton) {
			var block = null;
			if (deleteButton) {
				//带删除按钮的
				block = "<span id='delete_"+id+"'><li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='javascript:'><img"
				+ " alt='' src='"+srcPath+"'"
				+"style='width: 30px; height: 30px; border-radius: 200px;'>&nbsp;&nbsp;<b>"
						+ username
						+ "</b></a>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ time
						+ "&nbsp;&nbsp;&nbsp;&nbsp;</li>"
						+ "<li><br><p>"
						+ content
						+ "</p></li><li id='"+id+"' style='margin:5px 0 10px 40px'><a href='#'  class='reply'>赞(0)</a>&nbsp;&nbsp;&nbsp;&nbsp;<a onclick='deleteComment("
						+ id
						+ ")' class='delete_comment reply'>删除</a></li><li><hr class='layui-bg-green'></li></span>";
			} else {
				//不带删除按钮的
				block = "<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='javascript:'><img"
					+ " alt='' src='"+srcPath+"'"
					+"style='width: 30px; height: 30px; border-radius: 200px;'>&nbsp;&nbsp;<b>"
						+ username
						+ "</b></a>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ time
						+ "&nbsp;&nbsp;&nbsp;&nbsp;</li>"
						+ "<li><br><p>"
						+ content
						+ "</p></li>"
						+ "<li id='"+id+"' style='margin:5px 0 10px 40px'><a href='#'  class='reply'>赞(0)</a>&nbsp;&nbsp;&nbsp;&nbsp;<a onclick=reply("
						+ id2
						+ ") class='reply'>回复</a></li><li><hr class='layui-bg-green'></li>";
			}
			return block;
		}

		function getInitComment() {
			var article_id = $("#this_article_id").val();
			$.ajax({
				url : "/itdage-show/comment/getByArticleId",
				dataType : "json",
				type : "GET",
				data : {
					"article_id" : article_id
				},
				success : function(data) {
					$("#comment_list").empty();
					for (var i = 0; i < data.object2.length; i++) {
						var srcPath = '/itdage-show/images/user/'
								+ data.object[i].image;
						var content = data.object2[i].content;
						var comment_username = data.object[i].username;
						if (comment_username == username) {
							//带删除按钮
							$("#comment_list").append(
									showCommentBlock(data.object2[i].id,
											srcPath, data.object[i].username,
											data.object2[i].time, content,
											null, true));
						} else {
							//不带删除按钮
							var id = data.object2[i].id;
							var tousername = data.object[i].username;
							var params = id + ',' + '\'' + tousername + '\'';
							$("#comment_list").append(
									showCommentBlock(data.object2[i].id,
											srcPath, data.object[i].username,
											data.object2[i].time, content,
											params, false));
						}
						getInitReply(data.object2[i].id);
					}
				},
				error : function(data, type, err) {
					console.log("ajax错误类型：" + type);
					console.log(err);
				}
			});
		}

		//回复的输入框
		function reply(id, tousername) {
			var size = $("#" + id + " input").length;//评论输入框的个数
			var params = id + ',' + '\'' + tousername + '\'';
			$("#replyInput").remove();
			$("#" + id + "")
					.append(
							"<div class='layui-input-block' id='replyInput'>"
									+ "<table style='margin:5px 0 3px -100px;'><tr>"
									+ "<td width='600px'><input type='text' id='replyContent' name='content' required  lay-verify='required' placeholder='请输入内容' autocomplete='off' class='layui-input'></td>"
									+ "<td width='30px'><button class='layui-btn' onclick=showReply("
									+ params + ")>回复</button></td>"
									+ "</tr></table>" + "</div>");
		}
		
			function htmlEncodeJQ ( str ) {
			  return $('<span/>').text( str ).html();
			}
		
		//显示回复,回复成功时不用重新加载页面了
		function showReply(id, tousername) {
			var params = id + ',' + '\'' + username + '\'';
			if (username == null || username == '') {
				layer.msg("请先登录再进行回复吧!");
			} else {
				var content = $("#replyContent").val();
				content = htmlEncodeJQ(content);

				if (content == null || content == '') {
					layer.msg('请输入回复内容!');
				} else {
					var jsonStr = {
						'content' : content,
						'comment_id' : id,
						'fromUsername' : username,
						'toUsername' : tousername
					};
					$.ajax({
						url : "/itdage-show/reply/add",
						dataType : "json",
						type : "POST",
						async : false,
						contentType : "application/json",
						data : JSON.stringify(jsonStr),
						success : function(data) {
							layer.msg(data.message);
							if (data.state == 1) {
								//成功,关闭页面
								$("#replyInput").before(
										showReplyBlock(data.object, username,
												tousername, content, params,
												true));
								$("#replyInput").remove();
							}
						},
						error : function(data, type, err) {
							console.log("ajax错误类型：" + type);
							console.log(err);
						}
					});
				}
			}
		}

		//根据commentid得到初始化的回复
		function getInitReply(comment_id) {
			$.ajax({
				url : "/itdage-show/reply/getReplyByCommentId",
				dataType : "json",
				type : "GET",
				async : false,
				data : {
					'commentId' : comment_id
				},
				success : function(data) {
					if (data.state == 1) {
						//成功,关闭页面
						for (var i = 0; i < data.object.length; i++) {
							var params = comment_id + ',' + '\''
									+ data.object[i].fromUsername + '\'';
							if (username == data.object[i].fromUsername) {
								//带删除按钮
								$("#" + comment_id + "").append(
										showReplyBlock(data.object[i].id,
												data.object[i].fromUsername,
												data.object[i].toUsername,
												data.object[i].content, params,
												true));
							} else {
								//不带删除按钮
								$("#" + comment_id + "").append(
										showReplyBlock(data.object[i].id,
												data.object[i].fromUsername,
												data.object[i].toUsername,
												data.object[i].content, params,
												false));
							}
						}
					}
				},
				error : function(data, type, err) {
					console.log("ajax错误类型：" + type);
					console.log(err);
				}
			});
		}

		//回复模块的html
		function showReplyBlock(reply_id, fromUsername, toUsername, content,
				params, deleteButton) {
			var block = "<span id='"+reply_id+"'><li><hr width='700px'></li><li style='margin:5px 0 0 50px;'><span class='replyName'>"
					+ fromUsername
					+ "</span>&nbsp;&nbsp;&nbsp;&nbsp;回复&nbsp;&nbsp;&nbsp;&nbsp;<span class='replyName'>"
					+ toUsername
					+ "</span>&nbsp;&nbsp;&nbsp;&nbsp;</li>"
					+ "<li style='margin:5px 0 10px 50px;'><span style='color:black;'>&nbsp;&nbsp;"
					+ content
					+ "<span class='replyName'></li><li style='margin:5px 0 10px 48px'><a href='#'  class='reply'>赞(0)</a>";
			if (deleteButton) {
				//带删除选项
				block = block
						+ "&nbsp;&nbsp;&nbsp;&nbsp;<a onclick='deleteReply("
						+ reply_id
						+ ")'  class='reply'>删除</a></li><li><hr width='700px'></li></span>"
			} else {
				//不带删除选项
				block = block
						+ "&nbsp;&nbsp;&nbsp;&nbsp;<a onclick=reply("
						+ params
						+ ") class='reply'>回复</a></li><li><hr width='700px'></li></span>";
			}
			return block;
		}

		function getArticle(id) {
			$.ajax({
				url : "/itdage-show/article/getArticleById",
				dataType : "json",
				type : "GET",
				data : {
					"id" : id
				},
				success : function(data) {
					if (data.state == 1) {
						$("#article_main").empty();
						$("#article_main").append(
								"<h2 style='text-align: center; color: black;'>"
										+ data.object.title + "</h2>"
										+ data.object.content + "");
						var article_id = $("#this_article_id").val(
								data.object.id);
						getInitComment();
					} else {
						alert("error");
					}
				},
				error : function(data, type, err) {
					console.log("ajax错误类型：" + type);
					console.log(err);
				}
			});
		}

		//根据评论的id删除评论
		function deleteComment(id) {
			$.ajax({
				url : "/itdage-show/comment/delete",
				dataType : "json",
				type : "GET",
				data : {
					"id" : id
				},
				success : function(data) {
					var delete_id = 'delete_' + id;
					if (data.state == 1) {
						layer.msg('删除成功!');
						$("#" + delete_id + "").remove();
						lay.msg('ss')
					} else {
						alert("error");
					}
				},
				error : function(data, type, err) {
					console.log("ajax错误类型：" + type);
					console.log(err);
				}
			});
		}

		//删除回复的内容
		function deleteReply(id) {
			$.ajax({
				url : "/itdage-show/reply/deleteReplyById",
				dataType : "json",
				type : "get",
				data : {
					"id" : id
				},
				success : function(data) {
					if (data.state == 1) {
						layer.msg('删除成功!');
						$("#" + id + "").remove();
					} else {
						alert("error");
					}
				},
				error : function(data, type, err) {
					console.log("ajax错误类型：" + type);
					console.log(err);
				}
			});
		}
	</script>

</body>
</html>