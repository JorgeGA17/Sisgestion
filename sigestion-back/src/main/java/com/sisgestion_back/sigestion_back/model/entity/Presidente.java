package com.sisgestion_back.sigestion_back.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Entity
@Table(name = "presidente", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor

public class Presidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "presidente_pk", nullable = false)
    private Long presidentePk;

    @Column(name = "n_estado")
    private String nEstado;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

    @ManyToOne
    @JoinColumn(name = "periodo_fk")
    @JsonBackReference
    private Periodo periodofk;

    @ManyToOne
    @JoinColumn(name = "corte_fk")
    @JsonBackReference
    private Corte cortefk;

    @ManyToOne
    @JoinColumn(name = "personal_fk")
    @JsonBackReference
    private Personal personalfk;





}
