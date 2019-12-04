package com.cdainfo.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Impuesto {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "tipo_impuesto")
    private String tipoImpuesto;

    @Column(name = "fecha_liquidacion")
    private String fechaLiquidacion;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoImpuesto() {
		return tipoImpuesto;
	}

	public void setTipoImpuesto(String tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}

	public String getFechLiquidacion() {
		return fechaLiquidacion;
	}

	public void setFechaLiquidacion(String fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}

	@Override
    public String toString() {
        return "Impuesto: " +
                "\n   id: " + this.id +
                "\n   tipo_impuesto: " + this.tipoImpuesto +
                "\n   fecha_liquidacion: " + this.fechaLiquidacion;
    }
}
