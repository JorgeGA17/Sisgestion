package com.Sisgestion.Sisgestion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "corte", schema = "schconfiguracion")

public class Corte {
    @Id
    @NotNull
    @Column(name = "corte_pk", nullable = false)
    private Integer cortePk;

    @NotNull
    @Column(name = "c_codigo", nullable = false, precision = 10)
    private BigDecimal cCodigo;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_nombre", nullable = false)
    private String xNombre;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_slug", nullable = false)
    private String xSlug;

    @NotNull
    @Column(name = "x_nombre_corto", nullable = false, length = Integer.MAX_VALUE)
    private String xNombreCorto;

    @Size(max = 1)
    @NotNull
    @ColumnDefault("'1'")
    @Column(name = "n_estado", nullable = false, length = 1)
    private String nEstado;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

}