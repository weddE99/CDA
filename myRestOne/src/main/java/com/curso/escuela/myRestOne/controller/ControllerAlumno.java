package com.curso.escuela.myRestOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.curso.escuela.myRestOne.Alumno;

@Controller
public class ControllerAlumno{

    @GetMapping("/alumno")
    public String findUsers(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "alumno";
    }

    @PostMapping("/alumno")
    public String createUser(@ModelAttribute Alumno alumno) {
        return "alumno";
    }
    
    @DeleteMapping("/alumno")
    public String deleteUser(@ModelAttribute Alumno alumno) {
    	return "alumno";
    }
    
    @PutMapping("/alumno")
    public String updateUser(@ModelAttribute Alumno alumno) {
    	return "alumno";
    }
}