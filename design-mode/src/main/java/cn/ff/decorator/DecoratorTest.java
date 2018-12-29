package cn.ff.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Person p = new PersonImpl();
		p.eat();
		p.sleep();
		System.out.println("============================");
		ZhangSanDecorator zhagnsan = new ZhangSanDecorator(p);
		zhagnsan.eat();
		zhagnsan.sleep();
		System.out.println("============================");
		LiSiDecorator lisi = new LiSiDecorator(zhagnsan);
		lisi.eat();
		lisi.sleep();
	}
	
}
