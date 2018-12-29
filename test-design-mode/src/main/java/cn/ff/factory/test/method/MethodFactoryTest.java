package cn.ff.factory.test.method;

public class MethodFactoryTest {

	public static void main(String[] args) {
		BeanFactory factory = new AppleFactory();
		factory.getFruit().getName();
	}
}
