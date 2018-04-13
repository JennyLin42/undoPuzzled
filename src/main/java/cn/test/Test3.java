package cn.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import cn.util.sensitive.CharByteConverter;
import cn.util.sensitive.ZHConverter;


/**
 * ���Թ����ֵ���
 * 
 * @author ��ƮƮ
 *
 */
public class Test3 {
	public static HashMap rootNode; //�ֵ���
	public static HashMap translate;//�����ɼ���
	
	public static void main(String[] args) {
		Set<String> keyWordSet = new TreeSet();
		//�����ַ�����Ӣ����ĸ�Ķ���Сд
		keyWordSet.add("�ձ�");
		keyWordSet.add("�ձ�����");
		keyWordSet.add("fuck");
		keyWordSet.add("������Ϊ");
		rootNode =  (HashMap) addSensitiveWordToHashMap(keyWordSet);
		System.out.println(rootNode);
		boolean a = filter("���uՓ�J����fucK��������õģ������ë���uՓ��������");
		System.out.println(a);
	}
	
	/**
	 * �����ֵ���
	 * @param keyWordSet
	 * @return
	 */
	 public static Map addSensitiveWordToHashMap(Set<String> keyWordSet) {  
	        Map sensitiveWordMap = new HashMap(keyWordSet.size());     //��ʼ�����д��������������ݲ���  
	        String key = null;    
	        Map nowMap = null;  
	        Map<String, String> newWorMap = null;  
	        //����keyWordSet  
	        Iterator<String> iterator = keyWordSet.iterator();  
	        while(iterator.hasNext()){  
	            key = iterator.next();    //�ؼ���  
	            nowMap = sensitiveWordMap;  
	            for(int i = 0 ; i < key.length() ; i++){  
	                char keyChar = key.charAt(i);       //ת����char��  
	                Object wordMap = nowMap.get(keyChar);       //��ȡ  
	                  
	                if(wordMap != null){        //������ڸ�key��ֱ�Ӹ�ֵ  
	                    nowMap = (Map) wordMap;  
	                } else{     //���������򹹽�һ��map��ͬʱ��isEnd����Ϊ0����Ϊ���������һ��  
	                    newWorMap = new HashMap<String,String>();  
	                    newWorMap.put("isEnd", "0");     //�������һ��  
	                    nowMap.put(keyChar, newWorMap);  
	                    nowMap = newWorMap;  
	                }  
	                  
	                if(i == key.length() - 1){  
	                    nowMap.put("isEnd", "1");    //���һ��  
	                }  
	            }  
	        }  
	        
	        return sensitiveWordMap;
	    }  
	 
	 
	 /**
	  * �������д�
	  */
	 public static boolean filter(String text) {
	     if (text == null) {
	         return false;
	     }
	     String replacement = "*";
	    //StringBuilder result = new StringBuilder();

	     HashMap tempNode = rootNode;
	     int begin = 0; // �ع���
	     int position = 0; // ��ǰ�Ƚϵ�λ��
	     while (position < text.length()) {
	         char c = text.charAt(position);
	         c = charConvert(c);//�����ж����Сд
	         c = TransletChinese(c+"");//�ѷ���ת�ɼ���
	         c = CharConverter(c+"");//��ȫ��ת�ɰ��
	         tempNode = (HashMap) tempNode.get(c);
	         if (tempNode == null) {
	        	 position++;
	             tempNode = rootNode;  // �ص�����ʼ�ڵ�
	         } else if (tempNode.get("isEnd") == "1") {
	        	 return true;
	         } else { //����ȷ���ǲ������д�
	             position++;
	         }
	     }
	     //result.append(text.substring(begin));
	     return false;
	 }

	 /**
	  * �����Сд����(�Ѿ��������)
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
	  * �����ֱ�ɼ�����
	  * @param str
	  * @return
	  */
	 public static char TransletChinese(String str){
		 ZHConverter converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);
	     String simplified = converter.convert(str);
	     return simplified.charAt(0);
	 }
	 
	 
	 /**
	  * ����������������˹�ٷң�����  ��Ϊ 814�����˹�ٷ�123
	  */
	 public static char CharConverter(String str){
		 return CharByteConverter.ToDBC(str).charAt(0);
	 }
}
