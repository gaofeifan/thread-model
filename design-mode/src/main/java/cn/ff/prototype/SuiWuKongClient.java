package cn.ff.prototype;

public class SuiWuKongClient {

	public static void main(String[] args) {
		JingGuBang jgb = new JingGuBang("金色", "棍棍");
		SuiWuKong swk = new SuiWuKong("男", "猴子", 520,jgb);
		SuiWuKong swk2 = (SuiWuKong) swk.clone();
		System.out.println(swk);
		System.out.println(swk2);
		System.out.println(swk == swk2);
		System.out.println(jgb);
		JingGuBang jgb2 = swk2.getJingGuBang();
		System.out.println(jgb2);
		swk2.setAge(521);
		System.out.println(jgb2 == jgb);
		System.out.println(swk);
		System.out.println(swk2);
		jgb2.setCourrl("屎黄色");
		System.out.println(jgb2);
		System.out.println(jgb);
	}
}
