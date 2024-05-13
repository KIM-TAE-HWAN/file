package com.itbank.model.vo;

import java.sql.Date;

/*
 	IDX     NOT NULL NUMBER        
	USERID  NOT NULL VARCHAR2(300) 
	USERPW  NOT NULL VARCHAR2(300) 
	NICK    NOT NULL VARCHAR2(300) 
	EMAIL   NOT NULL VARCHAR2(100) 
	J_DATE           DATE          
	PROFILE NOT NULL NUMBER        
*/

public class AccountVO {
	private int idx, profile;
	private String userid, userpw;
	private String nick, email;
	private Date j_date;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getProfile() {
		return profile;
	}
	public void setProfile(int profile) {
		this.profile = profile;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJ_date() {
		return j_date;
	}
	public void setJ_date(Date j_date) {
		this.j_date = j_date;
	}
	
	
	
	
}
