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
@Table(name = "etiqueta", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor

public class Etiqueta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etiqueta_pk", nullable = false)
    private Long etiquetaPk;

    @Column(name ="x_nombre")
    private String xNombre;

    @Column(name ="x_lug")
    private String xSlug;

    @Column(name ="n_estado")
    private String nEstado;

    @Column(name ="x_campo")
    private String xCampo;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "etiqueta_proyectos",schema = "schconfiguracion",
            joinColumns = @JoinColumn(name = "etiqueta_fk"),
            inverseJoinColumns = @JoinColumn(name = "proyecto_fk")
    )

    private Set<Proyecto> proyectos = new HashSet<>();
}
