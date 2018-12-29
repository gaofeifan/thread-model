package cn.ff.proxy.test.statice;

public class StaticProxyTest {

	public static void main(String[] args) {
		ZhangSanProxy proxy = new ZhangSanProxy(new ZhangSan());
		proxy.findLove();
	}
}
