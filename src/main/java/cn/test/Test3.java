package cn.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import cn.util.sensitive.CharByteConverter;
import cn.util.sensitive.ZHConverter;


/**
 * 测试构建字典树
 * 
 * @author 林飘飘
 *
 */
public class Test3 {
	public static HashMap rootNode; //字典树
	public static HashMap translate;//繁体变成简体
	
	public static void main(String[] args) {
		Set<String> keyWordSet = new TreeSet();
		//敏感字符中有英文字母的都是小写
		keyWordSet.add("日本");
		keyWordSet.add("日本鬼子");
		keyWordSet.add("fuck");
		keyWordSet.add("评论认为");
		rootNode =  (HashMap) addSensitiveWordToHashMap(keyWordSet);
		System.out.println(rootNode);
		boolean a = filter("我評論認為是fucK搁ｆｕｃｋ置的ｆｕｃ日毛泽評論东本人日");
		System.out.println(a);
	}
	
	/**
	 * 生成字典树
	 * @param keyWordSet
	 * @return
	 */
	 public static Map addSensitiveWordToHashMap(Set<String> keyWordSet) {  
	        Map sensitiveWordMap = new HashMap(keyWordSet.size());     //初始化敏感词容器，减少扩容操作  
	        String key = null;    
	        Map nowMap = null;  
	        Map<String, String> newWorMap = null;  
	        //迭代keyWordSet  
	        Iterator<String> iterator = keyWordSet.iterator();  
	        while(iterator.hasNext()){  
	            key = iterator.next();    //关键字  
	            nowMap = sensitiveWordMap;  
	            for(int i = 0 ; i < key.length() ; i++){  
	                char keyChar = key.charAt(i);       //转换成char型  
	                Object wordMap = nowMap.get(keyChar);       //获取  
	                  
	                if(wordMap != null){        //如果存在该key，直接赋值  
	                    nowMap = (Map) wordMap;  
	                } else{     //不存在则，则构建一个map，同时将isEnd设置为0，因为他不是最后一个  
	                    newWorMap = new HashMap<String,String>();  
	                    newWorMap.put("isEnd", "0");     //不是最后一个  
	                    nowMap.put(keyChar, newWorMap);  
	                    nowMap = newWorMap;  
	                }  
	                  
	                if(i == key.length() - 1){  
	                    nowMap.put("isEnd", "1");    //最后一个  
	                }  
	            }  
	        }  
	        
	        return sensitiveWordMap;
	    }  
	 
	 
	 /**
	  * 过滤敏感词
	  */
	 public static boolean filter(String text) {
	     if (text == null) {
	         return false;
	     }
	     String replacement = "*";
	    //StringBuilder result = new StringBuilder();

	     HashMap tempNode = rootNode;
	     int begin = 0; // 回滚数
	     int position = 0; // 当前比较的位置
	     while (position < text.length()) {
	         char c = text.charAt(position);
	         c = charConvert(c);//把所有都变成小写
	         c = TransletChinese(c+"");//把繁体转成简体
	         c = CharConverter(c+"");//把全角转成半角
	         tempNode = (HashMap) tempNode.get(c);
	         if (tempNode == null) {
	        	 position++;
	             tempNode = rootNode;  // 回到树初始节点
	         } else if (tempNode.get("isEnd") == "1") {
	        	 return true;
	         } else { //还不确定是不是敏感词
	             position++;
	         }
	     }
	     //result.append(text.substring(begin));
	     return false;
	 }

	 /**
	  * 解决大小写问题(已经插入程序)
	  */
	 public static char charConvert(char r){
		 /*String newStr = "";
		 for(char r :str.toCharArray()){
			 if(r >= 'A' && r <='Z'){
				 newStr = newStr+(r+32);
			 } else {
				 newStr = newStr+r;
			 }
		 }*/
		 return (char) ((r >= 'A' && r <='Z')? r+32:r);
	 }
	 
	 /**
	  * 繁体字变成简体字
	  * @param str
	  * @return
	  */
	 public static char TransletChinese(String str){
		 ZHConverter converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);
	     String simplified = converter.convert(str);
	     return simplified.charAt(0);
	 }
	 
	 
	 /**
	  * 解决将８１４乡道阿斯蒂芬１２３  变为 814乡道阿斯蒂芬123
	  */
	 public static char CharConverter(String str){
		 return CharByteConverter.ToDBC(str).charAt(0);
	 }
}
