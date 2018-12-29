package cn.ff.subject;

public class FansObserver implements Observer {

	private String content;
	
	private String openId;
	
	private String nickname;
	
	private Subject subject;
	
	public FansObserver(String openId, String nickname,Subject subject) {
		this.openId = openId;
		this.nickname = nickname;
		this.subject = subject;
		subject.addObserver(this);
	}


	@Override
	public void message(String content) {
		this.content = content;
		System.out.println("亲爱的"+nickname +"今日热点新闻"+content+"点击查看");
	}

}
