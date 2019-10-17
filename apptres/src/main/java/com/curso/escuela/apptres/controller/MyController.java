package com.curso.escuela.apptres.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.escuela.apptres.Greeting;

@Controller
public class MyController{

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, float n1, float n2, 
    		float n3, float n4, float n5, float n6, float n7, float n8) {
    	greeting.suma(n1,n2);
    	greeting.resta(n3, n4);
    	greeting.multiplicacion(n5,n6);
    	greeting.division(n7,n8);
        return "greeting";
    }

}

