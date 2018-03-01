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
	 * 获取评论比较多的前4个Card
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
	 * 第一页 传入page = 1
	 * 分页获取根据发布时间顺序的帖子
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
	 * 第一页 传入page = 1
	 * 分页获取某一用户的所有帖子
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
	 * 获取一个帖子
	 */
	public Card getCard(int cardId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Card card = (Card)session.get(Card.class, cardId);
		return card;
	}

	/**
	 * 保存一个帖子
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
	 * 获取全部帖子总条数
	 */
	public int getAllCount() {
		// TODO Auto-generated method stub
		Session session = getSession();
		String hql = "select count(*) from Card where isCardDelete <> 1 ";
		int count = Integer.parseInt(session.createQuery(hql).uniqueResult().toString());
		return count;
	}

	/**
	 * 获取单个用户全部帖子总条数
	 */
	public int getUserCount(int userId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		String hql = "select count(*) from Card where isCardDelete <> 1 and userId = " + userId;
		int count = Integer.parseInt(session.createQuery(hql).uniqueResult().toString());
		return count;
	}

	/**
	 * 用户删除某一帖子
	 * 其实就是把 isCardDelete 字段变为1
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
