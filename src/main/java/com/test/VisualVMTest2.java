package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class VisualVMTest2 {

	static String str = new String("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	static int _1KB = 1024*1024;
	
	static List<byte[]> list = new ArrayList<byte[]>();
	
	static void print(String t){
		System.out.println("->"+t);
	}
	
	public static void main(String[] args) throws Exception {
		list.add(new byte[_1KB]);
			
		Thread thread = new Thread(new Runnable() {
			public void run() {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				while (true){
					String t;
					try {
						t = reader.readLine();
						print(t);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}, "visualVmThread-0");
		
		thread.start();
//		Thread.sleep(60000);
	}
}

