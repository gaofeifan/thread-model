package cn.ff.strategy;

public enum PayType {

	QQ_PAY(new QQPay()),
	WECHAT_PAY(new WechatPay()),
	UNION_PAY(new UnionPay());
	private Payment payment;

	private PayType(Payment payment) {
		this.payment = payment;
	}
	
	public Payment get() {
		return this.payment;
	}
}
