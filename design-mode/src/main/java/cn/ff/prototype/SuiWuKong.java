package cn.ff.prototype;

public class SuiWuKong implements Cloneable{

	
	public String sex;
	
	public int height;
	
	public JingGuBang jingGuBang;
	
	
	public SuiWuKong(SuiWuKong suiWuKong) {
		this.sex = suiWuKong.sex;
		this.height = suiWuKong.height;
		this.jingGuBang  = suiWuKong.jingGuBang;
	}
	
	public SuiWuKong(String sex, int height, JingGuBang jingGuBang) {
		super();
		this.sex = sex;
		this.height = height;
		this.jingGuBang = jingGuBang;
	}




	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}
