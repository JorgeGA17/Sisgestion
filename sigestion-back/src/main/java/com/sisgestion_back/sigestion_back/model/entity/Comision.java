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
@Table(name = "comision", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor
public class Comision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comision_pk", nullable = false)
    private Long comisionPk;

    @Column(name = "x_descripcion")
    private String xDescripcion;

    @Column(name = "x_resolucion")
    private String xResolucion;

    @Column(name = "n_estado")
    private String nEstado;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

    @ManyToOne
    @JoinColumn(name = "corte_fk")
    @JsonBackReference
    private Corte cortefk;

    @ManyToOne
    @JoinColumn(name = "periodo_fk")
    @JsonBackReference
    private Periodo periodofk;

    @OneToMany (mappedBy = "comisionfk", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Miembro> miembros;

}
