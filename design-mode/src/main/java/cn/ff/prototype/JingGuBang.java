package cn.ff.prototype;

public class JingGuBang implements Cloneable {

	private String colour;
	
	private String name;
	
	public String getCourrl() {
		return colour;
	}

	public void setCourrl(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public JingGuBang(String colour, String name) {
		this.colour = colour;
		this.name = name;
	}

	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "JingGuBang [courrl=" + colour + ", name=" + name + "]";
	}
	
}
