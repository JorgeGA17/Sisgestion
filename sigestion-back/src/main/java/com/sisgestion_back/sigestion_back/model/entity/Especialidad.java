package com.sisgestion_back.sigestion_back.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;


    @Data
    @Entity
    @Table(name = "especialidad", schema = "schconfiguracion")
    @NoArgsConstructor
    @AllArgsConstructor

    public class Especialidad implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "especialidad_pk", nullable = false)
        private Long especialidadPk;

        @Column(name = "x_nombre")
        private String xNombre;

        @Column(name = "f_fecha_registro")
        private Instant fFechaRegistro;

        @Column(name = "f_fecha_modificacion")
        private Instant fFechaModificacion;


    }
