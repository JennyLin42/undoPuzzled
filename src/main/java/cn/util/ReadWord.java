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
 * 读取敏感字符文件
 * @author 林飘飘
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
			//BufferedReader是可以按行读取文件  
			
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
			System.out.println("读取失败");  
		}
		return keyWordSet;
	}

}
