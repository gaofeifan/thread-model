package cn.ff.proxy.test.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {

	private Person person;
	public JdkProxy(Person person) {
		this.person = person;
	}


	@Override
	public Object invoke(Object obj, Method method, Object[] objs) throws Throwable {
		if(method.getName().equals("findLove")) {
			System.out.println("根据你的要求查找对象");
			method.invoke(person, objs);
			System.out.println("合适就结婚");
		}
		return null;
		
	}

}
