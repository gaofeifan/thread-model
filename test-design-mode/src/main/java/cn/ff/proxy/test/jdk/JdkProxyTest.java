package cn.ff.proxy.test.jdk;

import java.lang.reflect.Proxy;

public class JdkProxyTest {

	public static void main(String[] args) {
		JdkProxy proxy = new JdkProxy(new ZhangSan());
		Person san = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, proxy);
		san.findLove();
		
	}
}
