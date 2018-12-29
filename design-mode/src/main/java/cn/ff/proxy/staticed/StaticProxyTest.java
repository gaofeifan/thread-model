package cn.ff.proxy.staticed;

public class StaticProxyTest {

	public static void main(String[] args) {
		FolkProxy proxy = new FolkProxy(new Son());
		proxy.findLove();
	}
}
