package cn.ff.strategy;

public class UnionPay implements Payment{

	@Override
	public Double pay(String uid ,double amount) {
		System.out.println("银联支付没有有效"+amount);
		return amount;
	}

	
}
