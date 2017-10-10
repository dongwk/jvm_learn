package com.jstattools;
/**
 * 测试MAT工具
 * @author Administrator
 * 
 * javac com/jstattools/JvmSize.java
 * java -Xms32m -Xmx32m  -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -Xloggc:gc.`log+%Y%m%d` -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./ -verbose:gc
 * com/jstattools/JvmSize
 * 
 */
public class JvmSize {

	private static int _1MB = 1024*1024;
	
	public static void main(String[] args) {
		
		System.out.println("start");
		int i = 1;
		byte[] _2MB = new byte[0];
		while (true) {
			try {
				_2MB = new byte[_1MB*4];
				System.out.println(i);
				i++;
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
