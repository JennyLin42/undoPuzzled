package cn.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.util.StringUtils;

import cn.dao.CardDao;
import cn.model.Card;
import cn.util.StringUtil;

public class CardAction {
	private CardDao cardDao;
	private int page = 0;
	
	public List<Card> getTimeCard(){
		HttpServletResponse response = ServletActionContext.getResponse();  
		HttpServletRequest request = ServletActionContext.getRequest();  
		response.setContentType("text/html;charset=utf-8"); 
		
		String currentPage = request.getParameter("page");
		List<Card> cards = null;
		if(StringUtils.hasText(currentPage)){
		    cards = cardDao.getTimeCard(StringUtil.toInteger(currentPage, 0));
		} else {
			cards = cardDao.getTimeCard(page);
		}
		
		
		
		return cards;
	}

	
	
	
	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		this.cardDao = cardDao;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	
}
