package cn.ff.factory;

public class FruitFactory {

	public Fruit getFruit(String name) {
		if(name.equals("苹果")) {
			return new Apple();
		}else if(name.equals("香蕉")) {
			return new Banana();
		}
		return null;
	}
}
