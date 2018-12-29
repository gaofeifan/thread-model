package cn.ff.adapter;

import java.util.HashMap;
import java.util.Map;

import cn.ff.common.ResMes;

public class MobileAuthController implements Login {

	private UsernameAuthController  usernameAuth = new UsernameAuthController();
	private static Map<String ,String> mobileMap = new HashMap<>();
	
	@Override
	public ResMes login(String username, String password) {
		ResMes mes = new ResMes();
		Object object = usernameAuth.getMap(username);
		if(object == null) {
			usernameAuth.register(username, username);
		}
		String code = getCode(username);
		if(code == null) {
			mes.setCode(405);
			mes.setMes("验证码失效");
			return mes;
		}
		if(!code.equals(password)) {
			mes.setCode(406);
			mes.setMes("验证码有误");
			return mes;
		}
		mobileMap.remove(username);
		return usernameAuth.login(username, username);
	}
	
	public String getCode(String mobile) {
		return mobileMap.get(mobile);
	}
	
	public void setCode(String mobile,String code) {
		mobileMap.put(mobile,code);
	}

}
