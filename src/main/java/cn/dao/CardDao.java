package cn.dao;

import java.util.List;

import cn.model.Card;

public interface CardDao {
	//��ȡ��������(ǰ4��)
	public List<Card> getHotCard();
	
	//��ҳ��ȡ�շ��͵�����
	public List<Card> getTimeCard(int page);
	
	//��ҳ��ȡ��ȡ��������
	public List<Card> getUserCard(int userId,int page);
	
	//��ȡĳһ��������
	public Card getCard(int cardId);
	
	//����һ������
	public boolean saveCard(Card card);
	
	//��ȡȫ������������
	public int getAllCount();
	
	//��ȡ�����û�ȫ������������
	public int getUserCount(int userId);
	
	//ɾ������
	public boolean deleteCard(int cardId);
	
	//���޹���
	public boolean goodCard(int cardId);
}
