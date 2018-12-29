package cn.ff.factory.test.abstra;

public class AppleFactory extends AbstractBeanFactory {
	@Override
	public Fruit getFruit(String name) {
		return new Apple();
	}

	@Override
	public Juice getJuice(String name) {
		return new AppleJuice();
	}

}
