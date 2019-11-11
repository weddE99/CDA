package com.vehiculos.controller;

import java.util.HashMap;

public class ControlUser {
	private static HashMap<String, String> admin;
	
	public static HashMap<String, String> getAdmin() {
		return admin;
	}
	public static void setAdmin(HashMap<String, String> admin) {
		ControlUser.admin = admin;
	}
	
	static {
		admin = new HashMap<String, String>();
		admin.put("root", "root");
	}
}
