package cn.ff.singleton.test;

public class StaticClass {
	
	private StaticClass() {
	};
	
	private static class StaticClass1{
		private static StaticClass sc = new StaticClass();
	}
	
	public static StaticClass getInstance() {
		return StaticClass1.sc;
	}
}
