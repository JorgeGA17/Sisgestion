package com.Sisgestion.Sisgestion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "eje", schema = "schconfiguracion")
public class Eje {
    @Id
    @NotNull
    @Column(name = "eje_pk", nullable = false)
    private Integer ejePk;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_nombre", nullable = false)
    private String xNombre;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_slug", nullable = false)
    private String xSlug;

    @NotNull
    @Column(name = "x_resumen", nullable = false, length = Integer.MAX_VALUE)
    private String xResumen;

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