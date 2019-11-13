package com.vehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ServiceApp {
	@Autowired
	JdbcTemplate jdbc;
	
	public List<Vehiculo> getVehicles(){
		String sql = "SELECT * FROM modelosAutos";
		List<Vehiculo> query = jdbc.query(sql,new VehiculosRowMapper());
		query.forEach(item->{System.out.println(item.getAnio());
								System.out.println(item.getModelo());
								System.out.println(item.getPrecio());
								System.out.println(item.getStock());});
		return query;
	}	
}
