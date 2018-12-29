package cn.ff.singleton.test;

public class StaticBean {

	private StaticBean() {};
	
	private static final  StaticBean su = new StaticBean();
	
	public static StaticBean getInstance() {
		return su;
	}
}
