package cn.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import cn.util.ReadWord;
import cn.util.sensitive.CharByteConverter;
import cn.util.sensitive.ZHConverter;


/**
 * 娴嬭瘯鏋勫缓瀛楀吀鏍�
 * 
 * @author 鏋楅椋�
 *
 */
public class Test2 {
	public static HashMap rootNode; //瀛楀吀鏍�
	public static HashMap translate;//绻佷綋鍙樻垚绠�浣�
	
	public static void main(String[] args) {
		
		
		
		
		Set keyWordSet = ReadWord.getSet();
		//鏁忔劅瀛楃涓湁鑻辨枃瀛楁瘝鐨勯兘鏄皬鍐�
		/*keyWordSet.add("鏃ユ湰");
		keyWordSet.add("鏃ユ湰楝煎瓙");
		keyWordSet.add("fuck");
		keyWordSet.add("璇勮璁や负");*/
		System.out.println(keyWordSet);
		rootNode =  (HashMap) addSensitiveWordToHashMap(keyWordSet);
		System.out.println(rootNode);
		String a = filter("我評論認為是fucK搁ｆｕｃｋ置的ｆｕｃ日毛泽評論东本人日");
		System.out.println(a);
	}
	
	/**
	 * 鐢熸垚瀛楀吀鏍�
	 * @param keyWordSet
	 * @return
	 */
	 public static Map addSensitiveWordToHashMap(Set<String> keyWordSet) {  
	        Map sensitiveWordMap = new HashMap(keyWordSet.size());     //鍒濆鍖栨晱鎰熻瘝瀹瑰櫒锛屽噺灏戞墿瀹规搷浣�  
	        String key = null;    
	        Map nowMap = null;  
	        Map<String, String> newWorMap = null;  
	        //杩唬keyWordSet  
	        Iterator<String> iterator = keyWordSet.iterator();  
	        while(iterator.hasNext()){  
	            key = iterator.next();    //鍏抽敭瀛�  
	            nowMap = sensitiveWordMap;  
	            for(int i = 0 ; i < key.length() ; i++){  
	                char keyChar = key.charAt(i);       //杞崲鎴恈har鍨�  
	                Object wordMap = nowMap.get(keyChar);       //鑾峰彇  
	                  
	                if(wordMap != null){        //濡傛灉瀛樺湪璇ey锛岀洿鎺ヨ祴鍊�  
	                    nowMap = (Map) wordMap;  
	                } else{     //涓嶅瓨鍦ㄥ垯锛屽垯鏋勫缓涓�涓猰ap锛屽悓鏃跺皢isEnd璁剧疆涓�0锛屽洜涓轰粬涓嶆槸鏈�鍚庝竴涓�  
	                    newWorMap = new HashMap<String,String>();  
	                    newWorMap.put("isEnd", "0");     //涓嶆槸鏈�鍚庝竴涓�  
	                    nowMap.put(keyChar, newWorMap);  
	                    nowMap = newWorMap;  
	                }  
	                  
	                if(i == key.length() - 1){  
	                    nowMap.put("isEnd", "1");    //鏈�鍚庝竴涓�  
	                }  
	            }  
	        }  
	        return sensitiveWordMap;
	    }  
	 
	 
	 /**
	  * 杩囨护鏁忔劅璇�
	  */
	 public static String filter(String text) {
	     if (text == null) {
	         return text;
	     }
	     String replacement = "*";
	     StringBuilder result = new StringBuilder();
	     HashMap tempNode = rootNode;
	     int begin = 0; // 鍥炴粴鏁�
	     int position = 0; // 褰撳墠姣旇緝鐨勪綅缃�
	     while (position < text.length()) {
	         char c = text.charAt(position);
	         c = charConvert(c);//鎶婃墍鏈夐兘鍙樻垚灏忓啓
	         c = TransletChinese(c+"");//鎶婄箒浣撹浆鎴愮畝浣�
	         c = CharConverter(c+"");//鎶婂叏瑙掕浆鎴愬崐瑙�
	         tempNode = (HashMap) tempNode.get(c);
	         if (tempNode == null) {
	             result.append(text.charAt(begin));
	             // 璺冲埌涓嬩竴涓瓧绗﹀紑濮嬫祴璇�
	             position = begin + 1;
	             begin = position;
	             // 鍥炲埌鏍戝垵濮嬭妭鐐�
	             tempNode = rootNode;
	         } else if (tempNode.get("isEnd") == "1") {
	             // 鍙戠幇鏁忔劅璇嶏紝 浠巄egin鍒皃osition鐨勪綅缃敤replacement鏇挎崲鎺�
	             result.append(replacement);
	             position = position + 1;
	             begin = position;
	             tempNode = rootNode;
	         } else { //杩樹笉纭畾鏄笉鏄晱鎰熻瘝
	             ++position;
	         }
	     }
	     result.append(text.substring(begin));
	     return result.toString();
	 }

	 /**
	  * 瑙ｅ喅澶у皬鍐欓棶棰�(宸茬粡鎻掑叆绋嬪簭)
	  */
	 public static char charConvert(char r){
		 return (char) ((r >= 'A' && r <='Z')? r+32:r);
	 }
	 
	 /**
	  * 绻佷綋瀛楀彉鎴愮畝浣撳瓧
	  * @param str
	  * @return
	  */
	 public static char TransletChinese(String str){
		 ZHConverter converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);
	     String simplified = converter.convert(str);
	     return simplified.charAt(0);
	 }
	 
	 
	 /**
	  * 瑙ｅ喅灏嗭紭锛 戯紨涔￠亾闃挎柉钂傝姮锛戯紥锛�  鍙樹负 814涔￠亾闃挎柉钂傝姮123
	  */
	 public static char CharConverter(String str){
		 return CharByteConverter.ToDBC(str).charAt(0);
	 }
}
