package net.dfrz.entity;

import javax.validation.constraints.Size;

public class User {

	private String userName;
	private String password;
	

	@Size(min=6,max=10,message="�û������Ȳ�����Ҫ��")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
