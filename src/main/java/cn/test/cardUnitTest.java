package cn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.dao.CardDao;
import cn.dao.UserDao;
import cn.model.Card;

public class cardUnitTest {
	private ApplicationContext cxt=null;
	{
		cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testSaveCard(){
		CardDao a =cxt.getBean(CardDao.class);
		UserDao user =cxt.getBean(UserDao.class);
		System.out.println(user.getUser(2));
		Long time = System.currentTimeMillis();
		Card card = new Card(String.valueOf(time),0,(byte) 0,"ÄÚÈÝÄÚÈÝ",user.getUser(2));
		a.saveCard(card);
	}
	
	@Test
	public void testGetCard(){
		CardDao a =cxt.getBean(CardDao.class);
		Card card = a.getCard(2);
		System.out.println(card);
	}
	
	@Test
	public void testGetTimeCard(){
		CardDao a =cxt.getBean(CardDao.class);
		System.out.println(a.getTimeCard(1));
	}
	
	@Test
	public void testGetUserCard(){
		CardDao a =cxt.getBean(CardDao.class);
		System.out.println(a.getUserCard(2,1));
	}
	
	@Test
	public void testGetHotCard(){
		CardDao a =cxt.getBean(CardDao.class);
		System.out.println(a.getHotCard());
	}
	@Test
	public void testGetAllCount(){
		CardDao a =cxt.getBean(CardDao.class);
		System.out.println(a.getAllCount());
	}
	
	@Test
	public void testGetUserCount(){
		CardDao a =cxt.getBean(CardDao.class);
		System.out.println(a.getUserCount(2));
	}
	
	@Test
	public void testDeletewCard(){
		CardDao a =cxt.getBean(CardDao.class);
		System.out.println(a.deleteCard(7));
	}
	
	@Test
	public void testGoodCard(){
		CardDao a =cxt.getBean(CardDao.class);
		System.out.println(a.goodCard(8));
	}
}
