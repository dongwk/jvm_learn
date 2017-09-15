package com.d9;

/**
 * 
 * 书中的官方说明：
 * 为了多次载入执行类而加入的加载器<br />
 * 把 defineClass 方法开放出来，只有外部显示调用的时候才会使用到 loadByte fangf 
 * 由虚拟机调用时，仍然按照原有的双亲委派规则使用 loadClass 方法进行类加载
 * 
 * @author Administrator
 *
 */
public class HotSwapClassLoader extends ClassLoader {
	
	public HotSwapClassLoader(){
		super(HotSwapClassLoader.class.getClassLoader());
	}
	
	public Class<?> loadByte(byte[] classByte){
		return defineClass(null, classByte, 0, classByte.length);
	}
}
