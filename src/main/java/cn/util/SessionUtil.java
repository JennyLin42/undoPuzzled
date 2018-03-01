package cn.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SessionUtil {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println("�Ѿ�ע��SessionFactory");
		this.sessionFactory = sessionFactory;
	}
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
}
