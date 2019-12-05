package net.dfrz.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement
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
	@XmlElement
	public String getStuID() {
		return stuID;
	}
	@XmlElement
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public Date getBirthday() {
		return birthday;
	}
	@XmlElement
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@XmlElement
	public String getMobile() {
		return mobile;
	}
	@XmlElement
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@XmlElement
	public String getAddr() {
		return addr;
	}
	@XmlElement
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
