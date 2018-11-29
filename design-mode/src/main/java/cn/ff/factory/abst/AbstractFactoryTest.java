package cn.ff.factory.abst;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory af = new AppleFactory();
		System.out.println(af.getFruit().getName());
		System.out.println(af.getJuice().getName());
	}
}
