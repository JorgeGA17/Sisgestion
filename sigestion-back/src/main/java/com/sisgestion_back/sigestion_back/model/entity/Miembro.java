package com.sisgestion_back.sigestion_back.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Entity
@Table(name = "miembro", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor
public class Miembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "miembro_pk", nullable = false)
    private Long miembroPk;

    @Column(name = "n_estado")
    private String nEstado;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

    @ManyToOne
    @JoinColumn(name = "comision_fk")
    @JsonBackReference
    private Comision comisionfk;

    @ManyToOne
    @JoinColumn(name = "personal_fk")
    @JsonBackReference
    private Personal personalfk;

    @ManyToOne
    @JoinColumn(name = "cargo_fk")
    @JsonBackReference
    private Cargo cargofk;

}
