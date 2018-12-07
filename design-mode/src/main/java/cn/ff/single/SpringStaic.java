package cn.ff.single;

/**
 * 饿汉式
 * @author   GFF
 * @Date     2018年12月5日
 * @Version  v2.0
 */
public class SpringStaic {

	private SpringStaic(){}
	
	private static final SpringStaic ss = new SpringStaic();
	
	public static SpringStaic getInstance() {
		return ss;
	}
}
