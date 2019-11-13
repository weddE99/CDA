package com.vehiculos.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class VehiculosRowMapper implements RowMapper<Vehiculo>{

	@Override
	public Vehiculo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vehiculo v = new Vehiculo();
		v.setAnio(rs.getString("anio"));
		v.setModelo(rs.getString("modelo"));
		v.setPrecio(rs.getString("precio"));
		v.setStock(rs.getString("stock"));
		return v;
	}
}
