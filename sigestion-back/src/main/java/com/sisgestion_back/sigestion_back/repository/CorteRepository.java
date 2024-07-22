package com.sisgestion_back.sigestion_back.repository;

import com.sisgestion_back.sigestion_back.model.entity.Corte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CorteRepository extends JpaRepository<Corte, Long> {
    Optional<Corte> findByxNombre(String xNombre);
}
