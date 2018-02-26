	
	layui.use(['laypage', 'layer'], function(){ 
		 var layer = layui.layer;
	
		var websocket = null;
		var host = window.location.host;
		var flag = $("#is_login").val();
		if (flag != "") {
			//登陆了 建立连接
			build();
		}

		function build() {
			if ('WebSocket' in window) {
				websocket = new WebSocket("ws://" + host
						+ "/itdage-show/websocketRemind");
				// 连接成功建立的回调方法
				websocket.onopen = function() {
					//alert('通讯连接建立成功!');
				}
				// 连接发生错误的回调方法
				websocket.onerror = function() {
					alert("通讯连接建立失败！");
				};
				// 连接关闭的回调方法
				websocket.onclose = function() {
					//alert("通讯连接关闭!");
				};
				// 接收到消息的回调方法
				websocket.onmessage = function(e) {
					//var jsonObject = JSON.parse(e.data);
					$("#remind_bage").append("<span class='layui-badge'>6</span>");
					layer.open({
						type : 2,
						title : false,
						closeBtn : 0, //不显示关闭按钮
						shade : [ 0 ],
						area : [ '340px', '215px' ],
						offset : 'rb', //右下角弹出
						time : 2000, //2秒后自动关闭
						anim : 2,
						content : [ '/itdage-show/messageRemind.jsp', 'no' ], //iframe的url，no代表不显示滚动条
						});
					}
			} else
				alert("Not Support!");
		}
	});
		window.onbeforeunload = function() {
			if (null != websocket)
				websocket.close();
		};
		function send() {
			var content = $("#content").val();
			var tousername = $("#tousername").val();
			var mes = {
				"to" : tousername,
				"content" : content
			};
			if (null != websocket)
				websocket.send(JSON.stringify(mes));
		}

		layui
				.use(
						[ 'element', 'form' ],
						function() {
							var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
							var form = layui.form;
							element.init();
							$
									.ajax({
										url : "/itdage-show/navigation/get?time="
												+ new Date(),
										dataType : "json",
										type : "GET",
										success : function(data) {
											for (var i = 0; i < data.object.length; i++) {
												var first_name = data.object[i].first_name;
												var first_href = data.object[i].first_href;
												var secondList = data.object[i].list;
												if (secondList != null) {
													var str = "<dl class='layui-nav-child layui-anim layui-anim-upbit'>";
													for (var j = 0; j < data.object[i].list.length; j++) {
														var second_href = data.object[i].list[j].second_href;
														var second_name = data.object[i].list[j].second_name;
														str = str
																+ "<dd><a href='" + second_href + "'>"
																+ second_name
																+ "</a></dd>";
													}
													str = str + "</dl>";
													$("#" + first_name).append(
															str);
												}

											}
											element.init();

										},
										error : function(data, type, err) {
											console.log("ajax错误类型2：" + type);
											console.log(err);
										}
									});
						});

		function changePassword() {
			layer.open({
				type : 2,
				title : '修改密码',
				shadeClose : true,
				shade : 0.1,
				skin : 'layui-layer-molv', //加上边框
				area : [ '400px', '250px' ], //宽高
				content : '/itdage-show/modify_password.jsp'
			});
		};

		function chat() {
			var index = layer.open({
				type : 2,
				title : '在线聊天',
				shadeClose : false,
				shade : 0.1,
				skin : 'layui-layer-molv', //加上边框
				area : [ '620px', '560px' ], //宽高
				content : '/itdage-show/chat.jsp',
				closeBtn : 0
			});

		}