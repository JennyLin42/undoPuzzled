package cn.dao;

import java.util.List;

import cn.model.User;


public interface UserDao {
	
	//��ȡ�û�������Ϣ
	public User getUser(int userId);
	//����user
	public void saveUser(User user);
	//��ѯ�û��Ƿ����,����½
	public User login(User user);
	
	
	//��ȡuser����
    public List count();

}
