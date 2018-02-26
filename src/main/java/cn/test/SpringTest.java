package cn.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	
	private ApplicationContext cxt=null;
	{
		cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	/**
	 * ≤‚ ‘ ˝æ›‘¥
	 * @throws SQLException
	 */
	@Test
	public void testDataSource() throws SQLException{
		System.out.println(cxt);
		DataSource dataSource=cxt.getBean(DataSource.class);
		System.out.println(dataSource);
		System.out.println(dataSource.getConnection());
	}
}
