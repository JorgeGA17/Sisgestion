package com.sisgestion_back.sigestion_back.model.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "estado_proyectos", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor

public class Estado {

    @Id
    @Column(name = "estado_proyecto_pk", nullable = false)
    private Long estadoPk;

    @Column(name = "x_nombre")
    private String xNombre;

    @Column(name = "x_slug")
    private String xSlug;

    @Column(name ="x_resumen")
    private String xResumen;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

    @OneToMany(mappedBy = "estadofk", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Proyecto> proyectos;

}
