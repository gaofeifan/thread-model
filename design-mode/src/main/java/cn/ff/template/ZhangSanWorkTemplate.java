package cn.ff.template;

public class ZhangSanWorkTemplate extends AbstractWorkTemplate {

	private int date;
	
	private String name;
	
	public ZhangSanWorkTemplate(int date,String name) {
		this.date = date;
		this.name = name;
	}


	@Override
	protected void clockOut() {
		System.out.println("张三18点下班打卡");
	}

	@Override
	protected void eat() {
		System.out.println("张三12点吃饭");
	}

	@Override
	protected int duty() {
		System.out.println("张三早上"+date+"点打卡");
		return date;
	}

	@Override
	protected void workContent() {
		System.out.println("开发新的模块修改bug");
	}

	@Override
	protected String name() {
		return name;
	}

	
}
