package cn.ff.factory.test.abstra;

public abstract class AbstractBeanFactory {

	public abstract Fruit getFruit(String name);
	
	public abstract Juice getJuice(String name);
}
