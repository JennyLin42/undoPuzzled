package cn.dao;

import java.util.List;

import cn.model.User;


public interface UserDao {
	
	//获取用户个人信息
	public User getUser(int userId);
	//保存user
	public void saveUser(User user);
	//查询用户是否存在,即登陆
	public User login(User user);
	
	
	//获取user总数
    public List count();

}
