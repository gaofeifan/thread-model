package cn.ff.decorator;

public class ZhangSanDecorator extends Decorator {

	public ZhangSanDecorator(Person person) {
		super(person);
	}

	@Override
	public void eat() {
		super.eat();
		reEat();
	}
	
	public void reEat() {
		System.out.println("再吃豪华大餐");
	}

	

	
}
