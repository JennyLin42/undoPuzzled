package cn.util;

import org.springframework.util.StringUtils;

public class StringUtil {
	/**
	 * 转化成Integer
	 * @param str 
	 * @param def 默认
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
