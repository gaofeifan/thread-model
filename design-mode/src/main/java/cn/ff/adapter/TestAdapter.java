package cn.ff.adapter;

import java.util.Date;

import cn.ff.common.ResMes;

public class TestAdapter {

	public static void main(String[] args) {
//		WxAuthController wx = new WxAuthController();
//		String openId = getOpenId();
//		ResMes mes = wx.login_wx(openId);
//		UsernameAuthController username = new UsernameAuthController();
//		ResMes login = username.login(openId, openId);
//		System.out.println(login);
//		System.out.println("===========================qq");
//		QQAuthController qq = new QQAuthController();
//		ResMes qqMes = qq.login_qq("1315697146");
//		System.out.println(qqMes);
//		ResMes mes2 = username.login("1315697146", "1315697146");
//		System.out.println(mes2);
		MobileAuthController mobileAuthController = new MobileAuthController();
		mobileAuthController.setCode("1851077030", "6699");
		UserLogin user = new UserLogin();
		user.login("1851077030", "6699");
		user.LoginType(4);
//		user.LoginType(LoginType.MOBILE_LOGIN);
		ResMes resMes = user.getLogin();
		System.out.println(resMes);
	}
	
	public static String getOpenId() {
		String openid = new Date().getTime()+"0000000000000000000000";
		System.out.println(openid);
		return openid.substring(0, 32);
		
		
	}
	
}
