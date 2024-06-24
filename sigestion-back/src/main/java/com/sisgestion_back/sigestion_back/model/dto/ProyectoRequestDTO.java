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

    private String xprobleamtica;

    private String xresumen;

    private String xobjetivogeneral;

    private String xinnovacion;

    private String ximpacto;

    private String xsostenibilidad;

    private String xreplicabilidad;

    private String npublicacion;

    private String npeso;

    private String ffecha;

}
