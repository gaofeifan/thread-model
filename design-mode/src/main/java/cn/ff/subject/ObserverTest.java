package cn.ff.subject;

import cn.ff.adapter.TestAdapter;

public class ObserverTest {

	public static void main(String[] args) {
		TencentSubject s = new TencentSubject();
		new FansObserver(TestAdapter.getOpenId(), "张三", s);
		FansObserver lisi = new FansObserver(TestAdapter.getOpenId(), "李四", s);
		s.setContent("华为冲突重重困境,终于成为了5G的领头者");
		
		s.removeObserver(lisi);
		new FansObserver(TestAdapter.getOpenId(), "王五", s);
		s.setContent("隔壁老母猪为何夜夜惨叫");
	}
}
