package com.cdainfo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contribuyente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero_fiscal;
	
	@Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

	public Long getNumero_fiscal() {
		return numero_fiscal;
	}

	public void setNumero_fiscal(Long numero_fiscal) {
		this.numero_fiscal = numero_fiscal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
    
	@Override
    public String toString() {
        return "Contribuyente: " +
                "\n   id: " + this.numero_fiscal +
                "\n   nombre: " + this.nombre +
                "\n   apellido: " + this.apellido;
    }
}
