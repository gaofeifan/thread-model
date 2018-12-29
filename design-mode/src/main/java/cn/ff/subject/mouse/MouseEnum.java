package cn.ff.subject.mouse;

public enum MouseEnum {

	CLICK("单击"),
	DOUBLE("双击"),
	UP("上"),
	down("下");
	
	private String name;
	
	private MouseEnum(String name) {
		this.name = name;
	}


	public String get(MouseEnum mouse) {
		return mouse.name;
	}
}
