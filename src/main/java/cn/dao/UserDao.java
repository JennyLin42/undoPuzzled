package cn.dao;

import java.util.List;

import cn.model.User;


public interface UserDao {
	//��ȡ�û�������Ϣ
	public User getUser(int userId);
	//��ȡuser����
	public List count();
	//����user
	public void saveUser(User user);

}
