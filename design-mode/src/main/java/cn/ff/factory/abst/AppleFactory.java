package cn.ff.factory.abst;

import cn.ff.factory.Apple;
import cn.ff.factory.AppleJuice;
import cn.ff.factory.Juice;
import cn.ff.factory.Fruit;

public class AppleFactory extends AbstractFactory {

	@Override
	Fruit getFruit() {
		return new Apple();
	}

	@Override
	Juice getJuice() {
		return new AppleJuice();
	}

}
