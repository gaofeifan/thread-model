package cn.ff.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		// 策略
		User u = new User();
		u.buy(1+"",1, 88);
		System.out.println("用户需要花费的钱 "+ u.lastPaymentAmountEume(PayType.QQ_PAY));
		u.buy(1+"",3, 88);
		System.out.println("用户需要花费的钱 "+ u.lastPaymentAmountEume(PayType.UNION_PAY));
		
		
	}
}
