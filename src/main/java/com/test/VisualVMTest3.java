package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class VisualVMTest3 {

	private String username = null;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	static String str = new String("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	static int _1KB = 1024*1024;
	static List<byte[]> list = new ArrayList<byte[]>();
	
	static void print(String t){
		System.out.println("->"+t);
	}
	
	public static void main(String[] args) throws Exception {
		list.add(new byte[_1KB]);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true){
			String t = reader.readLine();
			print(t);
		}
	}
}

