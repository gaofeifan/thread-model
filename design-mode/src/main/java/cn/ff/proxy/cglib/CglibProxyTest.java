package cn.ff.proxy.cglib;

public class CglibProxyTest {

	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		ZhangSan instance = (ZhangSan) cglibProxy.getInstance(new ZhangSan());
		instance.findLove();
		System.out.println("吃饭吧===============");
		instance.eat("剁椒鱼头");
		System.out.println("造作吧===============");
		instance.ktv();
	}
}
