 package com.oom;

/**
 * 第2.4.3章
 * 第二个例子
 * 
 * @author Administrator
 *
 */
public class RuntimeConstantPoolOOM2 {

	public static void main(String[] args) {
		String str1 = new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1); //true
		
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);//false
	}

}
