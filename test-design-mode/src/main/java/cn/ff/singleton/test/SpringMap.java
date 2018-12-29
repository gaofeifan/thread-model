package cn.ff.singleton.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SpringMap {

	private SpringMap() {};
	
	private static Map<String,Object> map = new ConcurrentHashMap<>();
	
	public static SpringMap getInstance(String name){
		if(name == null) {
			name = SpringMap.class.getName();
		}
		if(map.get(name) == null) {
			map.put(name, new ConcurrentHashMap<String,Object>());
		}
		return (SpringMap)map.get(name);
		
		
	}
	
}
