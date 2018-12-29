package cn.ff.decorator;

public class Decorator implements Person {

	private Person person;
	public Decorator(Person person) {
		this.person = person;
	}

	@Override
	public void eat() {
		person.eat();
	}

	@Override
	public void sleep() {
		person.sleep();
	}

}
