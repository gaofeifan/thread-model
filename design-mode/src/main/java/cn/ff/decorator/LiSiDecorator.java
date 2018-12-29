package cn.ff.decorator;

public class LiSiDecorator extends Decorator {

	public LiSiDecorator(Person person) {
		super(person);
	}

	@Override
	public void eat() {
		super.eat();
		reEat();
	}

	@Override
	public void sleep() {
		super.sleep();
		this.reSleep();
	}
	
	public void reEat() {
		System.out.println("公司不发工资 只能再吃泡面了");
	}
	
	public void reSleep() {
		System.out.println("公司不发工资 只能睡大街了");
	}
	
	
}
