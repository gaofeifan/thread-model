package cn.ff.factory.test.simple;

public class TestSimpleFactory {
	public static void main(String[] args) {
		BeanFactory bean = new BeanFactory();
		Fruit fruit = bean.getFruit("苹果");
		fruit.getName();
	}
}
