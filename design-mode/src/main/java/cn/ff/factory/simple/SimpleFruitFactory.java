package cn.ff.factory.simple;

import cn.ff.factory.Apple;
import cn.ff.factory.Banana;
import cn.ff.factory.Fruit;

public class SimpleFruitFactory {

	public Fruit getFruit(String name) {
		if(name.equals("苹果")) {
			return new Apple();
		}else if(name.equals("香蕉")) {
			return new Banana();
		}
		return null;
	}
}
