package cn.ff.proxy.dynamic;

public class JdkSon implements JdkPerson{

	@Override
	public void findLove() {
		System.out.println("jdk 找对象  超白 超富 超美");
	}

	@Override
	public void eat(String name) {
		System.out.println("吃"+ name);
	}
	
	

}
