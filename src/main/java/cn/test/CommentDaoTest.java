package cn.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.dao.CommentDao;
import cn.model.Card;
import cn.model.Comment;
import cn.model.User;

public class CommentDaoTest {
	private ApplicationContext cxt=null;
	{
		cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
	}


	@Test
	public void testGetComment(){
		CommentDao a =cxt.getBean(CommentDao.class);
		List<Comment> comments = a.getComment(1);
		System.out.println(comments);
	}

	@Test
	public void testSaveComment(){
		CommentDao a =cxt.getBean(CommentDao.class);
		Comment comment = new Comment(3,"评论内容","时间戳",(byte)0,new Card(1),new User(1));
		boolean aa = a.saveComment(comment);
		System.out.println(aa);
	}
	
	@Test
	public void testDeleteComment(){
		CommentDao a =cxt.getBean(CommentDao.class);
		boolean aa = a.deleteComment(2);
		System.out.println(aa);
	}
	
	@Test
	public void testDeleteCommentByCard(){
		CommentDao a =cxt.getBean(CommentDao.class);
		boolean aa = a.deleteCommentByCard(1);
		System.out.println(aa);
	}
}
