package com.sisgestion_back.sigestion_back.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EstadoRequestDTO {

    private String xNombre;

    private String xSlug;

    private String xResumen;

    private Instant fFechaRegistro;

    private Instant fFechaModificacion;
}
