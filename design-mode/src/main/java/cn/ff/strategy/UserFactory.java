package cn.ff.strategy;

public class UserFactory {

	private UserFactory() {}
	
	public static Payment createPayment(User user) {
		switch (user.getType()) {
		case 1:
			return new WechatPay();
		case 2:
			return new QQPay();
		case 3:
			return new UnionPay();
		}
		return null;
	}
}
