package cn.ff.subject.mouse;

import java.util.ArrayList;
import java.util.List;

public class MouseSubject  implements Subject{

	private List<Observer> obs = new ArrayList<>();
	
	@Override
	public void add(Observer ob) {
		obs.add(ob);
	}

	private MouseEnum mouseEnum;
	
	@Override
	public void notifyObserver() {
		for (Observer ob : obs) {
			ob.update(mouseEnum);
		}
	}
	
	public void change(MouseEnum mouseEnum) {
		this.mouseEnum = mouseEnum;
		notifyObserver();
	}
	
	
	


}
