package com.cdainfo.bicicleteria.dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bicicleta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "modelo")
    private String modelo;

    @Column(name = "rodado")
    private int rodado;
    
    @Column(name = "precio")
    private double precio;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "anio")
    private Date anio;
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getRodado() {
		return rodado;
	}
	public void setRodado(int rodado) {
		this.rodado = rodado;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getAnio() {
		return anio;
	}
	public void setAnio(Date anio) {
		this.anio = anio;
	}

	@Override
    public String toString() {
        return "Bicicleta:" +
        		"\n   id: " + getId() +
                "\n   modelo: " + getModelo() +
                "\n   rodado: " + getRodado() +
                "\n   precio: " + getPrecio() +
                "\n   color: " + getColor() +
                "\n   anio: " + getAnio();
    }
}
