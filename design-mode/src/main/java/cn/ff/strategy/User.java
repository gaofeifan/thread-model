package cn.ff.strategy;

public class User {

	private Payment payment= null;
	
	private double amount = 0D;
	
	private int type ; 
	
	private String uid;
	
	public void buy(String uid ,int type , double amount){
		this.uid = uid;
		this.amount = amount;
		this.type = type;
//		this.payment = UserFactory.createPayment(this);
	}
	
	public double getAmount() {
		return amount;
	}

	public int getType() {
		return type;
	}

	public double lastPaymentAmount() {
		return this.payment.pay(uid,amount);
	}
	
	public double lastPaymentAmountEume(PayType payType) {
		return payType.get().pay(uid, amount);
	}
}
