package com.itbank.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

/*
  	IDX      NOT NULL NUMBER        
	TITLE    NOT NULL VARCHAR2(150) 
	CONTENTS NOT NULL CLOB          
	V_COUNT           NUMBER        
	W_DATE            DATE          
	USER_IDX          NUMBER 
*/
@Getter
@Setter
public class BoardVO {
	private int idx, v_count, user_idx;
	private String title, contents;
	private Date w_date;
	private String nick;
}
