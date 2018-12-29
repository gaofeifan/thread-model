package cn.ff.decorator;

public class PersonImpl implements Person {

	@Override
	public void eat() {
		System.out.println("吃");
	}

	@Override
	public void sleep() {
		System.out.println("睡");
	}

}
