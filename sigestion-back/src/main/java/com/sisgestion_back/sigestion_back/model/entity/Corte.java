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
@Table(name = "corte", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor

public class Corte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "corte_pk", nullable = false)
    private Long cortePk;

    @Column(name = "c_codigo")
    private BigDecimal cCodigo;

    @Column(name = "x_nombre")
    private String xNombre;

    @Column(name = "x_slug")
    private String xSlug;

    @Column(name = "x_nombre_corto")
    private String xNombreCorto;

    @Column(name = "n_estado")
    private String nEstado;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

  @OneToMany (mappedBy = "cortefk", cascade = CascadeType.ALL)
  @JsonBackReference
  private List<Proyecto> proyectos;

  @OneToMany (mappedBy = "cortefk", cascade = CascadeType.ALL)
  @JsonBackReference
  private List<Comision> comisiones;

  @OneToMany (mappedBy = "cortefk", cascade = CascadeType.ALL)
  @JsonBackReference
  private List<Presidente> presidentes;




}