package cn.ff.proxy.test.statice;

public class ZhangSanProxy implements Person{

	private Person person;
	
	public ZhangSanProxy(Person person) {
		super();
		this.person = person;
	}

	@Override
	public void findLove() {
		person.findLove();
		System.out.println("根据需求去找合适对象");
		System.out.println("合适就结婚");
		
	}

}
