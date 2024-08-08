package com.sisgestion_back.sigestion_back.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "eje", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor
public class Eje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eje_pk", nullable = false)
    private Long ejePk;

    @Column(name = "x_nombre")
    private String xNombre;

    @Column(name = "x_slug")
    private String xSlug;

    @Column(name ="x_resumen")
    private String xResumen;

    @Column(name ="n_estado")
    private String nEstado;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "eje_proyectos",schema = "schconfiguracion",
            joinColumns = @JoinColumn(name = "eje_fk"),
            inverseJoinColumns = @JoinColumn(name = "proyecto_fk")
    )

    private Set<Proyecto> proyectos = new HashSet<>();

}
