package cn.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.dao.CommentDao;
import cn.model.Card;
import cn.model.Comment;
import cn.util.Constant;
import cn.util.SessionUtil;

public class CommentDaoImpl extends SessionUtil implements CommentDao{

	public List<Comment> getComment(int cardId) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql="from Comment where isCommentDelete <> 1  and cardId = "+cardId;
		Query query=session.createQuery(hql);
		query.setFirstResult(0)
		     .setMaxResults(Constant.pageSize);
		List<Card> cards=query.list();
		return null;
	}

	public boolean saveComment(Comment comment) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteComment(int commentId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteCommentByCard(int cardId) {
		// TODO Auto-generated method stub
		return false;
	}

}
