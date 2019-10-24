package com.curso.escuela.DummyBase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.escuela.DummyBase.DummyService;

@Controller
public class Controlador{
	@Autowired
	DummyService ds;
	
	@GetMapping("/login")
    public String getlogin(Model model) {
        model.addAttribute("login", new DummyService());
        return "login";
    }
	
	@PostMapping("/login")
    public String login(@ModelAttribute DummyService dummyService) {
        boolean flag = dummyService.getAtribute();
        System.out.println(flag);
		if(flag == true) return "okLogin";
		else return "errorLogin";
    }
}
