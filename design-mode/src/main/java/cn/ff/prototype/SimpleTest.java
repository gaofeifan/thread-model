package cn.ff.prototype;

public class SimpleTest {

	public static void main(String[] args) throws Exception {
		JingGuBang jingGuBang = new JingGuBang();
		jingGuBang.colour = "金色";
		jingGuBang.length = 1000000;
		SuiWuKong suiWuKong = new SuiWuKong("男", 180, jingGuBang);
		System.out.println(suiWuKong);
		System.out.println(jingGuBang);
		System.out.println("===================");
		SuiWuKong object = (SuiWuKong) suiWuKong.clone();
		System.out.println(object);
		System.out.println(object.jingGuBang);
		System.out.println("===================");
		SuiWuKong swk = new SuiWuKong(suiWuKong);
		System.out.println(swk);
		System.out.println(swk.jingGuBang);
		System.out.println("----------------------------");
		object.sex = "女";
		System.out.println(object.sex);
		System.out.println("原数据");
		System.out.println(suiWuKong.sex);
		object.jingGuBang.length = 2;
		System.out.println(object.jingGuBang.length);
		System.out.println("原数据");
		System.out.println(suiWuKong.jingGuBang.length);
		System.out.println("----------------------------");
		swk.sex = "太监";
		System.out.println(swk.sex);
		System.out.println("原数据");
		System.out.println(suiWuKong.sex);
		System.out.println(swk.jingGuBang.length);
		}
}
