package cn.ff.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import cn.ff.proxy.staticed.Person;

public class JdkDynamicproxy implements InvocationHandler {

	private JdkPerson Person;
	
	public JdkDynamicproxy(JdkPerson person) {
		this.Person = person;
	}


	@Override
	public Object invoke(Object proxy, Method menth, Object[] args) throws Throwable {
		if(menth.getName().equals("findLove")) {
			System.out.println("jdk 根据需求找的对象");
			menth.invoke(Person, args);
			System.out.println("jdk 双方父母满意度");
			return null;
		}else {
			System.out.println("jdk 根据你的需求");
			menth.invoke(Person, args);
			System.out.println("jdk 味道满意度");
			return null;
			
		}
	}

}
