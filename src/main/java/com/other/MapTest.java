package com.other;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {

	@Test
	public void testHashMap2(){
		System.out.println("testHashMap2 start:"+System.currentTimeMillis());
		Map<Integer, String> map = new HashMap2<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		System.out.println("testHashMap2 end:"+System.currentTimeMillis());
	}
	

	@Test
	public void testHashMap(){
		System.out.println("testHashMap2 start:"+System.currentTimeMillis());
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		System.out.println("testHashMap2 end  :"+System.currentTimeMillis());
	}
}
