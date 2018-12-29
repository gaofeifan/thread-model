package cn.ff.subject.mouse;

public class MouseObserver implements Observer{

	private MouseEnum mouse;
	
	private MouseSubject mouseSubject;
	
	@Override
	public void update(MouseEnum mouse) {
		this.mouse = mouse;
		System.out.println(mouse.get(mouse)+"被调用了");
	}

	public MouseObserver(MouseEnum mouse, MouseSubject mouseSubject) {
		this.mouse = mouse;
		this.mouseSubject = mouseSubject;
		mouseSubject.add(this);
	}
	
	

	
}
