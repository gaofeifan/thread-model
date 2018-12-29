package cn.ff.prototype.test;

public class SuiWuKong implements Cloneable{

	private int sex;
	
	private int age;
	
	private String name;
	
	private JingGuBang jingGuBang;
	
	public SuiWuKong(int sex, int age, String name,JingGuBang jingGuBang) {
		super();
		this.sex = sex;
		this.age = age;
		this.name = name;
		this.jingGuBang = jingGuBang;
	}




	@Override
	protected Object clone(){
		try {
			SuiWuKong swk = (SuiWuKong) super.clone();
			swk.setJingGuBang(new JingGuBang(swk.getJingGuBang().getHigh(), swk.getJingGuBang().getWide()));;
			return swk;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}


	public int getSex() {
		return sex;
	}




	public void setSex(int sex) {
		this.sex = sex;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getName() {
		return name;
	}



	public JingGuBang getJingGuBang() {
		return jingGuBang;
	}
	public void setJingGuBang(JingGuBang jingGuBang) {
		this.jingGuBang = jingGuBang;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SuiWuKong [sex=" + sex + ", age=" + age + ", name=" + name + ", jingGuBang=" + jingGuBang + "]";
	}
	
	




	
}
