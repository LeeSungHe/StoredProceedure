package net.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest  {
  Connection CN ; //DB���������� user/pwd���, CN�����ؼ� ��ɾ����
  Statement ST ;  //�����θ�ɾ� ST=CN.createStatement(X);
  ResultSet RS ;  //��ȸ�Ѱ����� RS=ST.executeQuery(select~),RS.next()
  String msg="������" ; 
  
  
	public DBTest() {
	 try{
     Class.forName("oracle.jdbc.driver.OracleDriver");
     String url="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
     CN=DriverManager.getConnection(url,"system","sh73014254");
     System.out.println("����Ŭ���Ἲ��success");
   }catch(Exception ex){
	   System.out.println("����: "+ ex.toString() ); 
   }
	}//end
	
	public static void main(String[] args) {
	  String data="";
	 
	}//main end
}// class END








