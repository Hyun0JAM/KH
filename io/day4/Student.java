package io.day4;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 4941969150150275291L;
	private String name;
	private int age;
	private String addr;
	
	public Student() {}
	public Student(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString() {
		return "\n1. 학생명 : "+name+"\n2. 나이 : "+age+"\n3. 주소 : "+addr;
	}
}
