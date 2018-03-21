package cn.dao;

import java.util.List;

import cn.model.Comment;

public interface CommentDao {
	//��ȡĳһ���ӵ����۲���ҳ
	public List<Comment> getComment(int cardId);
	
	//�������
	public boolean saveComment(Comment comment);
	
	//���۵��û�ɾ����������
	public boolean deleteComment(int commentId);
	
	//ɾ�����ӵ�ʱ��ɾ�������ӵ�����
	public boolean deleteCommentByCard(int cardId);
	
	

}
