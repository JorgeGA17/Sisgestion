package com.sisgestion_back.sigestion_back.model.dto;

import com.sisgestion_back.sigestion_back.model.entity.Corte;
import com.sisgestion_back.sigestion_back.model.entity.Especialidad;
import com.sisgestion_back.sigestion_back.model.entity.Estado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProyectoResponseDTO {

    private Long proyectopk;

    private String xnombreproyecto;

    private String xslug;

    private String xproblematica;

    private String xresumen;

    private String xobjetivogeneral;

    private String xinnovacion;

    private String ximpacto;

    private String xsostenibilidad;

    private String xreplicabilidad;

    private String npublicacion;

    private String npeso;

    private String ffecha;

    private Corte cortefk;

    private Estado estadofk;

    private List<Especialidad> especialidades;

}
