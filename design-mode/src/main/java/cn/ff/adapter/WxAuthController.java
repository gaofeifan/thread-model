package cn.ff.adapter;

import java.util.HashMap;
import java.util.Map;

import cn.ff.common.ResMes;

public class WxAuthController implements Login{
	
	private static final Map<String,Object> wx = new HashMap<>();
	private UsernameAuthController usernameAuth = new UsernameAuthController();
	
	@Override
	public ResMes login(String username, String password) {
		Object object = wx.get(username);
		if(object == null) {
			System.out.println("注册新用户");
			wx.put(username, username);
		}
		Object usernameMap = usernameAuth.getMap(username);
		if(usernameMap == null) {
			usernameAuth.register(username, username);
		}
		return usernameAuth.login(username, password);
	}
	
	
}
