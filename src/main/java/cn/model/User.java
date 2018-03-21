package cn.model;

import java.util.HashSet;

/**
 * 用户
 * @author 林飘飘
 *
 */
public class User {
	public int userId ;//用户ID
	public String userName;//用户名
	public String address;//用户地址
	public String phone;//手机号码
	public String headPicture;//头像地址
/*	public HashSet<Card> cards;//一对多
	
	
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
