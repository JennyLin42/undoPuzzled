package cn.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.dao.UserDao;
import cn.model.User;

public class userUnitTest {
	private ApplicationContext cxt=null;
	{
		cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	/**
	 * ��һ��û������Ĳ���
	 * @throws SQLException
	 */
	@Test
	public void testCount() throws SQLException{
		System.out.println(cxt);
		UserDao a =cxt.getBean(UserDao.class);
		System.out.println(a);
		
		System.out.println(a.count());
	}
	/**
	 * ����user
	 */
	@Test
	public void testSaveUser(){
		UserDao a =cxt.getBean(UserDao.class);
		User user = new User("aaa","aaa","aaa","aaa");
		a.saveUser(user);
	}
	
	@Test
	public void testGetUser(){
		System.out.println("-----getUser----");
		UserDao a =cxt.getBean(UserDao.class);
		System.out.println(a.getUser(1));
		
	}
	@Test
	public void testLogin(){
		System.out.println("-----Login----");
		User user = new User(1,"aaa","aaa","13631256158","aaa");
		UserDao a =cxt.getBean(UserDao.class);
		System.out.println(a.login(user));
	}
}
