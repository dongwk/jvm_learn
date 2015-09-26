package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class VisualVMTest3 {

	private static String str = new String("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	private static List<User> list = new ArrayList<User>();

	//查看变量
	private static void lookVariable(){
		System.out.println("---------------------查看变量------------------------");
		System.out.println(str);
	}
	
	//查看对象
	private static void lookHeap(){
		System.out.println("---------------------查看对象------------------------");
		User user = new User();
		user.setId(123456789L);
		user.setName("zhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsanzhangsan");
		list.add(user);
		System.out.println(user);
	}
	
	//查看线程
	private static void lookThread(){
		Thread thread = new Thread(new Runnable() {
			public void run() {
				try {
					System.out.println("---------------------查看线程------------------------");
					System.out.println("thread-0 start");
					Thread.sleep(5000);
					System.out.println("thread-0 end");
					lookLoopThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "thread-0");
		thread.start();
	}

	//线程不停的运行
	private static void lookLoopThread(){
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("---------------------查看循环线程------------------------");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				while (true){
					String t;
					try {
						t = reader.readLine();
						System.out.println("thread-1:"+t);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}, "thread-1");
		thread.start();
	}
	
	public static void main(String[] args) throws Exception {
		lookVariable();
		lookHeap();
		lookThread();
	}
}

class User{

	private Long id = null;
	private String name = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{")
			.append("id").append(":").append(id)
			.append(",name").append(":").append(name)
			.append("}");
		return builder.toString();
	}
}
