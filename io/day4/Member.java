package io.day4;

import java.io.Serializable;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	public int cnt=0;
	private String id;
	private String pw;
	private String name;
	
	public Member() {cnt++;}
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		cnt++;
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
	public Member login(String id, String pw) {
		if(this.id.equals(id)&&this.pw.equals(pw))
			return this;
		else return null;
	}
	public String toString() {
		System.out.println("- information ---------------");
		return "1. ID : "+id+"\n2. PW : "+pw+"\n3. NAME : "+name;
	}
}
