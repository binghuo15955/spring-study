package net.dfrz.entity;

import java.util.Date;

public class Student {
	private String stuID;
	private String name;
	private Date birthday;
	private String mobile;
	private String addr;
	
	
	public Student(String stuID, String name, Date birthday, String mobile, String addr) {
		this();
		this.stuID = stuID;
		this.name = name;
		this.birthday = birthday;
		this.mobile = mobile;
		this.addr = addr;
	}
	public Student() {
	}
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	
}
