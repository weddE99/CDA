package com.curso.escuela.DummyBase;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
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

	public boolean getAtribute() {
		return DummyBase.getMap().containsKey(pass) && DummyBase.getMap().containsValue(user);
	}
}
