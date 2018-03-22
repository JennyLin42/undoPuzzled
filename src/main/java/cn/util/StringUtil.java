package cn.util;

import org.springframework.util.StringUtils;

public class StringUtil {
	/**
	 * ת����Integer
	 * @param str 
	 * @param def Ĭ��
	 * @return
	 */
	public static Integer toInteger(String str, Integer def){
		if (StringUtils.hasText(str)) {
			try {
				def = Integer.parseInt((str));
			} catch (Exception e) {
			}
		} 
		return def;
	}

}
