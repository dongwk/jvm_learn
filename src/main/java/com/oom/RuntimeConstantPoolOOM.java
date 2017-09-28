package com.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * 第2.4.3章
 * 运行时常量池溢出
 * 
 * VM Args: -XX:PermSize=2M -XX:MaxPermSize=2M
 * 在JDK1.8环境下没有测试出常量池溢出的问题，就把参数改成1B也是不行
 * @author Administrator
 *
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		//使用List保持着常量池引用，避免Full GC回收常量池行为
		List<String> list = new ArrayList<String>();
		int i = 0;
		while (true) {
			System.out.println(i);
			list.add(String.valueOf(i++).intern());
		}
	}

}
