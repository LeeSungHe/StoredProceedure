package net.tis.day06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBGuest_TIS {
	
	Connection cn = null;
	Statement st = null;
	PreparedStatement pst = null;
	CallableStatement cst = null;
	ResultSet rs = null;
	String msg="" ; 
	Scanner sc = new Scanner(System.in);
	
	
	public DBGuest_TIS() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		     String url="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
			cn = DriverManager.getConnection(url,"system","sh73014254");
			System.out.println("���� ���� - 2020�� 7�� 13�� ������");
			st = cn.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static void main(String[] args) {
		DBGuestTis db = new DBGuestTis();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.��� 2.��� 3.���� 4.���� >>>>>>>  ");
			int sel = sc.nextInt();
			if(sel==1) {
				
			}
		}

	}//end
	public void guestSelectAll( ) {//��ü���
		try {
		msg="select * from guest  order by sabun" ;
		rs = st.executeQuery(msg);
		while(rs.next()==true) {
			int s = rs.getInt("sabun");
			String n = rs.getString("name");
			String t = rs.getString("title");
			int p = rs.getInt("pay");
			String e = rs.getString("email");
		  System.out.println(s+"\t"+n+"\t"+t+"\t"+p+"\t"+e);
		}
		System.out.println("=============================================");
		}catch (Exception e) { System.out.println("��ü��ȸ����");}
	}//end--------------------
	

}
