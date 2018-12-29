package cn.ff.adapter;

import java.util.HashMap;
import java.util.Map;

import cn.ff.common.ResMes;

public class QQAuthController implements Login{

	private static Map<String,Object> qq = new HashMap<>();
	private UsernameAuthController usernameAuth = new UsernameAuthController();
	
	@Override
	public ResMes login(String username, String password) {
		Object object = qq.get(username);
		if(object == null) {
			System.out.println("注册新用户");
			qq.put(username, username);
		}
		Object usernameMap = usernameAuth.getMap(username);
		if(usernameMap == null) {
			usernameAuth.register(username, username);
		}
		return usernameAuth.login(username, username);
	}

	
}
