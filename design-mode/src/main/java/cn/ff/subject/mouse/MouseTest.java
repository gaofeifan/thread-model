package cn.ff.subject.mouse;

public class MouseTest {

	public static void main(String[] args) {
		MouseSubject subject = new MouseSubject();
//		new MouseObserver(MouseEnum.CLICK,subject);
//		subject.change(MouseEnum.CLICK);
		new MouseObserver(MouseEnum.DOUBLE, subject);
		subject.change(MouseEnum.DOUBLE);
	}
}
