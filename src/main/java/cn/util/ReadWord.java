package cn.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Set;
import java.util.TreeSet;

/**
 * ��ȡ�����ַ��ļ�
 * @author ��ƮƮ
 *
 */
public class ReadWord {

	public static void main(String[] args) {
		System.out.println(getSet());
	}
	
	public static Set getSet(){
		FileInputStream inputStream = null;
		BufferedReader bufferedReader = null;
		Set<String> keyWordSet = new TreeSet();
		try{
			//BufferedReader�ǿ��԰��ж�ȡ�ļ�  
			
	        inputStream = new FileInputStream("d://Sensitive.txt");  
	        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));  
	              
	        String str = null;  
	        while((str = bufferedReader.readLine()) != null)  
	        {  
	        	keyWordSet.add(str);
	        }  
	        inputStream.close();
			bufferedReader.close(); 
		}catch(Exception e){
			System.out.println("��ȡʧ��");  
		}
		return keyWordSet;
	}

}
