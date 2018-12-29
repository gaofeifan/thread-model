package cn.ff.template;

public class TemplateTest {

	public static void main(String[] args) {
		AbstractWorkTemplate temp = new ZhangSanWorkTemplate(10, "张三");
		AbstractWorkTemplate temp2 = new ZhangSanWorkTemplate(11, "李四");
		temp.work();
		temp2.work();
	}
}
