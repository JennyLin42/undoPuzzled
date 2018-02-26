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
		//1.���������ļ�
		  Configuration cfg=new Configuration().configure();
		  //2.���sessionfactory
		  Configuration configuration = new Configuration().configure();
		  
		  SessionFactory sf = configuration.buildSessionFactory();
		  //SessionFactory sf=cfg.buildSessionFactory(serviceRegistry);
		  //3.����session
		  Session session=sf.openSession();
		  //4.��������
		  Transaction tx=session.beginTransaction();
		  //5.����
		  User a = (User)session.get(User.class, 1);
		  System.out.println(a);
		  Card aa = (Card)session.get(Card.class, 1);
		  System.out.println(aa);
		  Comment aaa = (Comment)session.get(Comment.class, 1);
		  System.out.println(aaa);
		  //6.�ύ �ع�
		  tx.commit();//tx.rollback();
		  //7.�ͷ���Դ
		  session.close();
		  sf.close();
	} 
}
