package cn.ff.delegate;

public class LiSI implements Target {

	@Override
	public String doing(String command) {
		System.out.println("我是李四我分布式事物处理更nb 社会你四哥 看见需求就是 一顿梭");
		return "开发完成";
	}

}
