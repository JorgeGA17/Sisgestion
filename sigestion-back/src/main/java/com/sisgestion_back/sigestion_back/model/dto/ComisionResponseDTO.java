package com.sisgestion_back.sigestion_back.model.dto;

import com.sisgestion_back.sigestion_back.model.entity.Corte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ComisionResponseDTO {

    private Long comisionPk;
    private String xDescripcion;
    private String nEstado;
    private Instant fFechaRegistro;
    private Instant fFechaModificacion;
    private Corte cortefk;
}
