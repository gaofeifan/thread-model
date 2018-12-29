package cn.ff.proxy.test.cglib;

public class CglibProxyTest {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		ZhangSan san = (ZhangSan) proxy.getInstance(new ZhangSan());
		san.findLove();
		
		
	}
}
