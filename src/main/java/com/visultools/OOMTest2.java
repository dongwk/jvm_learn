package com.visultools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试可视化工具 jconsole 线程标签页
 * -Xms100m -Xmx100m -XX:+UseSerialGC
 * @author Administrator
 *
 */
public class OOMTest2 {

	/**
	 * 线程死循环演示
	 */
	public static void createBusyThread(){
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run(){
				while (true);
			}
		}, "testBusyThread");
		thread.start();
	}
	
	/**
	 * 线程锁等待演示
	 */
	public static void createLockThread(final Object lock){
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}, "testLockThread");
		thread.start();
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		createBusyThread();
		br.readLine();
		Object obj = new Object();
		createLockThread(obj);
	}

}
