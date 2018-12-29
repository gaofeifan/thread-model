package cn.ff.singleton.test;

public class StaticCode {

	private StaticCode(){}
	
	private static StaticCode sc = null;
	
	static{
		sc = new StaticCode();
	}
	
	public static StaticCode getInstance() {
		return sc;
	}
	
}
