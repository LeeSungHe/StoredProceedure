package net.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

import net.util.DBTest;

public class TestDAO {
	private Connection conn; 
	private Statement ST;  //�����θ�ɾ� ST=CN.createStatement(X);
	
	public TestDAO() {

		// �����ڸ� ������ش�.

		try {

			 Class.forName("oracle.jdbc.driver.OracleDriver"); //����̺�ε�
		     String url="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
		     conn=DriverManager.getConnection(url,"system","sh73014254");
		     System.out.println("����Ŭ���Ἲ��success ������");
		     System.out.println(url);
		} catch (Exception e) {

			e.printStackTrace();

		}

	}
	//����ϱ�
	public int write(int code, String name, String title) {
		String sql = "INSERT INTO test VALUES(?, ?, ? ,sysdate, ?)";
		System.out.println("sql : " + sql);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			System.out.println(pstmt);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;
	}
	
}
