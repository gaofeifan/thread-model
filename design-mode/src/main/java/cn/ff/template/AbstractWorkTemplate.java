package cn.ff.template;

public abstract class AbstractWorkTemplate {

	private String name;
	
	public final void work() {
//		System.out.println("姓名");
		name = name();
		System.out.println(name);
//		System.out.println("早上打卡");
		int duty = duty();
//		System.out.println("中午吃饭");
		eat();
//		System.out.println("工作内容");
		workContent();
//		System.out.println("下班打卡");
		clockOut();
		
		System.out.println("迟到人员=======================");
		beLast(duty);
	}

	private void beLast(int duty) {
		if(duty > 9) {
			System.out.println(name+"迟到了");
		}
	}

	protected abstract String name();
	
	protected abstract void workContent();

	protected abstract void clockOut();

	protected abstract void eat();

	protected abstract int duty();
	
}
