package cn.ff.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements Target {

	private Map<String,Target> map = new HashMap<>();
	
	public Leader(){
		map.put("高并发", new ZhangSan());
		map.put("分布式事物", new LiSI());
	}
	
	@Override
	public String doing(String command) {
		return map.get(command).doing(command);
	}

}
