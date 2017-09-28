package com.visultools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JConsoleThread2 {
	
	/**
	 * 线程死锁等待演示
	 * @author Administrator
	 *
	 */
	static class SynAddRunalbe implements Runnable {
		int a, b;
		
		public SynAddRunalbe(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		@Override
		public void run() {
			synchronized (Integer.valueOf(a)) 	 {
				synchronized (Integer.valueOf(b)) {
					System.out.println(a + b);
				}
			}
		}
	}
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 100; i++) {
			new Thread(new SynAddRunalbe(1, 2)).start();
			new Thread(new SynAddRunalbe(2, 1)).start();
		}
	}
}
