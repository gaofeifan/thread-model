package cn.ff.factory.simple;

import cn.ff.factory.Apple;
import cn.ff.factory.Banana;
import cn.ff.factory.Fruit;

public class SimpleFruitFactoryTest {

	public static void main(String[] args) {
		SimpleFruitFactory sf = new SimpleFruitFactory();
		System.out.println(sf.getFruit("苹果").getName());
	}
}
