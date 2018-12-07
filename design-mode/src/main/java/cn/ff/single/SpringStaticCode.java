package cn.ff.single;

public class SpringStaticCode {

	private SpringStaticCode() {}
	
	private static SpringStaticCode ssc = null;
	
	static {
		System.out.println("加载代码块");
		ssc = new SpringStaticCode();
	}
	
	public static SpringStaticCode getInstance() {
		return ssc;
	}
	
	public static void main(String[] args) {
		new SpringStaticCode();
	}
}
