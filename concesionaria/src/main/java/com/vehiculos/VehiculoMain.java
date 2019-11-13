package com.vehiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.vehiculos.controller.ServiceApp;

@SpringBootApplication
public class VehiculoMain extends SpringBootServletInitializer {
	static ServiceApp sa = new ServiceApp();
    public static void main(String[] args) {
        SpringApplication.run(VehiculoMain.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(VehiculoMain.class);
    }
}