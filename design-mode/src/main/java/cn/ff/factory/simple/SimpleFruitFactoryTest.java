package cn.ff.factory.simple;

public class SimpleFruitFactoryTest {

	public static void main(String[] args) {
		SimpleFruitFactory sf = new SimpleFruitFactory();
		System.out.println(sf.getFruit("苹果"));
	}
}
