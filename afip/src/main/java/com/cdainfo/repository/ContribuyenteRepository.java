package com.cdainfo.repository;

import com.cdainfo.dominio.Contribuyente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContribuyenteRepository extends JpaRepository<Contribuyente, Long> {

}
