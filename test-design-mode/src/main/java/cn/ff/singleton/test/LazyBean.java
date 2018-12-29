package cn.ff.singleton.test;

public class LazyBean {

	private LazyBean() {}
	
	private static LazyBean lb = null;
	
	public static LazyBean getInstance() {
		if(lb == null) {
			synchronized(LazyBean.class) {
				if(lb == null) {
					lb = new LazyBean();
				}
			}
		}
		return lb;
	}
	
	
}
