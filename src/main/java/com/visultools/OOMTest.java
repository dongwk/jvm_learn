package com.visultools;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试可视化工具 jconsole 内存标签页
 * -Xms100m -Xmx100m -XX:+UseSerialGC
 * @author Administrator
 *
 */
public class OOMTest {

	static class OOMObject{
		public byte[] placeholder = new byte[64 * 1024];
	}
	
	public static void fillHeap(int num) throws InterruptedException{
		List<OOMObject> list = new ArrayList<OOMObject>();
		for (int i = 0; i < num; i++) {
			//稍作延时，令见识曲线的变化更加明显
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		fillHeap(1000);
	}

}
