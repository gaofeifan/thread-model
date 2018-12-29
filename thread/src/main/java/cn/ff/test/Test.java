package cn.ff.test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Test {
//	public static final String appid = "1d46bc15df4c4b6a9a5710183da916c1";
//	public static final String appSecret = "1e2e90b4f56d58352bfb6119190535d7";
//	public static final String group = "49936650";
	
	public static final String appid = "95b94e076c8546db9f329bbd8c0f2030";
	public static final String appSecret = "b36441d95239bc919eac75aa18c0c54b";
	public static final String group = "46004526";    //分组编号
	public static final String StallSn = "53567131";		// 车位锁编号
	public static final Integer action = 1; // 1 升 0降

	public static void main(String[] args) {
		
		System.out.println("=====================车位列表====================");
		long time = new Date().getTime();
		Map<String, Object> map4 = new TreeMap();
		map4.put("appId", appid);
		map4.put("timestamp", time);
		map4.put("serialNumber", StallSn);
		map4.put("sign", getSign(map4, appSecret));
		for (Entry<String, Object> entry : map4.entrySet()) {
			System.out.println(entry.getKey() + "========" + entry.getValue());
		}
		System.out.println("==============================================");
		System.out.println("=====================车位详情====================");
		Map<String, Object> map3 = new TreeMap();
		map3.put("appId", appid);
		map3.put("timestamp", time);
		map3.put("serialNumber", StallSn);
		map3.put("sign", getSign(map3, appSecret));
		for (Entry<String, Object> entry : map3.entrySet()) {
			System.out.println(entry.getKey() + "========" + entry.getValue());
		}
		System.out.println("==============================================");
		System.out.println("=====================根据网关查询=================");
		Map<String, Object> map = new TreeMap();
		map.put("appId", appid);
		map.put("timestamp", time);
		map.put("groupCode", group);
		map.put("sign", getSign(map, appSecret));
		for (Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "========" + entry.getValue());
		}
		System.out.println("==============================================");
		System.out.println("=====================升降调用===================");
		System.out.println("");
		long time2 = new Date().getTime();
		Map<String, Object> map2 = new TreeMap();
		map2.put("appId", appid);
		map2.put("action", 1);
		map2.put("timestamp", time2);
		map2.put("serialNumber", StallSn);
		map2.put("sign", getSign(map2, appSecret));
		for (Entry<String, Object> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + "========" + entry.getValue());
		}
		System.out.println("==============================================");
		
	}

	public static String getSign(Map<String, Object> map, String appSecret) {
		StringBuilder sb = new StringBuilder(appSecret);
		Set<Entry<String, Object>> entrySet = map.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
		}
		System.out.println(sb.substring(0, sb.length() - 1).toLowerCase());
		System.out.println(md5Password(sb.substring(0, sb.length() - 1).toLowerCase()));
		return md5Password(sb.substring(0, sb.length() - 1).toLowerCase());
	}

	public static String md5Password(String password) { 
		try { 
		// 得到一个信息摘要器
		MessageDigest digest = MessageDigest.getInstance("md5"); byte[] result = digest.digest(password.getBytes()); StringBuffer buffer = new StringBuffer(); 
		// 把每一个byte 做一个与运算 0xff; 
		for (byte b : result) { 
			// 与运算 
			int number = b & 0xff;
			// 加盐
			String str = Integer.toHexString(number); if (str.length() == 1) { buffer.append("0"); } buffer.append(str); } 
		// 标准的md5加密后的结果 
			return buffer.toString(); 
		}catch (NoSuchAlgorithmException e) {
			e.printStackTrace(); 
			return ""; } 
		}
}
