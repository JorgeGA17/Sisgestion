package com.sisgestion_back.sigestion_back.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JerarquiaResponseDTO {

    private Long jerarquiaPk;
    private String xNombre;
    private Instant fFechaRegistro;
    private Instant fFechaModificacion;

}
