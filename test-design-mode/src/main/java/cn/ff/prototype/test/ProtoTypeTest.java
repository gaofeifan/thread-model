package cn.ff.prototype.test;

public class ProtoTypeTest {

	public static void main(String[] args) {
		JingGuBang jingGuBang = new JingGuBang(120, 10);
		SuiWuKong suk = new SuiWuKong(1, 518, "猴子",jingGuBang);
		System.out.println("猴子1==="+ suk);
		SuiWuKong suk2 = (SuiWuKong) suk.clone();
		System.out.println("猴子2==="+ suk2);
		suk2.setName("齐天大圣");
		suk2.getJingGuBang().setHigh(121);
		System.out.println("猴子2==="+ suk2);
		System.out.println("猴子1==="+ suk);
	}
	
	
}
