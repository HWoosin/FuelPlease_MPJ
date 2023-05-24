package com.spring.fuelplease.voCenter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 create table users (
	user_id varchar(50) primary key,
    user_pw varchar(500) not null,
    user_name varchar(50) not null,
    user_phone1 varchar(50),
    user_phone2 varchar(50),
    user_email1 varchar(50),
    user_email2 varchar(50),
    user_addr varchar(300),
    addr_detail varchar(300),
	zip_cd varchar(50)
);
 */

@Getter
@Setter
@ToString
public class UserVO {
	private String userId; 
	private String userPw; 
	private String userName; 
	private String userPhone1; 
	private String userPhone2; 
	private String userEmail1; 
	private String userEmail2; 
	private String userAddr; 
	private String addrDetail; 
	private String zipCd; 
}
