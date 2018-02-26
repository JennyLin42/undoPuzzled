package cn.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.model.Card;
import cn.model.Comment;
import cn.model.User;

public class test {
	public static void main(String[] args) {
		//1.加载配置文件
		  Configuration cfg=new Configuration().configure();
		  //2.获得sessionfactory
		  Configuration configuration = new Configuration().configure();
		  
		  SessionFactory sf = configuration.buildSessionFactory();
		  //SessionFactory sf=cfg.buildSessionFactory(serviceRegistry);
		  //3.创建session
		  Session session=sf.openSession();
		  //4.创建事务
		  Transaction tx=session.beginTransaction();
		  //5.操作
		  User a = (User)session.get(User.class, 1);
		  System.out.println(a);
		  Card aa = (Card)session.get(Card.class, 1);
		  System.out.println(aa);
		  Comment aaa = (Comment)session.get(Comment.class, 1);
		  System.out.println(aaa);
		  //6.提交 回滚
		  tx.commit();//tx.rollback();
		  //7.释放资源
		  session.close();
		  sf.close();
	} 
}
