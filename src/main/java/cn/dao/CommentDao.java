package cn.dao;

import java.util.List;

import cn.model.Comment;

public interface CommentDao {
	//获取某一帖子的评论不分页
	public List<Comment> getComment(int cardId);
	
	//添加评论
	public boolean saveComment(Comment comment);
	
	//评论的用户删除单个评论
	public boolean deleteComment(int commentId);
	
	//删除帖子的时候删除该帖子的评论
	public boolean deleteCommentByCard(int cardId);
	
	

}
