package cn.ff.factory.test.abstra;

public class BananaFactory extends AbstractBeanFactory {

	@Override
	public Fruit getFruit(String name) {
		return new Banana();
	}

	@Override
	public Juice getJuice(String name) {
		return new BananaJuice();
	}

}
