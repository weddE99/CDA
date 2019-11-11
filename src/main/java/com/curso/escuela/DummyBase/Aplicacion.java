package com.curso.escuela.DummyBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Aplicacion extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(Aplicacion.class);
    }
}
