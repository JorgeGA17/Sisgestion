package com.sisgestion_back.sigestion_back.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PeriodoResponseDTO {
    private Long periodoPk;
    private String xNombre;
    private String nEstado;
    private Instant fFechaRegistro;
    private Instant fFechaModificacion;

}
