package cn.ff.strategy;

/**
 * 支付接口
 * @author   GFF
 * @Date     2018年12月11日
 * @Version  v2.0
 */
public interface Payment {

	public Double pay(String uid, double amount);
}
