package cn.ff.strategy;

public class WechatPay implements Payment {

	@Override
	public Double pay(String uid ,double amount) {
		amount *=  0.88;
		System.out.println("微信支付8.8折优惠" + amount);
		return amount;
	}

}
