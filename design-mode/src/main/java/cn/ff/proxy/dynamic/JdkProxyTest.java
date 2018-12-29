package cn.ff.proxy.dynamic;

import java.lang.reflect.Proxy;

public class JdkProxyTest {

	public static void main(String[] args) {
		JdkDynamicproxy jdk = new JdkDynamicproxy(new JdkSon());
		JdkPerson newProxyInstance = (JdkPerson) Proxy.newProxyInstance(JdkPerson.class.getClassLoader(), new Class[] {JdkPerson.class}, jdk);
		newProxyInstance.findLove();
		System.out.println("=====================");
		newProxyInstance.eat("呷浦");
		
	}
	
}
