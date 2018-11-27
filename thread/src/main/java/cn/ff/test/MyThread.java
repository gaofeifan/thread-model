package cn.ff.test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;

public class MyThread {
public static void main(String[] args) {
	long time = new Date().getTime();
	System.out.println(time);
	String str = "1e2e90b4f56d58352bfb6119190535d7appId=1d46bc15df4c4b6a9a5710183da916c1&serialNumber=D8F5EF8A1745&timestamp="+time;
	str  = str.toLowerCase();
	System.out.println(str);
	try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        System.out.println(new BigInteger(1, md.digest()).toString(16));
        System.out.println("========================");
    } catch (Exception e) {
       e.printStackTrace();
    }
	String str2 = "1e2e90b4f56d58352bfb6119190535d7action=1&appId=1d46bc15df4c4b6a9a5710183da916c1&serialNumber=D8F5EF8A1745&timestamp="+time;
	str2  = str2.toLowerCase();
	System.out.println(str2);
	try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str2.getBytes());
        System.out.println(new BigInteger(1, md.digest()).toString(16));
        System.out.println("========================");
    } catch (Exception e) {
       e.printStackTrace();
    }
	String str3 = "1e2e90b4f56d58352bfb6119190535d7action=1&appId=1d46bc15df4c4b6a9a5710183da916c1&serialNumber=0000eccb1e57a0cd&timestamp="+time;
	str2  = str3.toLowerCase();
	System.out.println(str3);
	try {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(str3.getBytes());
		System.out.println(new BigInteger(1, md.digest()).toString(16));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
