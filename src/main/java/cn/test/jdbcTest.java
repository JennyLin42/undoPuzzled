package cn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTest {
	public static void main(String[] args) {
	   /* String name="com.mysql.jdbc.Driver";///加载jdbc driver
        String url="jdbc:mysql://123.207.96.247:3306/undoPuzzled";  //连接到172.20.0.73上的jilei的mysql数据库
        try {
			Class.forName(name);
			Connection con=DriverManager.getConnection(url,"root","123456");//创建连接
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//创建类
*/        
		 // 注册驱动
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// 获得链接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/undoPuzzled", "root", "123456");
			System.out.println("链接connection "+conn);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
