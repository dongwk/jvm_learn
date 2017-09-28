package com.oom;

/**
 * 测试虚拟机栈溢出
 * OutOfMemoryError
 * 
 * 第2.4.2章 这个导致系统假死
 * -Xss2M
 * @author Administrator
 *
 */
public class JavaVMStackOOM {

	
	public void dontStop(){
		while(true) {
			
		}
	}
	
	public void stackLeakByThread(){
		while (true) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					dontStop();
				}
			});
			thread.start();
		}
	}
	
	public static void main(String[] args) {
//		JavaVMStackOOM oom = new JavaVMStackOOM();
//		oom.stackLeakByThread();
	}

}
