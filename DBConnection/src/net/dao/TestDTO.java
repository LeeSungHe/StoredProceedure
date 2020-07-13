package net.dao;

import java.sql.Date;

public class TestDTO {

	
	 private int    CODE ; 
	 private String NAME ; 
	 private String TITLE; 
	 private Date   WDATE; 
	 private int    CNT  ;
	public int getCODE() {
		return CODE;
	}
	public void setCODE(int cODE) {
		CODE = cODE;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public Date getWDATE() {
		return WDATE;
	}
	public void setWDATE(Date wDATE) {
		WDATE = wDATE;
	}
	public int getCNT() {
		return CNT;
	}
	public void setCNT(int cNT) {
		CNT = cNT;
	}
	
	 
	
	
}
