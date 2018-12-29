package cn.ff.delegate;

public class ZhangSan implements Target {

	@Override
	public String doing(String command) {
		System.out.println("我是张三我处理高并发超nb 有问题找三个");
		return "开发完成";
	}

}
