package cn.daoImpl;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.dao.CardDao;
import cn.model.Card;
import cn.model.User;
import cn.util.Constant;
import cn.util.SessionUtil;

public class CardDaoImpl extends SessionUtil implements CardDao {

	/**
	 * ��ȡ���۱Ƚ϶��ǰ4��Card
	 */
	public List<Card> getHotCard() {
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql="from Card where isCardDelete <> 1  order by good desc";
		Query query=session.createQuery(hql);
		query.setFirstResult(0)
		     .setMaxResults(Constant.pageSize);
		List<Card> cards=query.list();
		return cards;
	}

	/**
	 * ��һҳ ����page = 1
	 * ��ҳ��ȡ���ݷ���ʱ��˳�������
	 */
	public List<Card> getTimeCard(int page) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql="from Card where isCardDelete <> 1 order by cartTimeDate desc";
		Query query=session.createQuery(hql);
		query.setFirstResult((page-1)*Constant.pageSize)
		     .setMaxResults(Constant.pageSize);
		List<Card> cards=query.list();
		return cards;
	}

	/**
	 * ��һҳ ����page = 1
	 * ��ҳ��ȡĳһ�û�����������
	 */
	public List<Card> getUserCard(int userId, int page) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql="from Card where isCardDelete <> 1 and userId ="+userId+" order by cartTimeDate desc";
		Query query=session.createQuery(hql);
		query.setFirstResult((page-1)*Constant.pageSize)
		     .setMaxResults(Constant.pageSize);
		List<Card> cards=query.list();
		return cards;
	}

	/**
	 * ��ȡһ������
	 */
	public Card getCard(int cardId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Card card = (Card)session.get(Card.class, cardId);
		return card;
	}

	/**
	 * ����һ������
	 */
	public boolean saveCard(Card card) {
		// TODO Auto-generated method stub
		try{
			Session session = getSession();
			session.save(card);
		}catch(Exception e){
			return false;
		}
		
		return true;
	}

	/**
	 * ��ȡȫ������������
	 */
	public int getAllCount() {
		// TODO Auto-generated method stub
		Session session = getSession();
		String hql = "select count(*) from Card where isCardDelete <> 1 ";
		int count = Integer.parseInt(session.createQuery(hql).uniqueResult().toString());
		return count;
	}

	/**
	 * ��ȡ�����û�ȫ������������
	 */
	public int getUserCount(int userId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String hql = "select count(*) from Card where isCardDelete <> 1 and userId = " + userId;
		int count = Integer.parseInt(session.createQuery(hql).uniqueResult().toString());
		return count;
	}

	/**
	 * �û�ɾ��ĳһ����
	 * ��ʵ���ǰ� isCardDelete �ֶα�Ϊ1
	 */
	public boolean deleteCard(int cardId) {
		// TODO Auto-generated method stub
		try{
			Session session = getSession();
			Card card = getCard(cardId);
			card.isCardDelete = 1;
			session.update(card);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	public boolean goodCard(int cardId) {
		// TODO Auto-generated method stub
		try{
			Session session = getSession();
			Card card = getCard(cardId);
			card.good = card.good+1;
			session.update(card);
		}catch(Exception e){
			return false;
		}
		return true;
	}

}
