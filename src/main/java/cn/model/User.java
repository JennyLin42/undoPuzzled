package cn.model;

import java.util.HashSet;

/**
 * �û�
 * @author ��ƮƮ
 *
 */
public class User {
	public int userId ;//�û�ID
	public String userName;//�û���
	public String address;//�û���ַ
	public String phone;//�ֻ�����
	public String headPicture;//ͷ���ַ
/*	public HashSet<Card> cards;//һ�Զ�
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", phone=" + phone
				+ ", headPicture=" + headPicture + ", cards=" + cards + "]";
	}
	public HashSet<Card> getCard() {
		return cards;
	}
	public void setCard(HashSet<Card> cards) {
		this.cards = cards;
	}*/
	
	
	public String getHeadPicture() {
		return headPicture;
	}
	public User(int userId) {
		super();
		this.userId = userId;
	}
	public User() {
		super();
	}
	public User(int userId, String userName, String address, String phone, String headPicture) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.phone = phone;
		this.headPicture = headPicture;
	}
	public User(String userName, String address, String phone, String headPicture) {
		super();
		this.userName = userName;
		this.address = address;
		this.phone = phone;
		this.headPicture = headPicture;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", phone=" + phone
				+ ", headPicture=" + headPicture + "]";
	}
	public void setHeadPicture(String headPicture) {
		this.headPicture = headPicture;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
