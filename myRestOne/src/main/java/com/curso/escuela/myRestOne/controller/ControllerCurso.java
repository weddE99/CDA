package com.curso.escuela.myRestOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.curso.escuela.myRestOne.Curso;

@Controller
public class ControllerCurso{

    @GetMapping("/curso")
    public String findUsers(Model model) {
        model.addAttribute("curso", new Curso());
        return "curso";
    }

    @PostMapping("/curso")
    public String createUser(@ModelAttribute Curso curso) {
        return "curso";
    }
    
    @DeleteMapping("/curso")
    public String deleteUser(@ModelAttribute Curso curso) {
    	return "curso";
    }
    
    @PutMapping("/curso")
    public String updateUser(@ModelAttribute Curso curso) {
    	return "curso";
    }
}