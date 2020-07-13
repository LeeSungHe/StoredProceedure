package net.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest  {
  Connection CN ; //DB서버정보및 user/pwd기억, CN참조해서 명령어생성
  Statement ST ;  //정적인명령어 ST=CN.createStatement(X);
  ResultSet RS ;  //조회한결과기억 RS=ST.executeQuery(select~),RS.next()
  String msg="쿼리문" ; 
  
  
	public DBTest() {
	 try{
     Class.forName("oracle.jdbc.driver.OracleDriver");
     String url="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
     CN=DriverManager.getConnection(url,"system","sh73014254");
     System.out.println("오라클연결성공success");
   }catch(Exception ex){
	   System.out.println("에러: "+ ex.toString() ); 
   }
	}//end
	
	public static void main(String[] args) {
	  String data="";
	 
	}//main end
}// class END








