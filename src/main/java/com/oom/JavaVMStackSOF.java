package com.oom;

/**
 * 
 * 测试虚拟机栈溢出
 * StackOverflowError
 * 
 * 第2.4.2章 
 * -Xss128k
 * @author Administrator
 *
 */
public class JavaVMStackSOF {

	private int stackLength = 1;
	
	public void stackLeak(){
		stackLength++;
		stackLeak();
	}
	
	public static void main(String[] args) {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
		} catch (Throwable e) {
			System.out.println("stack length:"+oom.stackLength);
			e.printStackTrace();
		}
	}

}
