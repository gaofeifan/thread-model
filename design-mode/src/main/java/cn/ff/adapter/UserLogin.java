package cn.ff.adapter;

import cn.ff.common.ResMes;

public class UserLogin {

	private String username;
	
	private String password;
	
	private ResMes mes;
	
	public void login(String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	public ResMes getLogin() {
		return mes;
	}
	
	public void LoginType(LoginType loginType) {
		mes = loginType.get().login(username, password);
	}
	
	public void LoginType(int code) {
		mes = LoginType.get(code).login(username, password);
	}
	
}
