package cn.ff.factory.abst;

import cn.ff.factory.Banana;
import cn.ff.factory.BananaJuice;
import cn.ff.factory.Fruit;
import cn.ff.factory.Juice;

public class BananaFactory extends AbstractFactory {

	@Override
	Fruit getFruit() {
		return new Banana();
	}

	@Override
	Juice getJuice() {
		return new BananaJuice();
	}

}
