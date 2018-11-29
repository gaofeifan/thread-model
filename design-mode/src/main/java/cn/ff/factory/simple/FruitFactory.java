package cn.ff.factory.simple;

import cn.ff.factory.Apple;
import cn.ff.factory.Banana;
import cn.ff.factory.Fruit;
import cn.ff.factory.Orange;

public class FruitFactory {

	public Fruit getFruit(String name) {
		if(name.equals("苹果")) {
			return new Apple();
		}else if(name.equals("香蕉")) {
			return new Banana();
		}else if(name.equals("橙子")) {
			return new Orange();
		}
		return null;
	}
}
