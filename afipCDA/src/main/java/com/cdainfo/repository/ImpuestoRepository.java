package com.cdainfo.repository;

import com.cdainfo.dominio.Impuesto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpuestoRepository extends JpaRepository<Impuesto, Long> {
	Impuesto findByTipoImpuestoLike(String tipo_impuesto);
	
	List<Impuesto> findByFechaLiquidacionBetween(String desde, String hasta);
}
