package com.sisgestion_back.sigestion_back.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Entity
@Table(name = "periodo", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "periodo_pk", nullable = false)
    private Long periodoPk;

    @Column(name = "x_nombre")
    private String xNombre;

    @Column(name = "n_estado")
    private String nEstado;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

    @OneToMany (mappedBy = "periodofk", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Comision> comisiones;

    @OneToMany (mappedBy = "periodofk", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Presidente> presidentes;


}

