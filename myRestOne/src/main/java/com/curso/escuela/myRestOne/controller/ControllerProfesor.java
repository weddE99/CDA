package com.curso.escuela.myRestOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.curso.escuela.myRestOne.Profesor;

@Controller
public class ControllerProfesor{

    @GetMapping("/profesor")
    public String findUsers(Model model) {
        model.addAttribute("profesor", new Profesor());
        return "profesor";
    }

    @PostMapping("/profesor")
    public String createUser(@ModelAttribute Profesor profesor) {
        return "profesor";
    }
    
    @DeleteMapping("/profesor")
    public String deleteUser(@ModelAttribute Profesor profesor) {
    	return "profesor";
    }
    
    @PutMapping("/profesor")
    public String updateUser(@ModelAttribute Profesor profesor) {
    	return "profesor";
    }
}