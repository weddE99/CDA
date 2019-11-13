package com.vehiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehiculoController {

	@Autowired
	public VehiculoService autoService;
	
	@Autowired
	public ServiceApp serviceApp;
	
    @GetMapping("/login")
    public String ingresoForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
    
    @GetMapping("/cargar")
    public String cargaForm(Model model) {
        model.addAttribute("automotor", new Vehiculo());
        return "cargar";
    }
    
    @GetMapping("/buscar")
    public String busquedaForm(Model model) {
        model.addAttribute("automotor", new Vehiculo());
        return "buscar";
    }


    @PostMapping("/login")
    public String ingresoSubmit(@ModelAttribute User user) {
    	serviceApp.getVehicles();
        return autoService.verificarIngreso(user);
    }
    
    @PostMapping("/cargar")
    public String cargaSubmit(@ModelAttribute Vehiculo automotor) {
        return autoService.cargarVehiculos(automotor);
    }
    
    @PostMapping("/buscar")
    public String busquedaSubmit(@ModelAttribute Vehiculo automotor) {
        return autoService.seleccionarBusqueda(automotor);
    }
}