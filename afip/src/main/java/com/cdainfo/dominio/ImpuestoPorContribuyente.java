package com.cdainfo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImpuestoPorContribuyente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "numero_fiscal")
    private Long claveFiscal;
	
	@Column(name = "id_impuesto")
    private Long idImpuesto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClaveFiscal() {
		return claveFiscal;
	}

	public void setClaveFiscal(Long claveFiscal) {
		this.claveFiscal = claveFiscal;
	}

	public Long getIdImpuesto() {
		return idImpuesto;
	}

	public void setIdImpuesto(Long idImpuesto) {
		this.idImpuesto = idImpuesto;
	}
	
	@Override
    public String toString() {
        return "Contribuyente: " +
                "\n   id: " + this.id +
                "\n   claveFiscal: " + this.claveFiscal +
                "\n   idImpuesto: " + this.idImpuesto;
    }
}
