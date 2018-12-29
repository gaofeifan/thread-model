package cn.ff.subject.jdk;

import java.util.Observable;
import java.util.Observer;

public class FansObserver implements Observer {

	private String openId;
	
	private String nickname;
	
	private Observable observable;
	
	public FansObserver(String openId, String nickname, Observable observable) {
		this.openId = openId;
		this.nickname = nickname;
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		TencentSubject tencent = (TencentSubject)o;
		System.out.println(nickname+"今日热点新闻为"+tencent.getContent());
		
	}

}
