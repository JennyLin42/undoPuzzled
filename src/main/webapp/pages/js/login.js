		
var url=window.location.href;
var id=url.indexOf('=');

if (id == -1){
	$(function() {
		login();
	});
} else{
	$(function() {
		register();
	});
}
		function login() {
			$("#LAY_ucm").empty();
			$("#LAY_ucm")
					.append(
							"<div class='layui-tab-item layui-show'>"
									+ "<div class='layui-form layui-form-pane'>"
									+ "<form>"
									+ "<div class='layui-form-item'>"
									+ "    <label for='L_email' class='layui-form-label'>手机号</label>"
									+ "    <div class='layui-input-inline'>"
									+ "      <input type='text' id='username' name='username' required lay-verify='required' autocomplete='off' class='layui-input'>"
									+ "</div>"
									+ "</div>"
									+ "<div class='layui-form-item'>"
									+ "    <label for='L_pass' class='layui-form-label'>密码</label>"
									+ "    <div class='layui-input-inline'>"
									+ "      <input type='password' id='password' name='password' required lay-verify='required' autocomplete='off' class='layui-input'>"
									+ "    </div>"
									+ "  </div>"
									+ "  <div class='layui-form-item'>"
									
									+ "  <div class='layui-form-item' style='align:center; margin:0 0 0 70px;'>"
									+ "    <button class='layui-btn' id='login' lay-filter='login' lay-submit>立即登录</button>"
									
									+ "  </div>"
									+ " </div>"
									+ " <div class='layui-form-item fly-form-app'>"
								
									+ " </div>");
			//	+ " <span>或者使用社交账号登入</span>"
					//				+ " <a href='/itdage-show/qqlogin.jsp' onclick='layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})' class='iconfont icon-qq' title='QQ登入'></a>"
			///user/forget
		}
		function register() {
			$("#LAY_ucm").empty();
			$("#LAY_ucm")
					.append(
							"<div class='layui-tab-item layui-show'>"
									+ "<div class='layui-form layui-form-pane'>"
									+ "<form>"
									+ "<div class='layui-form-item'>"
									+ "    <label for='L_email' class='layui-form-label'>昵称</label>"
									+ "    <div class='layui-input-inline'>"
									+ "      <input type='text' id='username' name='username' required lay-verify='user' autocomplete='off' class='layui-input'>"
									+ "</div>"
									+ "</div>"
									+ "<div class='layui-form-item'>"
									+ "    <label for='L_email' class='layui-form-label'>密码</label>"
									+ "    <div class='layui-input-inline'>"
									+ "      <input type='password' id='password' name='password' required lay-verify='password' autocomplete='off' class='layui-input'>"
									+ "</div>"
									+ "</div>"
									+ "<div class='layui-form-item'>"
									+ "    <label for='L_pass' class='layui-form-label'>确认密码</label>"
									+ "    <div class='layui-input-inline'>"
									+ "      <input type='password' id='confirm_password' name='confirm_password' required lay-verify='confrim_pass' autocomplete='off' class='layui-input'>"
									+ "    </div>"
									+ "  </div>"
									+ "<div class='layui-form-item'>"
									+ "    <label for='L_email' class='layui-form-label'>手机</label>"
									+ "    <div class='layui-input-inline'>"
									+ "      <input type='text' id='tel' name='tel' required lay-verify='phone' autocomplete='off' class='layui-input'>"
									+ "</div>"
									+ "</div>"
									
									+ "<div class='layui-form-item'>"
									+ "    <label for='L_email' class='layui-form-label'>所在地</label>"
									+ "    <div class='layui-input-inline'>"
									+ "      <input type='text' id='email' name='mail' required lay-verify='email' placeholder='请输入个人所在地' autocomplete='off' class='layui-input'>"
									+ "</div>"
									+ "</div>"
									//-------上传图片
									+"<div class='layui-upload'>"
									+"<button type='button' class='layui-btn' id='test1'>上传图片</button>"
									+"<div class='layui-upload-list'>"
									+"<img class='layui-upload-img' id='demo1'>"
									+"<p id='demoText'></p>"
									+ "</div>"
									+ "</div>"
									//-------上传图片
									
									+ "  <div class='layui-form-item' style='align:center; margin:0 0 0 70px;'>"
									+ "    <button class='layui-btn' id='login' lay-filter='register' lay-submit>注册</button>"
									+"     <button type='reset' class='layui-btn layui-btn-primary'>重置</button>"
									+ "  </div>"
									+ " </div>");
		}
		
		
		
		//监听提交
		layui.use(['form','layer'], function(){
			  var form = layui.form;
			  var layer = layui.layer;
			  
			  form.on('submit(login)', function(data){
				  var username = $("#username").val();
				  var password = $("#password").val();
				  $.ajax({
						url : "/itdage-show/user/login",
						dataType : "json",
						type : "POST",
						data : {"username" : username, "password" : password},
						success : function(data) {
							if (data.state == 1) {
								//成功,关闭页面
								//layer.msg('登录成功!')
								window.location.href='/itdage-show/index.jsp';
								//layer.msg("添加成功!");
							}else{
								layer.msg(data.message);
							}
						},
						error : function(data, type, err) {
								console.log("ajax错误类型："+type);
								console.log(err); 
							}
						});
				  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
				});
			  form.on('submit(register)', function(data){
				  $.ajax({
						url : "/itdage-show/user/register",
						dataType : "json",
						type : "POST",
						contentType: "application/json",
						data : JSON.stringify(data.field),
						success : function(data) {
							if (data.state == 1) {
								layer.msg(data.message, {icon: 1});
							}else{
								//不合法
								layer.msg(data.message, {icon: 2});
							}
						},
						error : function(data, type, err) {
								console.log("ajax错误类型："+type);
								console.log(err); 
							}
						});
				  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
				});
			  //向邮箱发送验证码
			  form.on('submit(forget1)', function(data){
				  var mail = $("#mail").val();
				  var username = $("#username").val();
				  $.ajax({
						url : "/itdage-show/user/getEmailValidCode",
						dataType : "json",
						type : "POST",
						data : {"username":username, "mail":mail},
						async: false,
						success : function(data) {
							if (data.state == 1) {
								layer.msg(data.message);
								forget2();
							}else{
								//不合法
								layer.msg(data.message, {icon: 2});
							}
						},
						error : function(data, type, err) {
								console.log("ajax错误类型："+type);
								console.log(err); 
							}
						});
				  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
				});
			  
			  form.on('submit(forget2)', function(data){
				  var emailvalidcode = $("#emailvalidcode").val();
				  $.ajax({
						url : "/itdage-show/user/validEmailCode",
						dataType : "json",
						type : "GET",
						data : {"code":emailvalidcode},
						async: false,
						success : function(data) {
							if (data.state == 1) {
								//layer.msg(data.message);
								modifyPassword();
							}else{
								//验证码不正确
								layer.msg(data.message, {icon: 2});
							}
						},
						error : function(data, type, err) {
								console.log("ajax错误类型："+type);
								console.log(err); 
							}
						});
				  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
				});
			  
			  //修改密码
			  form.on('submit(modifyPass)', function(data){
				  var username = $("#email_username").val();
				  var password = $("#password").val();
				  $.ajax({
						url : "/itdage/user2/updateUser/1",
						dataType : "json",
						type : "POST",
						data : {"username":username, "password":password},
						success : function(data) {
							if (data.state == 1) {
								//成功,关闭页面
								//layer.alert('修改成功!');
								layer.confirm('修改成功!', {icon: 1, title:'提示'}, function(index){
									window.location.href = "/itdage-show/login.jsp";
  									layer.close(index);
									});
							}else{
								layer.msg('修改失败!', {
									icon : 2
								});
							}
						},
						error : function(data, type, err) {
							layer.msg("修改失败!");
							console.log("ajax错误类型："+type);  
				            console.log(err);  
						}
					});
				  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
				});
			  //验证
			  form.verify({
					user : function(value) {
						if (value.length <= 0) {
							return '账号不能为空!';
						}else if(value.length > 18){
							return '账号不合法!';
						} else {
							var check = validateUsername(value);
							if (check == 1) {
								//用户已经存在
								return '用户已存在!';
							}
						}
					},
					password : [ /(.+){6,12}$/, '密码必须6到12位' ],
					confrim_pass : function(value) {
						var passvalue = $("#password").val();
						if (passvalue != value) {
							return '两次密码不一致!';
						}
					}
				});
			});
		function validateUsername(username){
			var check = 0;
			 $.ajax({
					url : "/itdage-show/user/get",
					dataType : "json",
					type : "GET",
					data : {"username":username},
					async : false,
					success : function(data) {
						if (data.state == 1) {
							//不存在此用户
							check = 1;
						}else{
							check = 0;
						}
					},
					error : function(data, type, err) {
							console.log("ajax错误类型："+type);
							console.log(err); 
						}
					});
			 return check;
		}