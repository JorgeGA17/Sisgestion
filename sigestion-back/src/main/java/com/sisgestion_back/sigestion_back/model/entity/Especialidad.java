package com.sisgestion_back.sigestion_back.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

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

        @ManyToMany
        @JsonBackReference
        @JoinTable(
                name = "especialidad_proyectos",schema = "schconfiguracion",
                joinColumns = @JoinColumn(name = "especialidad_fk"),
                inverseJoinColumns = @JoinColumn(name = "projecto_fk")
        )

        private Set<Proyecto> proyectos = new HashSet<>();
    }
