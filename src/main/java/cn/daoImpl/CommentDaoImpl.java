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
		List<Comment> comments=query.list();
		return comments;
	}

	public boolean saveComment(Comment comment) {
		// TODO Auto-generated method stub
		Session session=getSession();
		session.save(comment);
		return true;
	}

	public boolean deleteComment(int commentId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Comment comment = (Comment)session.get(Comment.class, commentId);
		comment.isCommentDelete = 1;
		session.update(comment);
		return true;
	}

	public boolean deleteCommentByCard(int cardId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		List<Comment> comments = getComment(cardId);
		for(Comment com: comments){
			com.isCommentDelete = 1;
			session.update(com);
		}
		return true;
	}

}
