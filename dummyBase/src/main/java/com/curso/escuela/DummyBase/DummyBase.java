package com.curso.escuela.DummyBase;
import java.util.HashMap;
import java.util.Map;

public class DummyBase {
	public static Map<String, String> map;
	
	static {
		map = new HashMap<String, String>();
		map.put("AAA","AAA");
		map.put("BBB","BBB");
		map.put("CCC","CCC");
		map.put("DDD","DDD");
		map.put("EEE","EEE");
	}
	
	public static Map<String,String> getMap(){
		return map;
	}
}
