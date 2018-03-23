		
var url=window.location.href;
var id=url.indexOf('=');

/*if (id == -1){
	$(function() {
		login();
	});
} else{
	$(function() {
		register();
	});
}*/
		function login() {
			
			/*$("#LAY_ucm").empty();
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
								
									+ " </div>");*/
			
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
		