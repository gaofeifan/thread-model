package cn.ff.factory.method;

import cn.ff.factory.Fruit;
import cn.ff.factory.Orange;

public class OrangeFactory implements FruitFactoty {
	@Override
	public Fruit getFruit() {
		return new Orange();
	}

}
