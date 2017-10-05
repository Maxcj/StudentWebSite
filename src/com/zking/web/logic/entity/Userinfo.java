package com.zking.web.logic.entity;


//Userinfo���ʵ����(Entity)
public class Userinfo {
    private Integer userid;
    private String  username;
    private String  pwd;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "�û�id:" + userid + ", �û���:" + username + ",����:" + pwd + "\n";
	}
    
    
}
