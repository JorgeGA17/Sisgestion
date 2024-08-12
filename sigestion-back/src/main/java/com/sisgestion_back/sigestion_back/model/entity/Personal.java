package com.sisgestion_back.sigestion_back.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "personal", schema = "schconfiguracion")
@NoArgsConstructor
@AllArgsConstructor
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personal_pk", nullable = false)
    private Long personalPk;

    @Column(name = "x_tipo_documento")
    private String xtipoDocumento;

    @Column(name = "n_numero_documento")
    private String nnumeroDocumento;

    @Column(name = "x_nombre_completo")
    private String xnombreCompleto;

    @Column(name = "x_nombre")
    private String xnombre;

    @Column(name = "x_apellido")
    private String xapellido;

    @Column(name = "x_ocupacion")
    private String xocupacion;

    @Column(name = "x_correo_institucional")
    private String xcorreoInstitucional;

}
