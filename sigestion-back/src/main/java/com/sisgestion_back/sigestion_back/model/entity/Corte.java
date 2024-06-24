package com.sisgestion_back.sigestion_back.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Entity
@Table(name = "corte", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor

public class Corte {

    @Id
    @Column(name = "corte_pk", nullable = false)
    private Long cortePk;

    @Column(name = "c_codigo", nullable = false)
    private BigDecimal cCodigo;

    @Column(name = "x_nombre", nullable = false)
    private String xNombre;

    @Column(name = "x_slug", nullable = false)
    private String xSlug;

    @Column(name = "x_nombre_corto", nullable = false)
    private String xNombreCorto;

    @Column(name = "n_estado", nullable = false)
    private String nEstado;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

}