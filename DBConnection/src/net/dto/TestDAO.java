package net.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

import net.util.DBTest;

public class TestDAO {
	private Connection conn; 
	private Statement ST;  //정적인명령어 ST=CN.createStatement(X);
	
	public TestDAO() {

		// 생성자를 만들어준다.

		try {

			 Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이브로드
		     String url="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
		     conn=DriverManager.getConnection(url,"system","sh73014254");
		     System.out.println("오라클연결성공success 월요일");
		     System.out.println(url);
		} catch (Exception e) {

			e.printStackTrace();

		}

	}
	//등록하기
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
