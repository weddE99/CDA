package com.cdainfo.bicicleteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cdainfo.bicicleteria.dominio.Bicicleta;


@Repository
public interface BicicleteriaRepository extends JpaRepository<Bicicleta, Long> {

   // List<Bicicleta> findAllByNameLike(String name);

   // List<Bicicleta> findAllByNameLikeOrSurnameLike(String name, String surname);
}