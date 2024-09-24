package com.sisgestion_back.sigestion_back.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProyectoRequestDTO {

    private String xnombreproyecto;

    private String xslug;

    private String xproblematica;

    private String xresumen;

    private String xobjetivogeneral;

    private Integer xinnovacion;

    private Integer ximpacto;

    private Integer xsostenibilidad;

    private Integer xreplicabilidad;

    private String npublicacion;

    private Integer npeso;

    private String ffecha;

}
