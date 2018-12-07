package cn.ff.single;

public class SpringStaticClass {

	private SpringStaticClass () {};
	
	static {
		System.out.println("静态代码块");
	}
	
	private static class SpringStaticc{
		private static SpringStaticClass ssc = new SpringStaticClass();
	}
	
	public static SpringStaticClass getInstance() {
		return SpringStaticc.ssc;
	}
}
