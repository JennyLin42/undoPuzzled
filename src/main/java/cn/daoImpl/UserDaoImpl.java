package cn.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.dao.UserDao;
import cn.model.User;
import cn.util.SessionUtil;

public class UserDaoImpl extends SessionUtil implements UserDao{

	/**
	 * 获取用户信息
	 */
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
    /**
     * 统计个数
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

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		//Transaction tra = session.beginTransaction();
		session.save(user);
		//session.getTransaction().commit();
		//session.close();
	}

}
