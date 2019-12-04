package com.cdainfo.repository;

import com.cdainfo.dominio.ImpuestoPorContribuyente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpuestoPorContribuyenteRepository extends JpaRepository<ImpuestoPorContribuyente, Long> {
	List<ImpuestoPorContribuyente> findByNumeroFiscalLike(Long numero_fiscal);
}
