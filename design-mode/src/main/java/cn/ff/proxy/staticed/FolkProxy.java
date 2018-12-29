package cn.ff.proxy.staticed;

public class FolkProxy implements Person{

	private Person person;

	public FolkProxy(Person person) {
		this.person = person;
	}
	
	public void findLove() {
		System.out.println("静态代理 根据需求找到的对象");
		person.findLove();
		System.out.println("双方父母是否满意");
	}
	
}
