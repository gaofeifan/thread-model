package cn.ff.factory.test.method;

import cn.ff.factory.test.simple.Apple;
import cn.ff.factory.test.simple.Fruit;

public class AppleFactory implements BeanFactory {

	@Override
	public Fruit getFruit() {
		return new Apple();
	}

}
