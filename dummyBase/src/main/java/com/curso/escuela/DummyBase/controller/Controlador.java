package com.curso.escuela.DummyBase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.escuela.DummyBase.DummyService;
import com.curso.escuela.DummyBase.IngresosServices;

@Controller
public class Controlador{
	@Autowired
	DummyService ds;
	
	@GetMapping("/login")
    public String getlogin(Model model) {
        model.addAttribute("login", new DummyService());
        return "login";
    }
	
	@GetMapping("/ingresosServices")
    public String getIngresosBrutos(Model model2) {
        model2.addAttribute("ingresosServices", new IngresosServices());
        return "ingresosServices";
    }
	
	@PostMapping("/login")
    public String login(@ModelAttribute DummyService dummyService) {
        int flag = dummyService.getAtribute();
		if(flag == 1) return "okLogin";
		if(flag == 0) return "errorLogin";
		else return "errorLogin";
    }
	
	@PostMapping("/ingresosServices")
    public String login2(@ModelAttribute IngresosServices ingresosServices, float monto, float sueldo) {
		ingresosServices.calculoIva(monto);
		ingresosServices.calculoIngresosBrutos(sueldo);
		return "ingresosServices";
    }
}
