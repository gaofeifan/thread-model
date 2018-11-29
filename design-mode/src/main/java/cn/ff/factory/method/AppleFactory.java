package cn.ff.factory.method;

import cn.ff.factory.Apple;
import cn.ff.factory.Fruit;

public class AppleFactory implements FruitFactoty {

	@Override
	public Fruit getFruit() {
		return new Apple();
	}


}
