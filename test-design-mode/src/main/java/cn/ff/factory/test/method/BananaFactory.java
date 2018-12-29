package cn.ff.factory.test.method;

import cn.ff.factory.test.simple.Fruit;
import cn.ff.factory.test.simple.banana;

public class BananaFactory implements BeanFactory {

	@Override
	public Fruit getFruit() {
		return new banana();
	}

}
