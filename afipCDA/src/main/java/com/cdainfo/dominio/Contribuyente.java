package com.cdainfo.dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Contribuyente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroFiscal;
	
	@Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

	public Long getNumeroFiscal() {
		return numeroFiscal;
	}

	public void setNumeroFiscal(Long numero_fiscal) {
		this.numeroFiscal = numero_fiscal;
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
	
	@ManyToMany
	@JoinColumn(name = "Contribuyente", nullable = true)
	private List<Impuesto> impuestos;
    
	public List<Impuesto> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<Impuesto> impuestos) {
		this.impuestos = impuestos;
	}

	@Override
    public String toString() {
        return "Contribuyente: " +
                "\n   id: " + this.numeroFiscal +
                "\n   nombre: " + this.nombre +
                "\n   apellido: " + this.apellido +
        		"\n   Impuestos: " + this.impuestos;
    }
}