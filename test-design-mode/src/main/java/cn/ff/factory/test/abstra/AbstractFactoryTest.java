package cn.ff.factory.test.abstra;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		AbstractBeanFactory factory = new AppleFactory();
		Fruit fruit = factory.getFruit("苹果");
		fruit.getName();
		Juice juice = factory.getJuice("苹果汁");
		juice.getName("苹果汁");
		
		factory = new BananaFactory();
		factory.getFruit("苹果").getName();;
		factory.getJuice("香蕉汁").getName("香蕉汁");;
		
	}
}
