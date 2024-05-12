package com.itbank.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

/*
	IDX     NOT NULL NUMBER        
	USERID  NOT NULL VARCHAR2(300) 
	USERPW  NOT NULL VARCHAR2(300) 
	NICK    NOT NULL VARCHAR2(300) 
	EMAIL   NOT NULL VARCHAR2(100) 
	J_DATE           DATE          
	PROFILE NOT NULL NUMBER 
*/

@Getter
@Setter
public class AccountVO {
	private int idx, profile;
	private String userid, userpw;
	private String nick, email;
	private Date j_date;
	
	
	
	
}
