package com.curso.escuela.DummyBase;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
	public String user;
	public String pass;
	
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

	public int getAtribute() {
		System.out.println(user+""+pass);
		int flag = 0;
		
		if(DummyBase.getMap().containsKey(this.pass)) {
			if(DummyBase.getMap().get(pass).equals(user)) {
				flag = 1;
			}
			else flag = 0;
		}
		else flag = 0;
		
		
		if(!(DummyBase.getMap().containsValue(this.user))) {
			System.out.println(":D");
			flag = 2;
		}

		return flag;
	}
}
