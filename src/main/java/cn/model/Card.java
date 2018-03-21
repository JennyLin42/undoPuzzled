package cn.model;
/**
 * ����
 * @author ��ƮƮ
 *
 */
public class Card {
	public int cardId;//����ID
	//public int userId;//�����û�
	public String cartTimeDate;//���ӷ���ʱ��
	public int good;//�޵ĸ���
	public byte isCardDelete;
	public String cartContent;//��������
	public User user;
	
	
	
	public Card(int cardId) {
		super();
		this.cardId = cardId;
	}
	public Card() {
		super();
	}
	public Card(String cartTimeDate, int good, byte isCardDelete, String cartContent, User user) {
		super();
		this.cartTimeDate = cartTimeDate;
		this.good = good;
		this.isCardDelete = isCardDelete;
		this.cartContent = cartContent;
		this.user = user;
	}
	public Card(int cardId, String cartTimeDate, int good, byte isCardDelete, String cartContent, User user) {
		super();
		this.cardId = cardId;
		this.cartTimeDate = cartTimeDate;
		this.good = good;
		this.isCardDelete = isCardDelete;
		this.cartContent = cartContent;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cartTimeDate=" + cartTimeDate + ", good=" + good + ", isCardDelete="
				+ isCardDelete + ", cartContent=" + cartContent + ", user=" + user + "]";
	}
	public byte getIsCardDelete() {
		return isCardDelete;
	}
	public void setIsCardDelete(byte isCardDelete) {
		this.isCardDelete = isCardDelete;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getCartTimeDate() {
		return cartTimeDate;
	}
	public void setCartTimeDate(String cartTimeDate) {
		this.cartTimeDate = cartTimeDate;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public String getCartContent() {
		return cartContent;
	}
	public void setCartContent(String cartContent) {
		this.cartContent = cartContent;
	}

}
