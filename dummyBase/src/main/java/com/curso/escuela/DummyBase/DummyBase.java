package com.curso.escuela.DummyBase;
import java.util.HashMap;
import java.util.Map;

public class DummyBase {
	private String user;
	private String pass;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public static Map<String, String> map;
	
	static {
		map = new HashMap<String, String>();
		map.put("1234","Wilson");
		map.put("BBB","BBB");
		map.put("CCC","CCC");
		map.put("DDD","DDD");
		map.put("EEE","EEE");
	}
	
	public static Map<String,String> getMap(){
		return map;
	}
	
	public void setMap(String user, String pass){
		map.put(pass,user);
	}
	
	public DummyBase() {
		
	}
}
