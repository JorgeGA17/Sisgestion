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
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "proyecto", schema = "schconfiguracion")
public class Proyecto {
    @Id
    @Size(max = 255)
    @NotNull
    @Column(name = "x_nombre_proyecto", nullable = false)
    private String xNombreProyecto;

    @NotNull
    @Column(name = "proyecto_pk", nullable = false)
    private Integer proyectoPk;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_slug", nullable = false)
    private String xSlug;

    @Column(name = "x_problematica", length = Integer.MAX_VALUE)
    private String xProblematica;

    @Column(name = "x_resumen", length = Integer.MAX_VALUE)
    private String xResumen;

    @Column(name = "x_objetivo_general", length = Integer.MAX_VALUE)
    private String xObjetivoGeneral;

    @Column(name = "x_innovacion", length = Integer.MAX_VALUE)
    private String xInnovacion;

    @Column(name = "x_impacto", length = Integer.MAX_VALUE)
    private String xImpacto;

    @Column(name = "x_sostenibilidad", length = Integer.MAX_VALUE)
    private String xSostenibilidad;

    @Column(name = "x_replicabilidad", length = Integer.MAX_VALUE)
    private String xReplicabilidad;

    @Size(max = 1)
    @NotNull
    @ColumnDefault("'2'")
    @Column(name = "n_publicacion", nullable = false, length = 1)
    private String nPublicacion;

    @Size(max = 1)
    @NotNull
    @ColumnDefault("NULL::character varying")
    @Column(name = "n_peso", nullable = false, length = 1)
    private String nPeso;

    @NotNull
    @Column(name = "f_fecha", nullable = false)
    private LocalDate fFecha;

    @NotNull
    @Column(name = "usuario_fk", nullable = false)
    private Integer usuarioFk;

    @NotNull
    @Column(name = "corte_fk", nullable = false)
    private Integer corteFk;

    @NotNull
    @Column(name = "estado_proyecto_fk", nullable = false)
    private Integer estadoProyectoFk;

    @NotNull
    @Column(name = "tipo_fk", nullable = false)
    private Integer tipoFk;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

}