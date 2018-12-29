package cn.ff.subject.jdk;

import cn.ff.adapter.TestAdapter;

public class JdkSubject {

	public static void main(String[] args) {
		TencentSubject t = new TencentSubject();
		new FansObserver(TestAdapter.getOpenId(), "张三", t);
		FansObserver lisi = new FansObserver(TestAdapter.getOpenId(), "李四", t);
		t.setContent("论何时才能发工资");
	}
}
