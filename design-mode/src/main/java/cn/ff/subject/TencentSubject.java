package cn.ff.subject;

import java.util.ArrayList;
import java.util.List;

public class TencentSubject implements Subject {

	private List<Observer> obs = new ArrayList<>();
	private String content;
	@Override
	public void addObserver(Observer observer) {
		obs.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = obs.indexOf(observer);
		if(i >= 0) {
			obs.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : obs) {
			observer.message(content);
		}
	}
	
	public void setContent(String content) {
		this.content = content;
		System.out.println("热点新闻");
		notifyObserver();
	}

}
