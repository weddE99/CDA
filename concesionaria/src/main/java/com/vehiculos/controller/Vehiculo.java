package com.vehiculos.controller;

public class Vehiculo {
	private String modelo;
	private String anio;
	private String valor;
	private String stock;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getPrecio() {
		return valor;
	}

	public void setPrecio(String precio) {
		this.valor = precio;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	public Vehiculo(String modelo,  String anio, String valor, String stock) {
		this.modelo = modelo;
		this.anio = anio;
		this.valor = valor;
		this.stock = stock;
	}
	
	public Vehiculo() {
		
	}
	
}
