package com.sisgestion_back.sigestion_back.repository;

import com.sisgestion_back.sigestion_back.model.entity.Corte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorteRepository extends JpaRepository<Corte, Long> {
    Corte findByxNombre(String xNombre);
}
