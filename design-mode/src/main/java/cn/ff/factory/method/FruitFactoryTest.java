package cn.ff.factory.method;

public class FruitFactoryTest {

	public static void main(String[] args) {
		
		FruitFactoty ff  = new AppleFactory();
		System.out.println(ff.getFruit().getName());
		
		FruitFactoty  fo = new OrangeFactory();
		System.out.println(fo.getFruit().getName());
	}
}
