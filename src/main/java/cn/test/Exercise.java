package cn.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Exercise {

	private final static Log logger = LogFactory.getLog(Exercise.class);  
	  
    public static void main(String[] args) {  
        logger.debug("DEBUG ...");  
        logger.info("INFO ...");
        logger.error("ERROR ...");  
    	/*logger.trace("����trace��Ϣ");
        logger.debug("����debug��Ϣ");
        logger.info("����info��Ϣ");
        logger.warn("����warn��Ϣ");
        logger.error("����error��Ϣ");
        logger.fatal("����fatal��Ϣ");*/
    	
    }  

}
