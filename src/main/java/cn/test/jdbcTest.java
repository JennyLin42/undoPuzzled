package cn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTest {
	public static void main(String[] args) {
	   /* String name="com.mysql.jdbc.Driver";///����jdbc driver
        String url="jdbc:mysql://123.207.96.247:3306/undoPuzzled";  //���ӵ�172.20.0.73�ϵ�jilei��mysql���ݿ�
        try {
			Class.forName(name);
			Connection con=DriverManager.getConnection(url,"root","123456");//��������
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//������
*/        
		 // ע������
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// �������
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/undoPuzzled", "root", "123456");
			System.out.println("����connection "+conn);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
