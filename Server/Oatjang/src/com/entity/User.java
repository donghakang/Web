package com.entity;

public class User {
	/*
	 * - uid      : User id number
	 * - id 	  : User id 
	 * - pw       : User password 
	 * - name     : User의 이름 
	 * - nickname : User의 닉네임 
	 * - birth    : User의 생년월일
	 * - phone    : User의 번호
	 * - addr     : User의 주소 
	 */
	private int uid;
	private String id;
	private String pw;
	private String name;
	private String nickname;
	private String birth;
	private String phone;
	private String addr;

	public User() {
		super();
	}

	public User(int uid, String id, String pw, String name, String nickname,
			String birth, String phone, String addr) {
		super();
		this.uid = uid;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nickname = nickname;
		this.birth = birth;
		this.phone = phone;
		this.addr = addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
