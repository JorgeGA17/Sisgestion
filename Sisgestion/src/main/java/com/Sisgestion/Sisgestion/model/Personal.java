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
@Table(name = "personal", schema = "schconfiguracion")
public class Personal {
    @Id
    @NotNull
    @Column(name = "personal_pk", nullable = false)
    private Integer personalPk;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_tipo_documento", nullable = false)
    private String xTipoDocumento;

    @Size(max = 255)
    @NotNull
    @Column(name = "n_numero_documento", nullable = false)
    private String nNumeroDocumento;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_nombre", nullable = false)
    private String xNombre;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_apellido", nullable = false)
    private String xApellido;

    @Column(name = "f_fecha_nacimiento")
    private LocalDate fFechaNacimiento;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_ocupacion", nullable = false)
    private String xOcupacion;

    @Size(max = 255)
    @NotNull
    @Column(name = "x_correo_institucional", nullable = false)
    private String xCorreoInstitucional;

    @Size(max = 255)
    @ColumnDefault("NULL::character varying")
    @Column(name = "x_correo_personal")
    private String xCorreoPersonal;

    @Size(max = 255)
    @ColumnDefault("NULL::character varying")
    @Column(name = "n_telefono")
    private String nTelefono;

    @Size(max = 255)
    @ColumnDefault("NULL::character varying")
    @Column(name = "n_anexo")
    private String nAnexo;

    @Column(name = "f_fecha_registro")
    private Instant fFechaRegistro;

    @Column(name = "f_fecha_modificacion")
    private Instant fFechaModificacion;

}