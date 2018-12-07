package cn.ff.prototype;

public class SuiWuKong implements Cloneable {

	private String sex;
	
	private String name;
	
	private Integer age;

	private JingGuBang jingGuBang;
	
	public SuiWuKong(String sex, String name, Integer age) {
		super();
		this.sex = sex;
		this.name = name;
		this.age = age;
	}
	
	public SuiWuKong(String sex, String name, Integer age, JingGuBang jingGuBang) {
		super();
		this.sex = sex;
		this.name = name;
		this.age = age;
		this.jingGuBang = jingGuBang;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public JingGuBang getJingGuBang() {
		return jingGuBang;
	}

	public void setJingGuBang(JingGuBang jingGuBang) {
		this.jingGuBang = jingGuBang;
	}

	/*@Override
	protected Object clone(){
		try {
			// 签拷贝
			return super.clone();
			
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}*/
	
	@Override
	protected Object clone(){
		try {
			SuiWuKong swk = (SuiWuKong) super.clone();
			//	手动处理对象内的引用类型为深拷贝
			swk.setJingGuBang((JingGuBang)swk.getJingGuBang().clone());
			return swk;
			
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public String toString() {
		return "SuiWuKong [sex=" + sex + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
