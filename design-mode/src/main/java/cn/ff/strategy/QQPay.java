package cn.ff.strategy;

public class QQPay implements Payment {

	@Override
	public Double pay(String uid , double amount) {
		amount *=  0.88;
		System.out.println("QQ 支付8.8折优惠");
		return amount;
	}

}
