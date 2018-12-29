package cn.ff.proxy.cglib;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{

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
			System.err.println("俺是媒婆 俺给你介绍对象的");
			proxy.invokeSuper(obj, args);
			System.out.println("没问题就结婚吧 赶紧给费用");
		}else if(method.getName().equals("eat")) {
			System.out.println("俺是厨师你要吃什mo");
			proxy.invokeSuper(obj, args);
			System.out.println(args[0].toString()+"做好了  给钱吧");
		}else {
			System.out.println("我是谁 我要给你干啥么");
			System.out.println("我来打酱油拜");
			
		}
		return null;
	}

}
