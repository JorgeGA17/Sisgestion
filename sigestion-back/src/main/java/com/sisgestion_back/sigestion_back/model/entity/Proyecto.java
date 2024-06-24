package com.sisgestion_back.sigestion_back.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "proyecto", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor

public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long proyectopk;

    @Column(name ="x_nombre_proyecto", nullable = false)
    private String xnombreproyecto;

    @Column(name ="x_slug", nullable = false)
    private String xslug;

    @Column(name ="x_problematica", nullable = false)
    private String xprobleamtica;

    @Column(name ="x_resumen", nullable = false)
    private String xresumen;

    @Column(name ="x_objetivo_general", nullable = false)
    private String xobjetivogeneral;

    @Column(name ="x_innovacion", nullable = false)
    private String xinnovacion;

    @Column(name ="x_impacto", nullable = false)
    private String ximpacto;

    @Column(name ="x_sostenibilidad", nullable = false)
    private String xsostenibilidad;

    @Column(name ="x_replicabilidad", nullable = false)
    private String xreplicabilidad;

    @Column(name ="n_publicacion", nullable = false)
    private String npublicacion;

    @Column(name ="n_peso", nullable = false)
    private String npeso;

    @Column(name ="f_fecha", nullable = false)
    private String ffecha;


}

