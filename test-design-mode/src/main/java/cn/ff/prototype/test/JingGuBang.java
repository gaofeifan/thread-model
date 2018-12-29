package cn.ff.prototype.test;

public class JingGuBang {

	private int high;
	
	private int wide;

	public JingGuBang(int high, int wide) {
		super();
		this.high = high;
		this.wide = wide;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

	@Override
	public String toString() {
		return "JingGuBang [high=" + high + ", wide=" + wide + "]";
	}
	
	
}
