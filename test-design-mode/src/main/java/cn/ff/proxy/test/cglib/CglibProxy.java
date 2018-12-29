package cn.ff.proxy.test.cglib;

import java.lang.reflect.Method;

import cn.ff.proxy.test.jdk.Person;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	
	public Object target;
	
	public Object getInstance(Object obj) {
		this.target = obj;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		// 回调方法
		enhancer.setCallback(this);
		// 创建代理对象
		return enhancer.create();
	}
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		if(method.getName().equals("findLove")) {
			System.out.println("根据你的需求找");
			proxy.invokeSuper(obj, args);
			System.out.println("合适赶紧结婚");
		}
		return null;
	}

	
	
}
