package cn.ff.subject;

/**
 * 主题 被观察者
 * @author   GFF
 * @Date     2018年12月19日
 * @Version  v2.0
 */
public interface Subject {

	public void addObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObserver();
}
