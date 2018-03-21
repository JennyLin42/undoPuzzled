package cn.model;
/**
 * ����
 * @author ��ƮƮ
 *
 */
public class Comment {

	public int commentId;//����ID
	public String commentContent;//��������
	public String commentTimeDate;//ʱ�����ֵ
	public byte isCommentDelete;//
	public Card card;
	public User user;
	
	
	
	public Comment() {
		super();
	}
	public Comment(int commentId, String commentContent, String commentTimeDate, byte isCommentDelete) {
		super();
		this.commentId = commentId;
		this.commentContent = commentContent;
		this.commentTimeDate = commentTimeDate;
		this.isCommentDelete = isCommentDelete;
	}
	
	public Comment(int commentId, String commentContent, String commentTimeDate, byte isCommentDelete, Card card,
			User user) {
		super();
		this.commentId = commentId;
		this.commentContent = commentContent;
		this.commentTimeDate = commentTimeDate;
		this.isCommentDelete = isCommentDelete;
		this.card = card;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentContent=" + commentContent + ", commentTimeDate="
				+ commentTimeDate + ", isCommentDelete=" + isCommentDelete + ", card=" + card + ", user=" + user + "]";
	}
	public byte getIsCommentDelete() {
		return isCommentDelete;
	}
	public void setIsCommentDelete(byte isCommentDelete) {
		this.isCommentDelete = isCommentDelete;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCommentTimeDate() {
		return commentTimeDate;
	}
	public void setCommentTimeDate(String commentTimeDate) {
		this.commentTimeDate = commentTimeDate;
	}

}
