package cn.ff.factory.method;

import cn.ff.factory.Banana;
import cn.ff.factory.Fruit;

public class BananaFactory implements FruitFactoty {

	@Override
	public Fruit getFruit() {
		return new Banana();
	}

}
