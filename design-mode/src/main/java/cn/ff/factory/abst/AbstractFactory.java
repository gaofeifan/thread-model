package cn.ff.factory.abst;

import cn.ff.factory.Juice;
import cn.ff.factory.Fruit;

public abstract class AbstractFactory {

	abstract Fruit getFruit();
	
	abstract Juice getJuice();
}
