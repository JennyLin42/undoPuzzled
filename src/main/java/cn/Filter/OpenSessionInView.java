package cn.Filter;
/**
 * ÷Œ¡∆¿¡º”‘ÿµƒ¿πΩÿ∆˜
 */
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;

import cn.util.SessionUtil;

/**
 * Servlet Filter implementation class OpenSessionInView
 */
public class OpenSessionInView  extends SessionUtil implements Filter {

    /**
     * Default constructor. 
     */
    public OpenSessionInView() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		try{
			Session session = getSession();
			chain.doFilter(request, response);
		}finally{
			getSession().close();
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
