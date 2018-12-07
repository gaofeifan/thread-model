package cn.ff.single;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTest {

	private static int clientNum = 2000000;
	private static int threadsNum = 10;
	final static CountDownLatch doneSignal = new CountDownLatch(clientNum);

	public static void main(String[] args) {

		try {
			lazyTest();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();

	}

	public static void lazyTest() throws InterruptedException {
		long startTime = new Date().getTime();
		for (int i = 0; i < clientNum; i++) {
			new Runnable() {
				@Override
				public void run() {
					System.out.println(SpringLazy.getInstance());
				}
			}.run();
		}
		long endTime = new Date().getTime();
		System.out.println((endTime - startTime) /1000 + "秒");
	}

	public static void staticTest() throws InterruptedException {
		long startTime = new Date().getTime();
		for (int i = 0; i < clientNum; i++) {
			new Thread() {
				@Override
				public void run() {
					System.out.println(SpringStaic.getInstance());
				}
			}.start();
		}
		long endTime = new Date().getTime();
		System.out.println((endTime - startTime) /1000 + "秒");
	}

}
