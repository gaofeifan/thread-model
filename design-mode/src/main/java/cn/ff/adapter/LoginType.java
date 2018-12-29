package cn.ff.adapter;

public enum LoginType {

	QQ_LOGIN(1,new QQAuthController()),
	WX_LOGIN(2,new WxAuthController()),
	USERNAME_LOGIN(3,new UsernameAuthController()),
	MOBILE_LOGIN(4,new MobileAuthController());
	
	private int code;
	private Login login;
	
	private LoginType(int code, Login login) {
		this.code = code;
		this.login = login;
	}
	private LoginType(Login login) {
		this.login = login;
	}

	public Login get() {
		return login;
	}
	
	public static Login get(int code) {
		for (LoginType type : LoginType.values()) {
			if(type.code == code) {
				return type.login;
			}
		}
		return null;
	}
	
}
