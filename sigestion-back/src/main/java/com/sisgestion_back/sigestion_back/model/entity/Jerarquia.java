package com.sisgestion_back.sigestion_back.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "jerarquia", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor
public class Jerarquia implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jerarquia_pk", nullable = false)
    private Long jerarquiaPk;

    @Column(name ="x_nombre")
    private String xNombre;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "jerarquia_proyectos",schema = "schconfiguracion",
            joinColumns = @JoinColumn(name = "jerarquia_fk"),
            inverseJoinColumns = @JoinColumn(name = "proyecto_fk")
    )

    private Set<Proyecto> proyectos = new HashSet<>();


}
