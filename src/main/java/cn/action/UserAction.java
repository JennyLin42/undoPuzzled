package cn.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.dao.UserDao;
import cn.model.User;


/**
 * 
 * @author ¡÷∆Æ∆Æ
 *
 */
public class UserAction extends BaseAction{
	private User user;
	
	public boolean Login(){
		HttpServletResponse response = ServletActionContext.getResponse();  
		HttpServletRequest request = ServletActionContext.getRequest();  
		response.setContentType("text/html;charset=utf-8"); 
		
		
		
		return true;
	}

}
