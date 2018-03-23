package cn.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.util.StringUtils;

import com.opensymphony.xwork2.Action;

import cn.dao.CardDao;
import cn.model.Card;
import cn.util.StringUtil;

public class CardAction {
	private CardDao cardDao;
	private int page = 0;
	
	public String getTimeCard(){
		HttpServletRequest request = ServletActionContext.getRequest();  
		Map<String, Object> reMap = new HashMap<String, Object>();
		
		String currentPage = request.getParameter("page");
		List<Card> cards = null;
		if(StringUtils.hasText(currentPage)){
		    cards = cardDao.getTimeCard(StringUtil.toInteger(currentPage, 0));
		} else {
			cards = cardDao.getTimeCard(page);
		}
		
		request.setAttribute("data", cards);
		return Action.SUCCESS;
	}

	
	
	
	public CardDao getCardDao() {
		return cardDao;
	}

	public void setCardDao(CardDao cardDao) {
		System.out.println("≈‰÷√carddao");
		this.cardDao = cardDao;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	
}
