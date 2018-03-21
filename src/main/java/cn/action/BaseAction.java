package cn.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.dao.CardDao;
import cn.dao.CommentDao;
import cn.dao.UserDao;

public class BaseAction {
	protected Log log = LogFactory.getLog(getClass());
	protected CardDao cardDao;
	protected CommentDao commentDao;
	protected UserDao userDao;
	
	
	public Log getLog() {
		return log;
	}
	public void setLog(Log log) {
		this.log = log;
	}
	public CardDao getCardDao() {
		return cardDao;
	}
	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}
	public CommentDao getCommentDao() {
		return commentDao;
	}
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public String toString() {
		return "BaseAction [log=" + log + ", cardDao=" + cardDao + ", commentDao=" + commentDao + ", userDao=" + userDao
				+ "]";
	}
	
	

}
