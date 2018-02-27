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
	 * 测试获取数据总数
	 * @throws SQLException
	 */
	@Test
	public void testCount() throws SQLException{
		System.out.println(cxt);
		UserDao a =cxt.getBean(UserDao.class);
		System.out.println(a);
		
		System.out.println(a.count());
	}
	
	@Test
	public void testSaveUser(){
		UserDao a =cxt.getBean(UserDao.class);
		User user = new User("aaa","aaa","aaa","aaa");
		a.saveUser(user);
		//System.out.println(a.count());
	}
}
