package com.vehiculos.controller;

import java.util.HashMap;

public class Vehiculos {
	private static HashMap<String, Vehiculo> vehiculos;
	
	public static void setVehiculos(HashMap<String, Vehiculo> vehiculos) {
		Vehiculos.vehiculos = vehiculos;
	}
	
	public static HashMap<String, Vehiculo> getVehiculos() {
		return vehiculos;
	}
	
	static {
		vehiculos = new HashMap<String, Vehiculo>();
		vehiculos.put("Ford", new Vehiculo("Ford Falcon", "1983", "50000", "1"));
		vehiculos.put("Peugeot", new Vehiculo("Peugeot 208", "2015", "750000", "10"));
		vehiculos.put("Mercedes-Benz", new Vehiculo("Mercedes-Benz Clase C", "2010", "850000", "10"));
		vehiculos.put("Fiat", new Vehiculo("Fiat Argo", "2017", "850000", "10"));
	}
}