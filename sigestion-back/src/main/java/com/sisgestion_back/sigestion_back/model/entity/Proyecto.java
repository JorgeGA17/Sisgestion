package com.sisgestion_back.sigestion_back.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



@Data
@Entity
@Table(name = "proyecto", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor
public class Proyecto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proyecto_pk", nullable = false)
    private Long proyectopk;

    @Column(name = "x_nombre_proyecto")
    private String xnombreproyecto;

    @Column(name = "x_slug")
    private String xslug;

    @Column(name = "x_problematica")
    private String xproblematica;

    @Column(name = "x_resumen")
    private String xresumen;

    @Column(name = "x_objetivo_general")
    private String xobjetivogeneral;

    @Column(name = "x_innovacion")
    private String xinnovacion;

    @Column(name = "x_impacto")
    private String ximpacto;

    @Column(name = "x_sostenibilidad")
    private String xsostenibilidad;

    @Column(name = "x_replicabilidad", nullable = false)
    private String xreplicabilidad;

    @Column(name = "n_publicacion", nullable = false)
    private String npublicacion;

    @Column(name = "n_peso", nullable = false)
    private String npeso;

    @Column(name = "f_fecha", nullable = false)
    private String ffecha;

    @ManyToOne
    @JoinColumn(name = "corte_fk")
    @JsonBackReference
    private Corte cortefk;

    @ManyToOne
    @JoinColumn(name = "estado_proyecto_fk")
    @JsonBackReference
    private Estado estadofk;

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "especialidad_proyectos", schema = "schconfiguracion",
            joinColumns = @JoinColumn(name = "proyecto_fk"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_fk")
    )
    private Set<Especialidad> especialidades = new HashSet<>();

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "jerarquia_proyectos", schema = "schconfiguracion",
            joinColumns = @JoinColumn(name = "proyecto_fk"),
            inverseJoinColumns = @JoinColumn(name = "jerarquia_fk")
    )
    private Set<Jerarquia> jerarquias = new HashSet<>();


    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "eje_proyectos", schema = "schconfiguracion",
            joinColumns = @JoinColumn(name = "proyecto_fk"),
            inverseJoinColumns = @JoinColumn(name = "eje_fk")
    )
    private Set<Eje> ejes = new HashSet<>();

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "etiqueta_proyectos", schema = "schconfiguracion",
            joinColumns = @JoinColumn(name = "proyecto_fk"),
            inverseJoinColumns = @JoinColumn(name = "etiqueta_fk")
    )
    private Set<Etiqueta> etiquetas = new HashSet<>();


}

