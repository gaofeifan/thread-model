package cn.ff.subject.jdk;

import java.util.Observable;
import java.util.Observer;

public class TencentSubject extends Observable {

	private String content;
	
	public void setContent(String content) {
		this.content = content;
		super.setChanged(); 
		super.notifyObservers();
	}

	public String getContent() {
		return content;
	}
}
