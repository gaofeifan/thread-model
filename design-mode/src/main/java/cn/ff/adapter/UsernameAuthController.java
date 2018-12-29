package cn.ff.adapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cn.ff.common.ResMes;

public class UsernameAuthController implements Login{
	private static Map<String, Object> map = null;
	static {
		map = new HashMap<>();
		map.put("zhangsan", "zhangsan");
		map.put("lisi", "lisi");
		map.put("wangwu", "wangwu");
	}

	public ResMes login(String username, String password) {
		ResMes mes = new ResMes();
		if (username != null) {
			Object object = map.get(username);
			if (object == null) {
				mes.setCode(501);
				mes.setMes("用户不存在");
			} else {
				if (!password.equals(object.toString())) {
					mes.setCode(502);
					mes.setMes("用户密码错误");
				} else {
					mes.setCode(200);
					mes.setMes("登录成功");
					mes.setData(username);
				}
			}
		}
		return mes;
	}
	
	public ResMes register(String username , Object pasword) {
		ResMes mes = new ResMes();
		Object object = map.get(username);
		if(object != null) {
			mes.setCode(504);
			mes.setMes("用户已被注册");
			return mes;
		}
		map.put(username, pasword);
		mes.setCode(200);
		mes.setMes("用户注册成功");
		mes.setData(map.get(username));
		return mes;
		
	}
	
	
	public Object getMap(String key){
		return map.get(key);
	}
	
	public void setMap(String key , String value) {
		map.put(key, value);
	}

}
