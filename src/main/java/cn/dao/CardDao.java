package cn.dao;

import java.util.List;

import cn.model.Card;

public interface CardDao {
	//获取热门帖子(前4个)
	public List<Card> getHotCard();
	
	//分页获取刚发送的帖子
	public List<Card> getTimeCard(int page);
	
	//分页获取获取个人帖子
	public List<Card> getUserCard(int userId,int page);
	
	//获取某一帖子详情
	public Card getCard(int cardId);
	
	//保存一个帖子
	public boolean saveCard(Card card);
	
	//获取全部帖子总条数
	public int getAllCount();
	
	//获取单个用户全部帖子总条数
	public int getUserCount(int userId);
	
	//删除帖子
	public boolean deleteCard(int cardId);
	
	//点赞功能
	public boolean goodCard(int cardId);
}
