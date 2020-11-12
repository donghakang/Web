package com.ezen.entity;

// 기본생성자, 인자4개받는 생성자, setter & getter.
public class LoginEntity {
	private String id;
	private String pwd;
	private String name;
	private double point;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double d) {
		this.point = d;
	}

}
