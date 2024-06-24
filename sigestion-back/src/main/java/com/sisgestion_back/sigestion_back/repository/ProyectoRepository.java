package com.sisgestion_back.sigestion_back.repository;

import com.sisgestion_back.sigestion_back.model.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    Optional<Proyecto> findByxnombreproyecto(String xnombreproyecto);

}
