package cn.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.dao.UserDao;
import cn.model.User;
import cn.util.SessionUtil;

public class UserDaoImpl extends SessionUtil implements UserDao{

	/**
	 * ��ȡ�û���Ϣ
	 */
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		System.out.println("-----getSession----");
		Session session = getSession();
        User user = (User)session.get(User.class, userId);
		return user;
	}

	/**
	 * �����û���Ϣ
	 */
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		Session session = getSession();
		session.save(user);
	}

	/**
	 * ��ѯ�Ƿ���ڸ��û�
	 */
	public User login(User user) {
		// TODO Auto-generated method stub
		Session session = getSession();
		User currentUser = null;
		String hql="from User where phone = "+user.getPhone();
		Query query=session.createQuery(hql);
		List<User> users=query.list();
		if(users.size() >0){
			currentUser = users.get(0);
		}
		return currentUser;
	}
    /**
     * ͳ�Ƹ���
     */
    public List count() {
        String hql = "From User";
        Session session = this.getSession();
        System.out.println(session);
        //List list = getHibernateTemplate().find(hql);
        //int count = Integer.parseInt(list.get(0).toString());
        //Transaction tra = session.beginTransaction();
        User a = (User)session.get(User.class, 2);
        //tra.commit();
        //session.close();
		System.out.println(a);
        return new ArrayList();
    }
}
