package cn.ff.factory.test.simple;

public class BeanFactory {

	public Fruit getFruit(String name) {
		if(name.equals("苹果")) {
			return new Apple();
		}else if(name.equals("香蕉")) {
			return new banana();
		}
		return null;
	}
}
