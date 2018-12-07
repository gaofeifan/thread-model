package cn.ff.single;

public class SpringLazy {

	private SpringLazy() {
	}

	private static SpringLazy sl = null;

	public static SpringLazy getInstance() {
		if (sl == null) {
			synchronized (SpringLazy.class) {
				if (sl == null) {
					sl = new SpringLazy();
				}
			}
		}
		return sl;
	}
}
