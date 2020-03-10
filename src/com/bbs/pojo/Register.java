package com.bbs.pojo;

public class Register {
	private String userId;//账户
	private String userPsw;//密码
	private String userAlice;//昵称
	private String userEmail;//邮箱
	private String userSex;//性别
	public Register() {}
	public Register(String userId, String userPsw, String userAlice, String userEmail, String userSex) {
		super();
		this.userId = userId;
		this.userPsw = userPsw;
		this.userAlice = userAlice;
		this.userEmail = userEmail;
		this.userSex = userSex;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPsw() {
		return userPsw;
	}
	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}
	public String getUserAlice() {
		return userAlice;
	}
	public void setUserAlice(String userAlice) {
		this.userAlice = userAlice;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	
}
