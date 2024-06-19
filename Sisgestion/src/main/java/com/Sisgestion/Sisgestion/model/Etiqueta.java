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
@Table(name = "etiqueta", schema = "schconfiguracion")
public class Etiqueta {
    @Id
    @NotNull
    @Column(name = "etiqueta_pk", nullable = false)
    private Integer etiquetaPk;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_nombre", nullable = false)
    private String xNombre;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_lug", nullable = false)
    private String xLug;

    @Size(max = 1)
    @NotNull
    @ColumnDefault("'1'")
    @Column(name = "n_estado", nullable = false, length = 1)
    private String nEstado;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_campo", nullable = false)
    private String xCampo;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

}