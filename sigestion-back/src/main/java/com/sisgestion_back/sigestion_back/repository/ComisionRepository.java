package com.sisgestion_back.sigestion_back.repository;

import com.sisgestion_back.sigestion_back.model.entity.Comision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ComisionRepository extends JpaRepository<Comision,Long> {
    Optional<Comision> findByxDescripcion(String xDescripcion);
}