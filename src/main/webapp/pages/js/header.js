
	

		layui.use(
				[ 'element', 'form' ],
				function() {
					var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
					var form = layui.form;
					element.init();
					/*$.ajax({
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
					});*/
				});